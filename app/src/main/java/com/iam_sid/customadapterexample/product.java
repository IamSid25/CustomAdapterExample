package com.iam_sid.customadapterexample;

public class product{
    int imgId;
    String mobName,camMP;

    public product(int imgId, String mobName, String camMP) {
        this.imgId = imgId;
        this.mobName = mobName;
        this.camMP = camMP;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getMobName() {
        return mobName;
    }

    public void setMobName(String mobName) {
        this.mobName = mobName;
    }

    public String getCamMP() {
        return camMP;
    }

    public void setCamMP(String camMP) {
        this.camMP = camMP;
    }
}
