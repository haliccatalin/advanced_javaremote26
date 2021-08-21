package com.sda.genericTypes.exercices;

public class Person implements Comparable <Person>{
    private double height;
    private String name;

    public Person(double height, String name) {
        this.height = height;
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person person) {
//        return (int) (this.height - person.getHeight());
        double result = this.height - person.getHeight();
        if(result < 0){
            System.out.println(person.getName() + " is taller");
            return -1;
        }else if( result == 0){
            System.out.println("Have the same height");
            return 0;
        }else{
            System.out.println(this.name + " is taller");
            return 1;
        }
    }
}