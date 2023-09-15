package main.com.sentinels.dao;

import main.com.sentinels.exceptions.UserAlreadyExistsException;
import main.com.sentinels.model.User;

import java.util.List;

public interface UserDAO {
    User getUserById(int userId);
    List<User> getAllUsers();

    boolean userExists(int userId);

    User addUser(User user) throws UserAlreadyExistsException;
    User updateUser(User user);
    void deleteUser(int userId);
}
