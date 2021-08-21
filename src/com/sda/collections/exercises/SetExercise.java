package com.sda.collections.exercises;
import java.util.*;

public class SetExercise {

    public static void main(String[] args) {
        /**
         * 1. Create a set consisting of colors - given from the user.
         * 2. Present the removal of individual elements from the set.
         * 3. Display the collection before and after sorting
         */

        Set<String> colorsSet = new HashSet<>();

        Scanner scan = new Scanner(System.in);
        while(true){
            String color = scan.nextLine();
            if(color.equalsIgnoreCase("Exit")){
                break;
            }
            colorsSet.add(color);
        }

        System.out.println("-----------");

        while(colorsSet.size() > 0){
            System.out.println("Select color to remove");
            String option = scan.nextLine();
            if(option.equalsIgnoreCase("exit")){
                break;
            }
            colorsSet.remove(option);
        }

        System.out.println("---------");

        List<String> copyColorsList = new ArrayList<>();

        Iterator<String> iterator = colorsSet.iterator();
        while(iterator.hasNext()){
            String item = iterator.next();
            System.out.println(item);
            copyColorsList.add(item);
        }

        System.out.println("------------");

        Collections.sort(copyColorsList);

        for(String item:copyColorsList){
            System.out.println(item);
        }


    }
}