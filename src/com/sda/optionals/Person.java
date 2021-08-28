package com.sda.optionals;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void showName() {
        System.out.println(this.name);
    }
}
