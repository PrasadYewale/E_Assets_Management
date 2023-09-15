package main.com.sentinels.service;

import main.com.sentinels.dao.AssetDAO;
import main.com.sentinels.dao.AssetInventoryDAO;
import main.com.sentinels.dao.UserDAO;
import main.com.sentinels.exceptions.AssetAlreadyExistsException;
import main.com.sentinels.exceptions.AssetNotFoundException;
import main.com.sentinels.exceptions.UserNotFoundException;
import main.com.sentinels.model.Asset;
import main.com.sentinels.model.User;

import java.util.List;

public class AdminServiceImpl implements AdminService{
    private final AssetDAO assetDAO;
    private final AssetInventoryDAO assetInventoryDAO;
    private final UserDAO userDAO;

    public AdminServiceImpl(AssetDAO assetDAO, AssetInventoryDAO assetInventoryDAO, UserDAO userDAO) {
        this.assetDAO = assetDAO;
        this.assetInventoryDAO = assetInventoryDAO;
        this.userDAO = userDAO;
    }

    @Override
    public void addAsset(Asset asset) throws AssetAlreadyExistsException {
        // using assetDAO to add the asset.
    }

    @Override
    public void updateAsset(Asset asset) throws AssetNotFoundException {

    }

    @Override
    public void removeAsset(int assetId) throws AssetNotFoundException {

    }

    @Override
    public List<Asset> getAllAssets() {
        return null;
    }

    @Override
    public Asset getAssetById(int assetId) throws AssetNotFoundException {
        return null;
    }

    @Override
    public List<Asset> getAssetsByCategory(String category) {
        return null;
    }

    @Override
    public List<Asset> getOverdueAssets() {
        return null;
    }

    @Override
    public User getUserById(int userId) throws UserNotFoundException {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void sendMessageToBorrower(int assetId, String message) throws AssetNotFoundException {
        // using assetInventoryDAO & userDAO to send message to the borrower;
    }
}
