package com.sda.abstractization;

public class Contabil extends Angajat implements Facturi {

    public Contabil(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void startWorking() {
        System.out.println("Start work!");
    }

    @Override
    public void stopWorking() {
        System.out.println("Go home!");
    }

    @Override
    public void generateBill() {
        System.out.println("Generate bill for today!");
    }

    @Override
    public void stornoBill() {
        System.out.println("Storno this bill!");
    }
}
