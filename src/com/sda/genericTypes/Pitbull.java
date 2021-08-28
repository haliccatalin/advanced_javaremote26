package com.sda.genericTypes;

public class Pitbull extends Dog {

    private int age;

    public Pitbull(String name, int age) {
        super(name);

        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
