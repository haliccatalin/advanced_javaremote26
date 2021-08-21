package com.sda.exceptions;

public class Main {

    public static void main(String[] args) {
        // EXCEPTIONS
//            1. Platform exceptions -> Throwable - clasa parinte a exceptiilor (platform exceptions si runtime exception)
//                - out of memory
//            2. Runtime Exceptions -> Exception - este copilul clasei Throwable
//                - null pointer exception
//                - exceptii matematice 4/0
//                - Outofbounds exception - [1,2,3] -> [3]
//                - timeout exception

        // blocul de cod - try - catch ne ajuta sa gestionam exceptiile, iar programul poate rula in continuare fara probleme!
        // daca nu am folosi try - catch -> aplicatia s-ar opri la prima exceptie intalnita

        // in bocul de cod try-catch putem gestiona mai multe tipuri de exceptii, cu conditia ca vom lasa clasa Exception sau Throwable pe ultima pozitie in catch
        try {
            int result = 5 / 0;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("arithmetical exception");
            System.out.println(arithmeticException.getMessage());
        } catch (NullPointerException nullPointerException) {
            System.out.println("Null pointer");
        } catch (Exception e) {
            System.out.println("Finish for exception");
            System.out.println(e.getMessage());
        }

        try {
            int a = 10/ 0;

            // daca apare exceptia codul merge direct pe catch!!!
            System.out.println("Test");
        } catch (IndexOutOfBoundsException | ArithmeticException exception) {
            System.out.println("here is something strange");
        }

        try {
            int result = 5 / 5;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("the code is running!");
        }

        System.out.println("---------------------");


        // Asa aruncam o exceptie
        try {
            throw new ExceptionCustom("Aceasta este exceptia aruncata de mine!");
        } catch (Throwable t) {
            System.out.println(t.getMessage());
        }


        int[] someIntArray = {3, 4, 2};
        // invalid code - printArrayElement throws Exception, so it needs
        // to be handled (putting it into try-catch or adding throws Exception
        // to main method declaration will fix it).`
        try {
            printArrayElement(someIntArray, 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    // throws -> Ii spune programatorului ca aceasta metoda va arunca o exceptie de tipul Exception!!!
    private static void printArrayElement(int[] intArray, int index) throws Exception {
        if (index < 0 || index >= intArray.length) {
            // throw new Exception() -> asa aruncam programatic o execeptie!!!
            throw new Exception("Incorrect argument!");
        }
        System.out.println(intArray[index]);
    }

}
