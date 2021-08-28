package com.sda.inheritance.exercises;

public class Rectangle extends Shape{
    private double lungime;
    private double latime;

    public Rectangle(double lungime, double latime) {
        super(0, 0);
        this.latime = latime;
        this.lungime = lungime;
    }

    @Override
    public double getArea() {
        return lungime * latime;
    }

    @Override
    public double getPerimeter() {
        return (2 * lungime) + (2 * latime);
    }
}
