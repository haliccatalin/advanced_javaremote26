package com.sda.annotations;

public class Car extends Vehicle {
    private String brand;
    private String model;
    private int wheels;

    public Car(String brand, String model, int wheels) {
        super("car");

        this.brand = brand;
        this.model = model;
        this.wheels = wheels;
    }

    @Override
    public void printVehicleInfo() {
        System.out.println(this.brand);
        System.out.println(this.model);
        System.out.println(this.wheels);
    }


}
