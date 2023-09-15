package main.com.sentinels.dao;

import main.com.sentinels.db.DataSourceConnectionFactory;
import main.com.sentinels.model.AssetInventory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AssetInventoryDAOImpl implements AssetInventoryDAO {
    private static final String BORROW_ASSET = "INSERT INTO assetInventory (assetId, userId, assetName, lateReturnFee, numOfDays, lendingPeriod) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String RETURN_ASSET = "DELETE FROM assetInventory WHERE assInvId = ?";
    private static final String GET_ASSET_INVENTORY_BY_ID = "SELECT * FROM assetInventory WHERE assInvId = ?";
    private static final String GET_ASSETS_BORROWED_BY_USER = "SELECT * FROM assetInventory WHERE userId = ?";
    private static final String GET_OVERDUE_ASSETS = "SELECT * FROM assetInventory WHERE DATE_ADD(loanDate, INTERVAL lendingPeriod DAY) < NOW()";

    // Other necessary methods for database connection setup

    @Override
    public AssetInventory borrowAsset(AssetInventory assetInventory) throws SQLException {
        try (Connection connection = DataSourceConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(BORROW_ASSET, PreparedStatement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setInt(1, assetInventory.getAssetId());
            preparedStatement.setInt(2, assetInventory.getUserId());
            preparedStatement.setString(3, assetInventory.getAssetName());
            preparedStatement.setDouble(4, assetInventory.getLateReturnFee());
            preparedStatement.setInt(5, assetInventory.getNumOfDays());
            preparedStatement.setInt(6, assetInventory.getLendingPeriod());

            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Borrowing asset failed, no rows affected.");
            }

            try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    assetInventory.setAssInvId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Borrowing asset failed, no ID obtained.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle and log the exception
        }

        return assetInventory;
    }

    @Override
    public AssetInventory returnAsset(int assetInventoryId) {
        AssetInventory assetInventory = getAssetInventoryById(assetInventoryId);
        if (assetInventory != null) {
            try (Connection connection = DataSourceConnectionFactory.getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(RETURN_ASSET)) {

                preparedStatement.setInt(1, assetInventoryId);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
                // Handle and log the exception
            }
        }
        return assetInventory;
    }

    @Override
    public AssetInventory getAssetInventoryById(int assetInventoryId) {
        AssetInventory assetInventory = null;
        try (Connection connection = DataSourceConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_ASSET_INVENTORY_BY_ID)) {

            preparedStatement.setInt(1, assetInventoryId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    assetInventory = createAssetInventoryFromResultSet(resultSet);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle and log the exception
        }
        return assetInventory;
    }

    @Override
    public List<AssetInventory> getAssetsBorrowedByUser(int userId) {
        List<AssetInventory> assetInventories = new ArrayList<>();
        try (Connection connection = DataSourceConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_ASSETS_BORROWED_BY_USER)) {

            preparedStatement.setInt(1, userId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    assetInventories.add(createAssetInventoryFromResultSet(resultSet));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle and log the exception
        }
        return assetInventories;
    }

    @Override
    public List<AssetInventory> getOverdueAssets() {
        List<AssetInventory> overdueAssets = new ArrayList<>();
        try (Connection connection = DataSourceConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_OVERDUE_ASSETS);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                overdueAssets.add(createAssetInventoryFromResultSet(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle and log the exception
        }
        return overdueAssets;
    }

    private AssetInventory createAssetInventoryFromResultSet(ResultSet resultSet) throws SQLException {
        AssetInventory assetInventory = new AssetInventory();
        assetInventory.setAssInvId(resultSet.getInt("assInvId"));
        assetInventory.setAssetId(resultSet.getInt("assetId"));
        assetInventory.setUserId(resultSet.getInt("userId"));
        assetInventory.setAssetName(resultSet.getString("assetName"));
        assetInventory.setLateReturnFee(resultSet.getDouble("lateReturnFee"));
        assetInventory.setNumOfDays(resultSet.getInt("numOfDays"));
        assetInventory.setLendingPeriod(resultSet.getInt("lendingPeriod"));
        // Set other fields as needed
        return assetInventory;
    }
}
