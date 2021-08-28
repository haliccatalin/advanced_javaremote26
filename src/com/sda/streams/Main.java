package com.sda.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        System.out.println("--------foreach version--------");

        namesList.add("Catalin");
        namesList.add("Raul");
        namesList.add("Ion");
        namesList.add("Mihaela");
        namesList.add("Dana");
        namesList.add("Radu");
        namesList.add("Daniel");

        for(String element: namesList) {
            System.out.println(element);
        }

        System.out.println("--------Stream version--------");
        // forEach
        namesList.stream().forEach((element) -> System.out.println(element));

        System.out.println("Cautare in lista");
        System.out.println("--------for version---------");
        for(String element: namesList) {
            if(element.startsWith("R")) {
                System.out.println(element);
            }
        }
        System.out.println("--------Stream version--------");

        // filter() -> ne ajuta sa cautam in lista, filtram date
        namesList.stream()
                .filter((element) -> element.startsWith("R"))
                .forEach((element) -> System.out.println(element));


        System.out.println("Toate elemntele cu litera mare");
        System.out.println("--------for version---------");

        List<String> newListUppercase = new ArrayList<>();
        for(String element: namesList) {
            newListUppercase.add(element.toUpperCase(Locale.ROOT));
        }

//        namesList = newListUppercase;

        for(String element : newListUppercase ) {
            System.out.println(element);
        }

        System.out.println("--------Stream version--------");

        // .map() -> permite modificarea elementelor din colectie
        namesList.stream()
                .map((element) -> element.toUpperCase(Locale.ROOT))
                .forEach((element) -> System.out.println(element));

        System.out.println("Collect and sorted!");
        // .collect(Collectors.toList()) -> transforma stream-ul in lista
        List<String> sortedList = namesList.stream().sorted().collect(Collectors.toList());
//        List<String> sortedList = namesList.stream().sorted().filter((element) -> element.startsWith("D")).collect(Collectors.toList());
//        List<String> sortedList = namesList.stream().sorted().map((element) -> element.toLowerCase(Locale.ROOT)).collect(Collectors.toList());

        for(String element: sortedList) {
            System.out.println(element);
        }

        System.out.println("-----------------------------------");

        String resultReduce = namesList.stream().reduce("", (text, current) -> text + " " + current);

//        Optional.of() => transforma un obiect (care NU poate sa fie null) intr-un optional
        // Optional.ofNullable() => transforma un obiect (care poate sa fie si null) intr-un optional
        Optional<String> stringOptional = Optional.ofNullable(resultReduce);

        stringOptional.ifPresent((name) -> System.out.println(name));

        System.out.println("-----------------------------------");

        // allMatch() - toate valorile din lista sa indeplineasca conditia
        boolean allNamesGraterThan4 = namesList.stream().allMatch((name) -> name.length() > 4);
        System.out.println("All Names are grater than 4 size? " + allNamesGraterThan4);

        // anyMatch() - cel putin o valoare din lista sa indeplineasca conditia
        boolean anyNameGraterThan4 = namesList.stream().anyMatch((name) -> name.length() > 4);
        System.out.println("Is there a name size grater than 4? " + anyNameGraterThan4);

    }
}
