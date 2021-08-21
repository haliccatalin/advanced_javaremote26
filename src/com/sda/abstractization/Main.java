package com.sda.abstractization;

public class Main {
    /**
     * Cand vine vorba de Abstractizare, trebuie sa ne gandim la urmatoarele
     * tipuri de date
     * 1. clase abstracte
     * 2. interfete
     *
     */

    public static void main(String[] args) {
        Contabil contabil  = new Contabil("Elena", "Popa");
        contabil.startWorking();

        contabil.sayHello();

        contabil.generateBill();
        contabil.printBill();
        contabil.stornoBill();

        contabil.stopWorking();

        // Clasele abstracte NU!!! pot fi instantiate!
//        Angajat angajat = new Angajat();

        // DAR

        // Exista clase anonime!
        Angajat angajat1 = new Angajat("Mihai", "Dinescu") {
            @Override
            public void startWorking() {
                System.out.println("Start working angajat1");
            }

            @Override
            public void stopWorking() {
                System.out.println("Stop working anagajat1");
            }
        };

        Angajat angajat2 = new Angajat("Dumitru", "Stoian") {
            @Override
            public void startWorking() {
                System.out.println("start working angajat2");
            }

            @Override
            public void stopWorking() {
                System.out.println("stop working angajat2");
            }
        };


        angajat1.startWorking();
        angajat2.startWorking();

        angajat1.sayHello();
        angajat2.sayHello();

        angajat1.stopWorking();
        angajat2.stopWorking();

        // Interfete anonime!

        Facturi facturi = new Facturi() {
            @Override
            public void generateBill() {
                System.out.println("Generate bill!");
            }

            @Override
            public void stornoBill() {
                System.out.println("Storno bill!");
            }
        };

        // ASA DA
        Angajat angajat100 = new Contabil("popescu", "ion");


        // ASA NU
//        Contabil contabil100 = new Angajat("mihail", "dan");







    }

}
