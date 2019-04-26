package com.softwire.training.parking;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Floor {

    private int floorNumber;
    private ArrayList<ParkingSpace> parkingSpaces = new ArrayList<>();
    private int capacity;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Collection<ParkingSpace> getParkingSpaces() {
        return parkingSpaces;
    }

    public void addParkingSpace(ParkingSpace parkingSpace) {
        if (!parkingSpaces.contains(parkingSpace)) {
            parkingSpaces.add(parkingSpace);
        }
        capacity = parkingSpaces.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfFreeSpaces() {
        int numberOfFreeSpaces = 0;
        for (ParkingSpace parkingSpace:parkingSpaces) {
            if (parkingSpace.isOccupied()) {
                numberOfFreeSpaces++;
            }
        }
        return numberOfFreeSpaces;
    }

    public ParkingSpace getNearestFreeSpaceForVehicle(Vehicle vehicle) {
        parkingSpaces.sort(Comparator.comparing(ParkingSpace::getId));
        for (ParkingSpace parkingSpace:parkingSpaces) {
            if (!parkingSpace.isOccupied() && parkingSpace.isVehicleAllowed(vehicle)) {
                return parkingSpace;
            }
        }
        return null;
    }
}
