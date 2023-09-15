package main.com.sentinels.service;

import main.com.sentinels.dao.AssetDAO;
import main.com.sentinels.dao.AssetInventoryDAO;
import main.com.sentinels.dao.UserDAO;
import main.com.sentinels.exceptions.*;
import main.com.sentinels.model.Asset;
import main.com.sentinels.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;
    private final AssetDAO assetDAO;
    private final AssetInventoryDAO assetInventoryDAO;

    public UserServiceImpl(UserDAO userDAO, AssetDAO assetDAO, AssetInventoryDAO assetInventoryDAO) {
        this.userDAO = userDAO;
        this.assetDAO = assetDAO;
        this.assetInventoryDAO = assetInventoryDAO;
    }

    @Override
    public User registerUser(User user) throws UserAlreadyExistsException {
        return null;
    }

    @Override
    public User loginUser(String email, String password) throws UserNotFoundException, AuthenticationException {
        return null;
    }

    @Override
    public void updateUser(User user) throws UserNotFoundException {

    }

    @Override
    public void deleteUser(int userId) throws UserNotFoundException {

    }

    @Override
    public List<Asset> getBorrowedAssets(int userId) {
        // using assetInventoryDAO to retrieve borrowed assets by user ID.
        return null;
    }

    @Override
    public void borrowAsset(int userId, int assetId) throws UserNotFoundException, AssetNotFoundException, AssetUnavailableException {
        // using userDAO, assetDAO and assetInventoryDAO to borrow an asset.
    }

    @Override
    public void returnAsset(int userId, int assetId) throws UserNotFoundException, AssetNotFoundException {
        // using userDAO, assetDAO and assetInventoryDAO to return an asset.
    }
}

