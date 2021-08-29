package com.sda.exercises.ex1;

public class Developer extends Person{
    private int experience;
    private String level; // Junior, Middle, Senior

    public Developer(int experience, String level){
        super();
        this.experience = experience;
        this.level = level;
        System.out.println("Constructor developer");
    }

     void printExperienceAndLevel() {
        System.out.println(this.experience +  "-" + this.level);
    }

    void printDeveloperDetails() {
        System.out.println(super.toString() + ", experience: " + this.experience + " years, level: " + this.level);
    }
}
