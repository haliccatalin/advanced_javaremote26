package com.sda.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        listSamples();
//        setSamples();
        mapSamples();
    }

    public static void listSamples() {
//        List este o interfata => ArrayList este o clasa
//        Initializarea unei interfate cu ajutorul unei clase se poate realiza DOAR daca clasa
//        implementeaza interfata respectiva!!!
        List<String> names = new ArrayList<>();
        for(int i = 0; i < 100; i++ ) {
            // adaugarea in lista
            names.add("Popescu " + i);
        }

        // pentru a afisa lungimea listei
        System.out.println(names.size());

//        Afisare valori din lista
//        for(int i = 0; i < names.size(); i++) {
//            String name = names.get(i);
//
//            System.out.println(name);
//        }

        System.out.println("------------------------");

        for (String name: names) {
            System.out.println(name);
        }

        // stergerea din lista
        names.remove(42);
        names.remove(50);
        names.remove(23);

//        sterge toate valorile din lista
//        names.clear();


//        for (String name: names) {
//            System.out.println(name);
//        }

//        names[0] = ;

        // actualizare (inlocuire) element in lista pe baza de index
        names.set(0,"ana are mere");

        for (String name: names) {
            System.out.println(name);
        }

        List<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("Ana");
        namesLinkedList.get(0);
        namesLinkedList.remove(0);
        namesLinkedList.clear();
        names.size();
        namesLinkedList.set(0, "Maria");

        List<String> namesVector = new Vector<>();

        namesVector.add("Ana");
        namesVector.get(0);
        namesVector.remove(0);
        namesVector.clear();
        namesVector.size();
        namesVector.set(0, "Maria");

    }

    public static void setSamples() {
        // valorile unui set sunt UNICE!!!
        // inseamna ca nu avem duplicate

        Set<String> carsHashSet = new HashSet<>();
        carsHashSet.add("BMW");
        carsHashSet.add("Opel");

        // varianta 1 pentru afisarea unui set
//        String[] array = (String[]) carsHashSet.toArray();
//
//        for(int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//
//        for(int i = 0; i < carsHashSet.toArray().length; i++) {
//            System.out.println(carsHashSet.toArray()[i]);
//        }

//        varianta 2

        Iterator<String> iterator = carsHashSet.iterator();
        // iterator.hasNext() -> verifica daca exista urmatorul element
        while(iterator.hasNext()) {
//            iterator.next() -> acceseaza urmatorul element
            System.out.println(iterator.next());
        }



        Set<String> carsLinkedHashSet = new LinkedHashSet<>();

        Set<String> carsTreeSet = new TreeSet<>();

    }

    public static void mapSamples() {
//        Map<String, String> => dictionar key - value
//        key -> trebuie sa fie unic!

        Map<String, String> hashMap = new HashMap<>();
        // put -> adaugam elementele in map
        hashMap.put("dulap", "spatiu de depozitare din lemn");
        hashMap.put("laptop", "mini calculator, portabil");
        hashMap.put("telefon", "dispozitiv de comunicare");

        // putIfAbsent -> adauga elemetul doar daca nu este key-ul deja in map
        hashMap.putIfAbsent("birou", "spatiu de lucru");

        // get -> accesarea unui element din map pe baza unei key
        String value = hashMap.get("dulap");
        System.out.println(value);

        // size -> retuneaza dimensiunea unui map
        System.out.println(hashMap.size());

        // remove -> sterge un element (key + value) din map folosind key-ul
        hashMap.remove("dulap");

        // clear -> sterge toate elementele din map
        hashMap.clear();

        // containsKey -> verifica daca este prezent key-ul in map
        boolean isPresentKey = hashMap.containsKey("laptop");

        // containsValue -> verifica daca este prezent key-ul in map
        boolean isPresentValue = hashMap.containsValue("dispozitiv de comunicare");

        // afisare map
        for(Map.Entry<String, String> entry : hashMap.entrySet()) {
            // getKey() -> returneaza key-ul
            // getValue() -> returneaza value
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Map<String, String> linkedHashMap = new LinkedHashMap<>();

        Map<String, String> treeMap = new TreeMap<>();
    }
}
