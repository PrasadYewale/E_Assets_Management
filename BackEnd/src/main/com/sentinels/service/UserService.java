package main.com.sentinels.service;

import main.com.sentinels.exceptions.*;
import main.com.sentinels.model.Asset;
import main.com.sentinels.model.User;

import java.util.List;

public interface UserService {
    User registerUser(User user) throws UserAlreadyExistsException;

    User loginUser(String email, String password) throws UserNotFoundException, AuthenticationException;

    void updateUser(User user) throws UserNotFoundException;

    void deleteUser(int userId) throws UserNotFoundException;

    List<Asset> getBorrowedAssets(int userId);

    void borrowAsset(int userId, int assetId) throws UserNotFoundException, AssetNotFoundException, AssetUnavailableException;

    void returnAsset(int userId, int assetId) throws UserNotFoundException, AssetNotFoundException;
}
