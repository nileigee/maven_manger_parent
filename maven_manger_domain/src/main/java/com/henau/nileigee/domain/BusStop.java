package com.henau.nileigee.domain;

public class BusStop {
    private int stopId;
    private String stopName;
    private String stopDirection;
    private String stopType;
    private double arrivalLongitude;
    private double arrivalLatitude;
    private double stopLongitude;
    private double stopLatitude;
    private double exitLongitude;
    private double exitLatitude;
    private int stopSpeed;
    private String stopProvince;
    private String stopCity;
    private int stopAreaId;
    private int stopStatus;
    private String stopText;
    private int stopXuni;

    public BusStop() {
    }

    public BusStop(int stopId, String stopName, String stopDirection, String stopType, double arrivalLongitude, double arrivalLatitude, double stopLongitude, double stopLatitude, double exitLongitude, double exitLatitude, int stopSpeed, String stopProvince, String stopCity, int stopAreaId, int stopStatus, String stopText, int stopXuni) {
        this.stopId = stopId;
        this.stopName = stopName;
        this.stopDirection = stopDirection;
        this.stopType = stopType;
        this.arrivalLongitude = arrivalLongitude;
        this.arrivalLatitude = arrivalLatitude;
        this.stopLongitude = stopLongitude;
        this.stopLatitude = stopLatitude;
        this.exitLongitude = exitLongitude;
        this.exitLatitude = exitLatitude;
        this.stopSpeed = stopSpeed;
        this.stopProvince = stopProvince;
        this.stopCity = stopCity;
        this.stopAreaId = stopAreaId;
        this.stopStatus = stopStatus;
        this.stopText = stopText;
        this.stopXuni = stopXuni;
    }

    public int getStopId() {
        return stopId;
    }

    public void setStopId(int stopId) {
        this.stopId = stopId;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public String getStopDirection() {
        return stopDirection;
    }

    public void setStopDirection(String stopDirection) {
        this.stopDirection = stopDirection;
    }

    public String getStopType() {
        return stopType;
    }

    public void setStopType(String stopType) {
        this.stopType = stopType;
    }

    public double getArrivalLongitude() {
        return arrivalLongitude;
    }

    public void setArrivalLongitude(double arrivalLongitude) {
        this.arrivalLongitude = arrivalLongitude;
    }

    public double getArrivalLatitude() {
        return arrivalLatitude;
    }

    public void setArrivalLatitude(double arrivalLatitude) {
        this.arrivalLatitude = arrivalLatitude;
    }

    public double getStopLongitude() {
        return stopLongitude;
    }

    public void setStopLongitude(double stopLongitude) {
        this.stopLongitude = stopLongitude;
    }

    public double getStopLatitude() {
        return stopLatitude;
    }

    public void setStopLatitude(double stopLatitude) {
        this.stopLatitude = stopLatitude;
    }

    public double getExitLongitude() {
        return exitLongitude;
    }

    public void setExitLongitude(double exitLongitude) {
        this.exitLongitude = exitLongitude;
    }

    public double getExitLatitude() {
        return exitLatitude;
    }

    public void setExitLatitude(double exitLatitude) {
        this.exitLatitude = exitLatitude;
    }

    public int getStopSpeed() {
        return stopSpeed;
    }

    public void setStopSpeed(int stopSpeed) {
        this.stopSpeed = stopSpeed;
    }

    public String getStopProvince() {
        return stopProvince;
    }

    public void setStopProvince(String stopProvince) {
        this.stopProvince = stopProvince;
    }

    public String getStopCity() {
        return stopCity;
    }

    public void setStopCity(String stopCity) {
        this.stopCity = stopCity;
    }

    public int getStopAreaId() {
        return stopAreaId;
    }

    public void setStopAreaId(int stopAreaId) {
        this.stopAreaId = stopAreaId;
    }

    public int getStopStatus() {
        return stopStatus;
    }

    public void setStopStatus(int stopStatus) {
        this.stopStatus = stopStatus;
    }

    public String getStopText() {
        return stopText;
    }

    public void setStopText(String stopText) {
        this.stopText = stopText;
    }

    public int getStopXuni() {
        return stopXuni;
    }

    public void setStopXuni(int stopXuni) {
        this.stopXuni = stopXuni;
    }

    @Override
    public String toString() {
        return "BusStop{" +
                "stopId=" + stopId +
                ", stopName='" + stopName + '\'' +
                ", stopDirection='" + stopDirection + '\'' +
                ", stopType='" + stopType + '\'' +
                ", arrivalLongitude=" + arrivalLongitude +
                ", arrivalLatitude=" + arrivalLatitude +
                ", stopLongitude=" + stopLongitude +
                ", stopLatitude=" + stopLatitude +
                ", exitLongitude=" + exitLongitude +
                ", exitLatitude=" + exitLatitude +
                ", stopSpeed=" + stopSpeed +
                ", stopProvince='" + stopProvince + '\'' +
                ", stopCity='" + stopCity + '\'' +
                ", stopAreaId=" + stopAreaId +
                ", stopStatus=" + stopStatus +
                ", stopText='" + stopText + '\'' +
                ", stopXuni=" + stopXuni +
                '}';
    }
}
