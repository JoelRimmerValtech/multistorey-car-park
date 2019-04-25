package com.softwire.training.parking;

public class ParkingSpace {

    private int id;
    private double maxHeight;
    private double maxWidth;
    private Vehicle.Type typeRestriction;

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
        // TODO - replace this!
    }

    public void vacate() {
        // TODO - replace this!
    }

    public Vehicle getParkedVehicle() {
        // TODO - replace this!
        return null;
    }

    public boolean isOccupied() {
        // TODO - replace this!
        return false;
    }
}
