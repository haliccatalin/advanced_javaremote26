package com.sda.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        readObjectFromFile();
    }

    public static void readObjectFromFile() {
        try {
            FileInputStream fileInputStream = new FileInputStream("person.txt");

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

//            (Person) => ne ajuta sa transformam un obiect intr-un anumit tip
//            in cazul nostru din Object => Person
            Person person = (Person) objectInputStream.readObject();

            System.out.println(person.getName());
            System.out.println(person.getPhone());
            System.out.println(person.getEmail());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }

    public static void writeObjectToFile() {
        Person person = new Person("Catalin", "0645244235", "catalin@gmail.com");

        try {
            // cream fisierul in care salvam obiectul
            FileOutputStream fileOutputStream = new FileOutputStream("person.txt");

            // cream fluxul de date (este inlocuitorul lui BufferedWriter) prin care scriem obiectul
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // scriem obiectul person in stream
            objectOutputStream.writeObject(person);

            // flush() => elimina toate datele din flux;
            fileOutputStream.flush();

            // close() => inchide fluxul de date
            fileOutputStream.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } catch (Throwable throwable) {
            System.out.println(throwable.getMessage());
        }
    }

    public static void readFromFile() {
        try {
//            readAllLines() => citeste toate liniile din fisier
            List<String> dataListFromFile = Files.readAllLines(Path.of("my-info.txt"));

            for (String item : dataListFromFile) {
                System.out.println(item);
            }
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }

    public static void writeToFile() {
        try {
            List<String> carsList = new ArrayList<>();
            carsList.add("BMW");
            carsList.add("Dacia");
            carsList.add("Opel");

//            Path.of() => transforma locatia in functie de sistemul de operare
//            Windows -> C:/Program Files/
//            Linux -> \Users\student
            Files.write(Path.of("my-info-new.txt"), carsList);
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }

    public static void writeToFileOldSchool() {
        // ne ajuta sa scriem date intr-un fisier
        BufferedWriter bufferedWriter = null;

        try {
            // ne ajuta sa creeam fisierul in care vom scrie date
            // iar ca paramentru in constructor avem "locatia + numele fisierului + extensia lui"

            // path absolut: D:/my-info.txt
            // path relativ: my-info.txt
            FileWriter fileWriter = new FileWriter("my-info.txt");

            bufferedWriter = new BufferedWriter(fileWriter);

            List<String> namesList = new ArrayList<>();
            namesList.add("Ana");
            namesList.add("Mihai");
            namesList.add("Ion");
            namesList.add("Dana");

            for (String name : namesList) {
                System.out.println("Name: " + name);

                // write(name) -> scrie string-ul in fisier
                bufferedWriter.write(name);

                // newLine() -> trece pe urmatoarea linie in fisier
                bufferedWriter.newLine();
            }
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        } finally {
            if (bufferedWriter != null) {
                try {
                    // flush() => elimina toate datele inainte de inchiderea bufferului
//                                    trebuie apelata inainte sa inchidem bufferul
                    bufferedWriter.flush();

                    // close() => inchide bufferul
                    bufferedWriter.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
    }
}
