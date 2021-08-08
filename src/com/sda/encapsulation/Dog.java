package com.sda.encapsulation;

public class Dog {
    private String name;
    private int age;
    private String gender;
    private String race;
    private double weight;

    public Dog(String name, int age, String gender, String race, double weight)  {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    public Dog(String gender, String race) {
        // apelam primul constructor din clasa Dog
        this("Rex", 1, gender, race, 25.3);
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if (age < 0 || age > 20 ){
            System.out.println("Age not accepted");
        }else {
            this.age = age;
        }
    }

    public double getWeight() {
        return this.weight;
    }
    public void setWeight(double weight) {
        if (weight <= 0 ){
            System.out.println("Weight not accepted");
        }else {
            this.weight = weight;
        }
    }

    public void showDog() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Race: " + this.race);
        System.out.println("Weight: " + this.weight);
    }

}
