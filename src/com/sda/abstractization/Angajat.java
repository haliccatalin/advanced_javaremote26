package com.sda.abstractization;
// pentru a definii o clasa abstracta trebuie
// sa adaugam cuvantul "abstract"

/**
 * Particularitati Clase Abstracte
 * - cuvantul "abstract" in definirea clasei
 * - cuvantul "abstract" in definirea metodelor
 * - metode fara bloc de cod
 * - metode cu bloc de cod
 * - constructor
 * - proprietati, campuri
 * - clase abstracte nu se pot instantia (adica NU!! putem scrie: new Angajat() )
 *
 */
public abstract class Angajat {
    private String firstName;
    private String lastName;

    //constructor -> are acelasi nume cu clasa, nu are tip returnat
    public Angajat(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void sayHello() {
        System.out.println("Hello from Angajat!");
    }

    // metode abstracte (fara bloc de cod)
    public abstract void startWorking();

    public abstract void stopWorking();

}
