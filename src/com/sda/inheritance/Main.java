package com.sda.inheritance;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Catalin", "Halic", "0751067247");
        Person p2 = new Person("Mihai", "Popescu", "0763223341");

        System.out.println(p1.toString());
        System.out.println("------------");
        System.out.println(p2.toString());
        System.out.println("------------");

        Student s1 = new Student("Daniel", "Popa", "07612312312", "JavaRemote25");
        System.out.println(s1.toString());

        System.out.println("------------");

        // PUTEM INITIALIZA PARINTELE CU CLASA COPIL
        Person p3 = new Student("Dan", "Mihail", "123112312", "JavaRemote26");
        System.out.println(p3.toString());

        // NU PUTEM INITIALIZA UN COPIL CU CLASA PARINTE!!!
//        Student s2 = new Person("Mihai", "Dan", "123123121");
        System.out.println("------------");

        // polimorfism

        s1.printPhone();

        // La polimorfism trebuie sa stim despre
            // 1. override
            // 2. overload
    }
}
