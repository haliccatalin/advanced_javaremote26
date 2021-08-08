package com.sda.inheritance;

// FIECARE CLASA DIN JAVA MOSTENESTE (EXTINDE) PRIN DEFINITIE CLASA OBJECT!!!
// O CLASA PARINTE, POATEA AVEA O INFINITATE DE CLASE COPII!!
public class Person {
    private String firstName;
    private String lastName;
    private String phone;

    public Person(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public void printPhone() {
        System.out.println("Cod din clasa parinte");

        System.out.println("Person: " + this.phone);
    }

    public String getPhone() {
        return this.phone;
    }

    public String getFirstName() {
        return this.firstName;
    }


    @Override
    public String toString() {
        return "First Name: " + this.firstName + ", Last Name: " + this.lastName + ", Phone: " + this.phone;
    }

}
