package com.sda;

public class Main {

    // Principii OOP
//    1. Incapsulare
//    2. Mostenire
//    3. Abstractizare
//    4. Polimorfism

    public static void main(String[] args) {
	// write your code here

        // new -> aloca un spatiu nou in memorie
        // new -> apelam constructorul clasei
        Car car = new Car("RED", "OPEL", 4);

        Car car2 = new Car();
        car2.setColor("Blue");
        car2.setBrand("Dacia");
        car2.setWheels(4);

//        NU ESTE OK!!!
//        car.color = "RED";

        car.setWheels(6);
        int wheels = car.getWheels();
        System.out.println("Numarul de roti este: " + wheels);
    }
}
