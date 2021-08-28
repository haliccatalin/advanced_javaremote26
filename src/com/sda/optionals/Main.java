package com.sda.optionals;

import java.util.Optional;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        // inlocuiesc acesta secventa de cod, UNDE este cazul
        if (" dasdas " != null) {
            System.out.println("Este diferit de null");
        } else {
            System.out.println("dasdas");
        }

//        Optional.of(Variabila pe care dorim sa o verificam, nu are voie sa fie null)
//        Optional.ofNullable(Variabila pe care dorim sa o verificam, dar poate sa fie si null)


//        .isPresent() => verifica daca valoarea este diferita de null si returneaza true / false
//        if(person != null)

//        .ifPresent((person) -> person.getName()) => verifica daca valoarea este diferita de null si executa o secventa de cod daca e true
//        if(person != null) {
//          System.out.println(person.getName());
//        }

//        .ifPresentOrElse((person) -> Person.getName(), () -> System.out.println("Person e null"))
//        => reprezinta un ifElse, verifica daca valoarea este valida si executa primul paramentru, atlfel al doilea parametru
//        if(person != null) {
//          System.out.println(person.getName());
//        } else {
//          System.out.println("Person este null));

//        .orElse((person) -> Person.getName() => in vazul in care valoarea este null, se executa aceasta linie de cod

//        Person::getName() <=> Person person;
//                              person.getName();

        // Exemplul 1
        Optional<String> optionalString = Optional.of("Ana are mere.");


        if(optionalString.isPresent()) {
            System.out.println("Rezultatul este: " + optionalString.get());
        }

        // Varianta 1
        optionalString.ifPresent(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // Varianta 2 - Lambda expression
        optionalString.ifPresent((value) -> System.out.println(value));

        // Varianta 3 - Lambda expression folosing numele clasei si :: pentru a apela metoda
        optionalString.ifPresent(System.out::println);

        //Exemplul 2

        Optional<Person> optionalPerson = Optional.ofNullable(null);

        optionalPerson.ifPresent((Person person) -> person.showName());

        // :: -> este o scurtatura pentru a apela o metoda
        optionalPerson.ifPresent(Person::showName);

        // avem o alternativa la un ifElse => primul parametru reprezinta conditia true
//                                              al doilea reprezinta conditia false
        optionalPerson.ifPresentOrElse(Person::showName, () -> System.out.println("Invalid person"));
    }
}
