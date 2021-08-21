package com.sda.genericTypes;

public class Main {

    public static void main(String[] args) {
    genericTypesSample();
    genericTypesLimitedSample();

    }

    public static void genericTypesSample () {
        GenericBox<String> stringGenericBox = new GenericBox<>("Haine de vara");
        System.out.println(stringGenericBox.getItem());

        System.out.println("-------------------");

        GenericBox<Integer> integerGenericBox = new GenericBox<>(100);
        System.out.println(integerGenericBox.getItem());

        System.out.println("-------------------");

        Dog rexDog = new Dog("Rex");
        GenericBox<Dog> dogGenericBox = new GenericBox<>(rexDog);
        Dog dogFromGeneric = dogGenericBox.getItem();

        System.out.println(dogFromGeneric.getName());

        System.out.println("-------------------");

//        String[] names= {"ana", "marian"};
//        int[] ages = {21, 23};
//        double[] distance = {12.9, 89.0};
    }

    public static void genericTypesLimitedSample() {
        Pitbul rexPitbul = new Pitbul("rex", 2);

        GenericBoxLimited<Pitbul> stringGenericBoxLimited =
                new GenericBoxLimited<Pitbul>(rexPitbul);
    }


}
