package com.sda.lambda;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        // implementare cu lambda expression
//        implementarea cu lambda SE POATE FACE DOAR CAND AVEM O SINGURA METODA IN INTERFATA
        FunctionalInterface functionalInterface = (message -> {
            System.out.println(message);
        });

        functionalInterface.showMessage("Welcome in Lambda world!");

        // implementare cu interfete anonime
        FunctionalInterface functionalInterfaceAnonymous = new FunctionalInterface() {
            @Override
            public void showMessage(String message) {
                System.out.println(message);
            }
        };

        functionalInterfaceAnonymous.showMessage("Welcome to Anonymous interface implementation!");
    }
}
