package com.softwire.training.parking;

public class Vehicle {

    private Type type;
    private String registration;
    double height;
    double width;

    public Vehicle(Type type, String registration, double height, double width) {
        this.type = type;
        this.registration = registration;
        this.height = height;
        this.width = width;
    }

    public Type getType() {
        return type;
    }

    public String getRegistration() {
        return registration;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public enum Type {
        CAR,
        MOTORCYCLE,
        VAN,
    }
}
