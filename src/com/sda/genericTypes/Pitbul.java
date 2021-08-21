package com.sda.genericTypes;

public class Pitbul extends Dog {

    private int age;

    public Pitbul(String name, int age) {
        super(name);

        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
