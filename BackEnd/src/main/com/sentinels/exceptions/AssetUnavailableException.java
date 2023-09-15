package main.com.sentinels.exceptions;

public class AssetUnavailableException extends Exception {
    private int assetId;

    public AssetUnavailableException(int assetId) {
        super("Asset with ID " + assetId + " is unavailable.");
        this.assetId = assetId;
    }

    public int getAssetId() {
        return assetId;
    }
}
