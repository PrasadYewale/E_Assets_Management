package main.com.sentinels.model;

public class Asset {
    private String assetName;
    private int assetId;
    private String description;
    private int bannedPeriod;
    private Status status;
    private String ownedBy;
    private Category category;


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getOwnedBy() {
        return ownedBy;
    }

    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBannedPeriod() {
        return bannedPeriod;
    }

    public void setBannedPeriod(int bannedPeriod) {
        this.bannedPeriod = bannedPeriod;
    }
}
