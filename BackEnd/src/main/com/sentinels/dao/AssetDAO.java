package main.com.sentinels.dao;

import main.com.sentinels.exceptions.AssetAlreadyExistsException;
import main.com.sentinels.model.Asset;

import java.util.List;

public interface AssetDAO {

    boolean assetExists(int assetId);

    Asset addAsset(Asset asset) throws AssetAlreadyExistsException;

    void removeAsset(int assetId);

    Asset updateAsset(Asset asset);

    Asset getAssetById(int assetId);

    List<Asset> getAllAssets();

    List<Asset> getAssetsByCategory(String category);
}
