package main.com.sentinels.service;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

import main.com.sentinels.db.DataSourceConnectionFactory;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Pattern;

public class UserImportService {
    public int importUsersFromJSON(String jsonFilePath) throws IOException,SQLException {
        int successfullyImportedUsers = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(jsonFilePath));
             Connection connection = DataSourceConnectionFactory.getConnection()) {
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonContent.append(line);
            }

            JsonArray userArray = new JsonArray(jsonContent.toString());

            for (int i = 0; i < userArray.length(); i++) {
                JSONObject userJson = userArray.getJSONObject(i);

                // Validate email and telephone format
                String email = userJson.getString("email");
                String telephone = userJson.getString("phoneNumber");

                if (isValidEmail(email) && isValidTelephone(telephone)) {
                    // Insert user data into the database
                    insertUserIntoDatabase(connection,userJson);
                    successfullyImportedUsers++;
                }
            }
        }
    
        return successfullyImportedUsers    ;
    }
    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return Pattern.matches(emailRegex, email);
    }

    private boolean isValidTelephone(String telephone) {
        String phoneRegex = "^[0-9]{10}$";
        return Pattern.matches(phoneRegex, telephone);
    }

    private void insertUserIntoDatabase(Connection connection,JSONObject userJson) throws SQLException {
        String insertSQL = "INSERT INTO user (name, role, phoneNumber, email, password) " +
                "VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, userJson.getString("name"));
            preparedStatement.setString(2, userJson.getString("role"));
            preparedStatement.setDouble(3, userJson.getDouble("phoneNumber"));
            preparedStatement.setString(4, userJson.getString("email"));
            preparedStatement.setString(5, userJson.getString("password"));

            preparedStatement.executeUpdate();
        }
    }
}

