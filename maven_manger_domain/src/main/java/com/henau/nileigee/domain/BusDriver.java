package com.henau.nileigee.domain;

public class BusDriver {
    private int drId;
    private String drName;
    private String drTel;
    private int status;

    public BusDriver(int drId, String drName, String drTel, int status) {
        this.drId = drId;
        this.drName = drName;
        this.drTel = drTel;
        this.status = status;
    }

    public BusDriver() {
    }

    public int getDrId() {
        return drId;
    }

    public void setDrId(int drId) {
        this.drId = drId;
    }

    public String getDrName() {
        return drName;
    }

    public void setDrName(String drName) {
        this.drName = drName;
    }

    public String getDrTel() {
        return drTel;
    }

    public void setDrTel(String drTel) {
        this.drTel = drTel;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BusDriver{" +
                "drId=" + drId +
                ", drName='" + drName + '\'' +
                ", drTel='" + drTel + '\'' +
                ", status=" + status +
                '}';
    }
}
