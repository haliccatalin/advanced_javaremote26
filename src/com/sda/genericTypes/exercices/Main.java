package com.sda.genericTypes.exercices;

public class Main {
//    Create a Person class that will implement a Comparable interface.
//    Person class should implement compareTo method, that will verify if one
//    person is taller than another.

    public static void main(String[] args) {

        Person person1 = new Person(1.45, "Andrei");
        Person person2 = new Person(1.45, "Cristi");

        int result = person1.compareTo(person2);
        System.out.println(result);
    }
}