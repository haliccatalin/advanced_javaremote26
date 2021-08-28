package com.sda.inheritance.exercises;

public class Circle extends Shape {
    private double raza;

    public Circle(double raza) {
        super(0, 0);
        this.raza = raza;
    }

    @Override
    public double getArea() {
        return Math.PI * raza * raza;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * raza;
    }
}
