package main.com.sentinels.dao;

import main.com.sentinels.db.DataSourceConnectionFactory;
import main.com.sentinels.exceptions.AssetAlreadyExistsException;
import main.com.sentinels.model.Asset;
import main.com.sentinels.model.Category;
import main.com.sentinels.model.Status;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AssetDAOImpl implements AssetDAO {
    private static final String ADD_ASSET = "INSERT INTO asset (name, description, status, category, ownedBy, bannedPeriod) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String REMOVE_ASSET = "DELETE FROM asset WHERE assetId = ?";
    private static final String UPDATE_ASSET = "UPDATE asset SET name = ?, description = ?, status = ?, category = ?, ownedBy = ?, bannedPeriod = ? WHERE assetId = ?";
    private static final String GET_ASSET_BY_ID = "SELECT * FROM asset WHERE assetId = ?";
    private static final String GET_ALL_ASSETS = "SELECT * FROM asset";
    private static final String GET_ASSETS_BY_CATEGORY = "SELECT * FROM asset WHERE category = ?";

    // Other necessary methods for database connection setup

    @Override
    public boolean assetExists(int assetId) {
        try (Connection connection = DataSourceConnectionFactory.getConnection();
                     PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) FROM asset WHERE assetId = ?")) {

            preparedStatement.setInt(1, assetId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle or log the exception
        }
        return false;
    }

    @Override
    public Asset addAsset(Asset asset) throws AssetAlreadyExistsException {
        if (assetExists(asset.getAssetId())) {
            throw new AssetAlreadyExistsException(asset.getAssetId());
        }
        try (Connection connection = DataSourceConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(ADD_ASSET, PreparedStatement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setString(1, asset.getAssetName());
            preparedStatement.setString(2, asset.getDescription());
            preparedStatement.setString(3, asset.getStatus().name());
            preparedStatement.setString(4, asset.getCategory().name());
            preparedStatement.setString(5, asset.getOwnedBy());
            preparedStatement.setInt(6, asset.getBannedPeriod());

            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Adding asset failed, no rows affected.");
            }

            try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    asset.setAssetId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Adding asset failed, no ID obtained.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle and log the exception
        }

        return asset;
    }

    @Override
    public void removeAsset(int assetId) {
        try (Connection connection = DataSourceConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(REMOVE_ASSET)) {

            preparedStatement.setInt(1, assetId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle and log the exception
        }
    }

    @Override
    public Asset updateAsset(Asset asset) {
        try (Connection connection = DataSourceConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_ASSET)) {

            preparedStatement.setString(1, asset.getAssetName());
            preparedStatement.setString(2, asset.getDescription());
            preparedStatement.setString(3, asset.getStatus().name());
            preparedStatement.setString(4, asset.getCategory().name());
            preparedStatement.setString(5, asset.getOwnedBy());
            preparedStatement.setInt(6, asset.getBannedPeriod());
            preparedStatement.setInt(7, asset.getAssetId());

            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Updating asset failed, no rows affected.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle and log the exception
        }

        return asset;
    }

    @Override
    public Asset getAssetById(int assetId) {
        Asset asset = null;
        try (Connection connection = DataSourceConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_ASSET_BY_ID)) {

            preparedStatement.setInt(1, assetId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    asset = createAssetFromResultSet(resultSet);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle and log the exception
        }

        return asset;
    }

    @Override
    public List<Asset> getAllAssets() {
        List<Asset> assets = new ArrayList<>();
        try (Connection connection = DataSourceConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_ASSETS);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                assets.add(createAssetFromResultSet(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle and log the exception
        }

        return assets;
    }

    @Override
    public List<Asset> getAssetsByCategory(String category) {
        List<Asset> assets = new ArrayList<>();
        try (Connection connection = DataSourceConnectionFactory.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_ASSETS_BY_CATEGORY)) {

            preparedStatement.setString(1, category);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    assets.add(createAssetFromResultSet(resultSet));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return assets;
    }

    private Asset createAssetFromResultSet(ResultSet resultSet) throws SQLException {
        Asset asset = new Asset();
        asset.setAssetId(resultSet.getInt("assetId"));
        asset.setAssetName(resultSet.getString("name"));
        asset.setDescription(resultSet.getString("description"));
        asset.setStatus(Status.valueOf(resultSet.getString("status")));
        asset.setCategory(Category.valueOf(resultSet.getString("category")));
        asset.setOwnedBy(resultSet.getString("ownedBy"));
        asset.setBannedPeriod(resultSet.getInt("bannedPeriod"));
        return asset;
    }
}
