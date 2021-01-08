package com.henau.nileigee.domain;

public class CarInfo {
    private int carId;
    private String number;
    private String carColor;
    private int  teamId;
    private String type;
    private int belongCompany;
    private int setnum;
    private int busMasterId;
    private int status;

    public CarInfo() {
    }

    public CarInfo(int carId, String number, String carColor, int teamId, String type, int belongCompany, int setnum, int busMasterId, int status) {
        this.carId = carId;
        this.number = number;
        this.carColor = carColor;
        this.teamId = teamId;
        this.type = type;
        this.belongCompany = belongCompany;
        this.setnum = setnum;
        this.busMasterId = busMasterId;
        this.status = status;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getBelongCompany() {
        return belongCompany;
    }

    public void setBelongCompany(int belongCompany) {
        this.belongCompany = belongCompany;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSetnum() {
        return setnum;
    }

    public void setSetnum(int setnum) {
        this.setnum = setnum;
    }

    public int getBusMasterId() {
        return busMasterId;
    }

    public void setBusMasterId(int busMasterId) {
        this.busMasterId = busMasterId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "carId=" + carId +
                ", number='" + number + '\'' +
                ", carColor='" + carColor + '\'' +
                ", teamId=" + teamId +
                ", type='" + type + '\'' +
                ", belongCompany=" + belongCompany +
                ", setnum=" + setnum +
                ", busMasterId=" + busMasterId +
                ", status=" + status +
                '}';
    }
}
