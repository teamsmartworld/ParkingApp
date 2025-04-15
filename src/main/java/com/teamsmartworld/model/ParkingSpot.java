package com.teamsmartworld.model;

public class ParkingSpot {

    //Fields
    private Integer spotNumber;
    private Integer areaCode;
    private  boolean occupied;


    //Constructors

    public ParkingSpot(Integer spotNumber, Integer areaCode) {
        this.spotNumber = spotNumber;
        this.areaCode = areaCode;
        this.occupied = true;
    }

    //Methods, Getters and Setters

    public Integer getSpotNumber() {
        // todo: add validation
        return spotNumber;
    }

    public void setSpotNumber(Integer spotNumber) {
        this.spotNumber = spotNumber;
    }

    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void occupy() {
        this.occupied = true;
    }
    public void vacate() {
        this.occupied = false;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "spotNumber=" + spotNumber +
                ", areaCode=" + areaCode +
                ", occupied=" + occupied +
                '}';
    }
}
