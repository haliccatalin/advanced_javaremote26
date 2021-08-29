package com.sda.exercises.ex1;

public class Person {
    private String name;
    private String email;
    private String phoneNumber;

    public Person() {
        System.out.println("Constructor person");
    }

    public Person ( String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Constructor person");
    }

    public void setInfo(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", email: " + this.email + ", phone: " + this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
