package main.com;

import main.com.sentinels.service.UserImportService;

public class Application {
    public static void main(String[] args) {
        try {
            String jsonFilePath = "src/resources/users.json";
            UserImportService userImportService = new UserImportService();
            int importedUsers = userImportService.importUsersFromJSON(jsonFilePath);
            System.out.println(importedUsers + " users successfully imported.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}