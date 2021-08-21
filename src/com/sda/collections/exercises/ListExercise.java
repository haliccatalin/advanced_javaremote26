package com.sda.collections.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ListExercise {

    public static void main(String[] args) {
/**
 * Create a List and display its result (data should be provided by the user - console):
 * a) Purchases to be made. *If an element already exists on the list, then it should
 * not be added.
 * b) *Add to the example above the possibility of "deleting" purchased elements
 * c) Display only those purchases that start with „m” (e.g. milk)
 * d) * View only purchases whose next product on the list starts with „m” (e.g. eggs,
 * if milk was next on the list)
 */

        List<String> elementList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        String element = "";
        while(true){
            element = scan.nextLine();
            if(element.equals("exit")){
                break;
            }else{
                if(!elementList.contains(element.toLowerCase(Locale.ROOT))){
                    elementList.add(element.toLowerCase(Locale.ROOT));
                }
            }
        }
        printList(elementList);


        System.out.println("Do you want to delete items?");
        String response = scan.nextLine();
        if(response.equalsIgnoreCase("Yes")){
            printList(elementList);
            System.out.println("Insert the name: ");
            String item = scan.nextLine();
            elementList.remove(item);
        }
        printList(elementList);

        System.out.println("----------");

        for (String item: elementList) {
            if(item.startsWith("m")){
                System.out.println(item);
            }
        }

        System.out.println("----------");

        for (int i = 0; i < elementList.size(); i++) {
            String item = elementList.get(i);
            if(item.startsWith("m")){
                if(i+1 >= elementList.size()){
                    System.out.println("End of the list");
                }else {
                    System.out.println(elementList.get(i + 1));
                }
            }
        }


    }

    public static void printList(List<String> elements) {
        for (String item:elements) {
            System.out.println(item);
        }


    }
}