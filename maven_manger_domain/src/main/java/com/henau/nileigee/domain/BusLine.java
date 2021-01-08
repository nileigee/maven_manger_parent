package com.henau.nileigee.domain;

public class BusLine {
    private int lineId;
    private String lineName;
    private int comNumber;
    private String lineType;
    private int upLength;
    private int downLength;
    private String upStartTime;
    private String upOverTime;
    private String downStartTime;
    private String downOverTime;
    private int status;

    public BusLine() {
    }

    public BusLine(int lineId, String lineName, int comNumber, String lineType, int upLength, int downLength, String upStartTime, String upOverTime, String downStartTime, String downOverTime, int status) {
        this.lineId = lineId;
        this.lineName = lineName;
        this.comNumber = comNumber;
        this.lineType = lineType;
        this.upLength = upLength;
        this.downLength = downLength;
        this.upStartTime = upStartTime;
        this.upOverTime = upOverTime;
        this.downStartTime = downStartTime;
        this.downOverTime = downOverTime;
        this.status = status;
    }

    public int getLineId() {
        return lineId;
    }

    public void setLineId(int lineId) {
        this.lineId = lineId;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public int getComNumber() {
        return comNumber;
    }

    public void setComNumber(int comNumber) {
        this.comNumber = comNumber;
    }

    public String getLineType() {
        return lineType;
    }

    public void setLineType(String lineType) {
        this.lineType = lineType;
    }

    public int getUpLength() {
        return upLength;
    }

    public void setUpLength(int upLength) {
        this.upLength = upLength;
    }

    public int getDownLength() {
        return downLength;
    }

    public void setDownLength(int downLength) {
        this.downLength = downLength;
    }

    public String getUpStartTime() {
        return upStartTime;
    }

    public void setUpStartTime(String upStartTime) {
        this.upStartTime = upStartTime;
    }

    public String getUpOverTime() {
        return upOverTime;
    }

    public void setUpOverTime(String upOverTime) {
        this.upOverTime = upOverTime;
    }

    public String getDownStartTime() {
        return downStartTime;
    }

    public void setDownStartTime(String downStartTime) {
        this.downStartTime = downStartTime;
    }

    public String getDownOverTime() {
        return downOverTime;
    }

    public void setDownOverTime(String downOverTime) {
        this.downOverTime = downOverTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BusLine{" +
                "lineId=" + lineId +
                ", lineName='" + lineName + '\'' +
                ", comNumber=" + comNumber +
                ", lineType='" + lineType + '\'' +
                ", upLength=" + upLength +
                ", downLength=" + downLength +
                ", upStartTime='" + upStartTime + '\'' +
                ", upOverTime='" + upOverTime + '\'' +
                ", downStartTime='" + downStartTime + '\'' +
                ", downOverTime='" + downOverTime + '\'' +
                ", status=" + status +
                '}';
    }
}

