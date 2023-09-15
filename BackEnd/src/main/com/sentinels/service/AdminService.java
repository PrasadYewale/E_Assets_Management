package main.com.sentinels.service;

import main.com.sentinels.exceptions.AssetAlreadyExistsException;
import main.com.sentinels.exceptions.AssetNotFoundException;
import main.com.sentinels.exceptions.UserNotFoundException;
import main.com.sentinels.model.Asset;
import main.com.sentinels.model.User;

import java.util.List;

public interface AdminService {
    void addAsset(Asset asset) throws AssetAlreadyExistsException;

    void updateAsset(Asset asset) throws AssetNotFoundException;

    void removeAsset(int assetId) throws AssetNotFoundException;

    List<Asset> getAllAssets();

    Asset getAssetById(int assetId) throws AssetNotFoundException;

    List<Asset> getAssetsByCategory(String category);

    List<Asset> getOverdueAssets();

    User getUserById(int userId) throws UserNotFoundException;

    List<User> getAllUsers();

    void sendMessageToBorrower(int assetId, String message) throws AssetNotFoundException;
}

