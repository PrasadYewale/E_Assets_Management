package main.com.sentinels.exceptions;

public class UserAlreadyExistsException extends Exception {
    private int userId;
    public UserAlreadyExistsException(int userId) {
        super("User with ID " + userId + " already exists.");
        this.userId = userId;
    }
    public int getUserId() {
        return userId;
    }
}
