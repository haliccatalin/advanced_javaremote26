package com.sda.exercises.ex3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/*
3. Personal information
a. Create a file containing any personal data (name, surname, phone number). Data of individual persons should be in the following lines.
b. Download data from a file and create objects of people based on them (in any way - Regex, String.split ...).
c. Enter the created objects into ArrayList or Map (<line number>: <Person>).
d. Present the obtained data.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person p1 = new Person("Gabi", "Ciceu", "0478521354");
        Person p2 = new Person("Marius", "Popescu", "0486721354");
        Person p3 = new Person("Popescu", "Popescu", "04545421354");
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        writeObjectsToFile(personList);

        readObjectsFromFile(personList.size());


        // Nu putem folosi Files.write() atunci cand dorim sa scriem obiecte in fisier.
//        try {
//            Files.write(Path.of("person.txt"), (Iterable<? extends CharSequence>)personList);
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }

    }
    public static void writeObjectsToFile(List<Person> personList) {
        try {
            // cream fisierul in care salvam obiectul
            FileOutputStream fileOutputStream = new FileOutputStream("person.txt");

            // cream fluxul de date (este inlocuitorul lui BufferedWriter) prin care scriem obiectul
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // scriem obiectul person in stream
            for(Person person: personList) {
                objectOutputStream.writeObject(person);
            }

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
    public static void readObjectsFromFile(int numberOfPerson) {
        try {
            FileInputStream fileInputStream = new FileInputStream("person.txt");

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

//            (Person) => ne ajuta sa transformam un obiect intr-un anumit tip
//            in cazul nostru din Object => Person
            for(int i = 0; i < numberOfPerson; i++){
                Person person = (Person) objectInputStream.readObject();

                System.out.println(person.getName());
                System.out.println(person.getSurname());
                System.out.println(person.getPhoneNumber());
                System.out.println("---------");
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }
}
