package main.com.sentinels.exceptions;

public class AssetAlreadyExistsException extends Exception {
    private int assetId;
    public AssetAlreadyExistsException(int assetId) {
        super("Asset with ID " + assetId + " already exists.");
        this.assetId = assetId;
    }
    public int getAssetId() {
        return assetId;
    }
}
