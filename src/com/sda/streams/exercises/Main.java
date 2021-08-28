package com.sda.streams.exercises;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*
        Using streams, for a given lists:
- [„John”, „Sarah”, „Mark”, „Tyla”, „Ellisha”, „Eamonn”]
- [1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50]
a) Sort the list.
b) Print only those names, that start with „E” letter.
c) Print values greater than 30 and lower than 200.
d) Print names uppercase.
e) Remove first and last letter, sort and print names.
f) *Sort backwards by implementing reverse Comparator and using lambda expression.
         */

        List<String> nameList = Arrays.asList("Jhon", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        List<Integer> numberList = Arrays.asList(1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50);

        nameList = nameList.stream().sorted().collect(Collectors.toList());
        nameList.stream() .forEach((item) -> System.out.println(item));

        nameList.stream()
                .filter((item) -> item.toLowerCase(Locale.ROOT).startsWith("e"))
                .forEach((item) -> System.out.println(item));

        System.out.println("---------------");
        numberList.stream()
                .filter((number) -> number > 30 && number < 200)
                .sorted()
                .forEach((number) -> System.out.println(number));

        System.out.println("---------------");
        nameList.stream()
                .map((name) -> name.toUpperCase())
                .forEach((name) -> System.out.println(name));

        System.out.println("---------------");

        nameList.stream().map((name) -> {
            String newName = name.substring(1, name.length()-1);
//            System.out.println(newName);
            return newName;
        })
                .sorted()
                .forEach((name) -> System.out.println(name));

        System.out.println("------------");

        nameList.stream()
                .sorted((name, current) -> current.compareTo(name))
                .forEach((name) -> System.out.println(name));

        System.out.println("-------------------");

        nameList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach((name) -> System.out.println(name));
    }
}
