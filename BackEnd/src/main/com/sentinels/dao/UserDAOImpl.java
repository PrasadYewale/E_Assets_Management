package main.com.sentinels.dao;

import main.com.sentinels.db.DataSourceConnectionFactory;
import main.com.sentinels.exceptions.UserAlreadyExistsException;
import main.com.sentinels.model.Role;
import main.com.sentinels.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    private static final String GET_USER_BY_ID = "SELECT * FROM user WHERE userId = ?";
    private static final String GET_ALL_USERS = "SELECT * FROM user";
    private static final String ADD_USER = "INSERT INTO user (name, role, phoneNumber, email, password) VALUES (?, ?, ?, ?, ?)";
    private static final String UPDATE_USER = "UPDATE user SET name = ?, role = ?, phoneNumber = ?, email = ?, password = ? WHERE userId = ?";
    private static final String DELETE_USER = "DELETE FROM user WHERE userId = ?";

    @Override
    public User getUserById(int userId) {
        try (Connection connection = DataSourceConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_USER_BY_ID)) {

            preparedStatement.setInt(1, userId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return createUserFromResultSet(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try (Connection connection = DataSourceConnectionFactory.getConnection();
             Statement statement = connection.createStatement()) {

            ResultSet resultSet = statement.executeQuery(GET_ALL_USERS);

            while (resultSet.next()) {
                users.add(createUserFromResultSet(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public boolean userExists(int userId) {
        try (Connection connection = DataSourceConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM user WHERE userId = ?")) {

            preparedStatement.setInt(1, userId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle or log the exception
        }
        return false;
    }
    @Override
    public User addUser(User user) throws UserAlreadyExistsException {
        if (userExists(user.getUserId())) {
            throw new UserAlreadyExistsException(user.getUserId());
        }
        try (Connection connection = DataSourceConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(ADD_USER, Statement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getRole().name());
            preparedStatement.setDouble(3, user.getPhoneNumber());
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setString(5, user.getPassword());

            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Creating user failed, no rows affected.");
            }

            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                user.setUserId(generatedKeys.getInt(1));
            } else {
                throw new SQLException("Creating user failed, no ID obtained.");
            }
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User updateUser(User user) {
        try (Connection connection = DataSourceConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER)) {

            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getRole().name());
            preparedStatement.setDouble(3, user.getPhoneNumber());
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setString(5, user.getPassword());
            preparedStatement.setInt(6, user.getUserId());

            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Updating user failed, no rows affected.");
            }

            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteUser(int userId) {
        try (Connection connection = DataSourceConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER)) {

            preparedStatement.setInt(1, userId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private User createUserFromResultSet(ResultSet resultSet) throws SQLException {
        User user = new User();
        user.setUserId(resultSet.getInt("userId"));
        user.setName(resultSet.getString("name"));
        user.setRole(Role.valueOf(resultSet.getString("role")));
        user.setPhoneNumber(resultSet.getDouble("phoneNumber"));
        user.setEmail(resultSet.getString("email"));
        user.setPassword(resultSet.getString("password"));
        return user;
    }
}
