package main.com.sentinels.dao;

import main.com.sentinels.model.AssetInventory;

import java.sql.SQLException;
import java.util.List;

public interface AssetInventoryDAO {
    AssetInventory borrowAsset(AssetInventory assetInventory) throws SQLException;

    AssetInventory returnAsset(int assetInventoryId) throws SQLException;

    AssetInventory getAssetInventoryById(int assetInventoryId) throws SQLException;

    List<AssetInventory> getAssetsBorrowedByUser(int userId) throws SQLException;

    List<AssetInventory> getOverdueAssets() throws SQLException;
}
