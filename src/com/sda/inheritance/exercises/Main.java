package com.sda.inheritance.exercises;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[]{new Dog(), new Cat(), new Dog()};
        for(Animal animal : animals){
            System.out.println(animal.getClass().getSimpleName());
            animal.yieldVoice();
        }

        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(2, 5);

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());



    }
}
