package com.softwire.training.parking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class MultiStorey {

    private ArrayList<Floor> multiStoreyLevels;

    public MultiStorey(Collection<Floor> floors) {
        this.multiStoreyLevels = new ArrayList<>(floors);
    }

    public MultiStorey(Floor... floors) {
        this(Arrays.asList(floors));
    }

    public Collection<Floor> getFloors() {
        return multiStoreyLevels;
    }

    public ParkingSpace getNearestSpaceForVehicle(Vehicle vehicle) {
        multiStoreyLevels.sort(Comparator.comparing(Floor::getFloorNumber));
        for (Floor floor:multiStoreyLevels) {
            if (floor.getNearestFreeSpaceForVehicle(vehicle) != null) {
                return floor.getNearestFreeSpaceForVehicle(vehicle);
            }
        }
        return null;
    }

    public ParkingSpace getSpaceContainingVehicleWithRegistration(String registration) {
        // TODO - replace this!
        return null;
    }
}
