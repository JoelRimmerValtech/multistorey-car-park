package com.softwire.training.parking;

public class ParkingSpace {

    private int id;
    private double maxHeight;
    private double maxWidth;
    private Vehicle.Type typeRestriction;
    private Vehicle parkedVehicle;

    public ParkingSpace(int id, double maxHeight, double maxWidth) {
        this.id = id;
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
    }

    public ParkingSpace(int id, double maxHeight, double maxWidth, Vehicle.Type typeRestriction) {
        this.id = id;
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
        this.typeRestriction = typeRestriction;
    }

    public int getId() {
        return id;
    }

    public boolean isVehicleAllowed(Vehicle vehicle) {
        if (vehicle.getHeight() <= maxHeight && vehicle.getWidth() <= maxWidth && (typeRestriction == null || vehicle.getType() == typeRestriction)) {
            return true;
        }
        else return false;
    }

    public void parkVehicle(Vehicle vehicle) throws IllegalArgumentException, IllegalStateException {

        if (!isVehicleAllowed(vehicle)) {
            throw new IllegalArgumentException("Vehicle not allowed in space");
        }

        if (isOccupied()) {
            throw new IllegalStateException("Space already occupied");
        }

        parkedVehicle = vehicle;
    }

    public void vacate() {
        parkedVehicle = null;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public boolean isOccupied() {
        if (parkedVehicle == null) {
            return false;
        } else return true;
    }
}
