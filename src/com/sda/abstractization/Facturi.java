package com.sda.abstractization;

public interface Facturi {
    /**
     * - nu au constructor
     * - nu au proprietati, cu exceptia celor statice si finale
     * - prin definitie toate metodele sunt "ABSTRACTE"
     * - prin definitie metodele sunt PUBLICE
     * - nu avem cuvantul "abstract"
     * - nu au bloc de cod pana la java 8, apoi cu cuvantul "default" putem avea bloc de cod
     * - nu pot fi instantiate, cu exceptia interfetelor anonime!
     * - o clasa poate avea un numar infinit de interfete
     */

    public static final int ID = 10;

    // nu se poate!
    //    String billNo;

    void generateBill();

    void stornoBill();

    // de la java 8 in sus a fost adaugat "default"
    default void printBill() {
        System.out.println("print bill!");
    }

}
