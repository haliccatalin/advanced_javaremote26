package com.sda.genericTypes;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void printDogName() {
        System.out.println("Dog name: " + this.name);
    }
}
