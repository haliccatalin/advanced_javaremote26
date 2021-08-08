package com.sda.inheritance;

// pentru a realiza o relatie de mostenire folosim "extends"
// O CLASA POATE AVEA UN SINGUR PARINTE!!!!
public class Student extends Person {
    private String javaClassName;
    private Book mathBook;

    public Student(String firstName, String lastName, String phone, String javaClassName) {
        // super -> ne permite sa accesam proprietati, metode, constructori din
        //          clasa parinte

        // super -> se foloseste doar in relatia de mostenire
        super(firstName, lastName, phone);

//        Putem apela o variabila, metoda, constructor care nu este private din parinte
//        super.firstName = "TEST";

        this.javaClassName = javaClassName;
    }

    public String getJavaClassName() {
        return this.javaClassName;
    }

    @Override
    public String toString() {
        // apelam metoda toString() din clasa Person
        return super.toString() + ", Java Class: " + this.javaClassName;
    }

    // Override -> ne permite sa pastram numele si semnatura metodei din
    // clasa parinte si sa schimbam blocul de cod din metoda din parinte
    // cu un nou cod
    @Override
    public void printPhone() {
        super.printPhone();

        System.out.println("NOUL cod");
        System.out.println("Student " + super.getFirstName() + ": " + this.getPhone());

    }

    // overload - se realizeaza atunci cand avem 2 metode/constructori
    // cu acelasi nume, dar numar parametrii diferiti sau ordinea parametrilor
    // este diferita

    public void readBook() {
        System.out.println("Read book!");
    }

    public void readBook(String book) {
        System.out.println("Read " + book);
    }

    public void readBook(String book, int startPage) {
        System.out.println("Read " + book + " at page " + startPage);
    }

    // ATENTIE!!! daca singura diferenta este tipul returnat NU se considera
    // overload
//    public int readBook(String book, int startPage) {
//        System.out.println("Read " + book + " at page " + startPage);
//        return 1;
//    }

    public void readBook(int startPage, String book) {
        System.out.println("Read " + book + " at page " + startPage);
    }




}
