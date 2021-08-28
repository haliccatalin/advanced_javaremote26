package com.sda.inheritance.exercises;

/*
Create a Shape class

a)Add fields , create constructor , getters and setters

b)Create classes Rectangle and Circle . Both of them should inherit class Shape .
Which fields and methods are common
 */
public abstract class Shape {
    private double area;
    private double perimeter;

    public Shape(double area, double perimeter){
        this.area = area;
        this.perimeter = perimeter;
    }

    public abstract double getArea() ;

    public abstract double getPerimeter();

    public void setArea(double area){
        this.area = area;
    }

    public void setPerimeter(double perimeter){
        this.perimeter=perimeter;
    }
}
