package com.sda.exercises.ex1;

public class JavaDeveloper extends Developer{

    public JavaDeveloper(int experience, String level){
        super(experience, level);
        System.out.println("Constructor java developer");
    }

    public void setInfo(String name, String email, String phoneNumber){
        super.setName(name);
        super.setEmail(email);
        super.setPhoneNumber(phoneNumber);
    }
}
