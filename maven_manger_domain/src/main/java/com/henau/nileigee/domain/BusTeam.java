package com.henau.nileigee.domain;

public class BusTeam {
    private int busId;
    private String carName;
    private int administratorId;
    private int comNumber;
    private int lineId;

    public BusTeam() {
    }

    public BusTeam(int busId, String carName, int administratorId, int comNumber, int lineId) {
        this.busId = busId;
        this.carName = carName;
        this.administratorId = administratorId;
        this.comNumber = comNumber;
        this.lineId = lineId;
    }

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(int administratorId) {
        this.administratorId = administratorId;
    }

    public int getComNumber() {
        return comNumber;
    }

    public void setComNumber(int comNumber) {
        this.comNumber = comNumber;
    }

    public int getLineId() {
        return lineId;
    }

    public void setLineId(int lineId) {
        this.lineId = lineId;
    }

    @Override
    public String toString() {
        return "BusTeam{" +
                "busId=" + busId +
                ", carName='" + carName + '\'' +
                ", administratorId=" + administratorId +
                ", comNumber=" + comNumber +
                ", lineId=" + lineId +
                '}';
    }
}
