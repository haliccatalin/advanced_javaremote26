package com.sda.annotations;

public class Vehicle {
    private String vehicleType;

    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void printVehicleInfo() {
        System.out.println("Vehicle: " + this.vehicleType);
    }
}
