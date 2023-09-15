package main.com.sentinels.model;

import java.util.Date;

public class AssetInventory {
    private int assInvId;
    private int assetId;
    private int userId;
    private String assetName;
    private double lateReturnFee;
    private int numOfDays;
    private int lendingPeriod;
    private Date loanDate;

    // Constructors, getters, and setters

    public AssetInventory() {
    }

    public AssetInventory(int assInvId, int assetId, int userId, String assetName, double lateReturnFee, int numOfDays, int lendingPeriod, Date loanDate) {
        this.assInvId = assInvId;
        this.assetId = assetId;
        this.userId = userId;
        this.assetName = assetName;
        this.lateReturnFee = lateReturnFee;
        this.numOfDays = numOfDays;
        this.lendingPeriod = lendingPeriod;
        this.loanDate = loanDate;
    }

    public int getAssInvId() {
        return assInvId;
    }

    public void setAssInvId(int assInvId) {
        this.assInvId = assInvId;
    }

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public double getLateReturnFee() {
        return lateReturnFee;
    }

    public void setLateReturnFee(double lateReturnFee) {
        this.lateReturnFee = lateReturnFee;
    }

    public int getNumOfDays() {
        return numOfDays;
    }

    public void setNumOfDays(int numOfDays) {
        this.numOfDays = numOfDays;
    }

    public int getLendingPeriod() {
        return lendingPeriod;
    }

    public void setLendingPeriod(int lendingPeriod) {
        this.lendingPeriod = lendingPeriod;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }
}
