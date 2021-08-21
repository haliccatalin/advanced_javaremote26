package com.sda.collections.exercises;

import java.util.*;

public class MapExercise {
    public static void main(String[] args) {

        /**
         * Create a map and display its result (data shouldbe providedby the user-console):
         * a)Names and surnames
         * b)Names and ages.
         * c)Names and lists of friends (other names).
         * d)* Names and details (map of maps), e.g.„Mike":„ID": „...",„birthPlace": „..."
         */

//        firstExercise();
        //secondExercise();
//        thirdExercise();

    }

    public static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void firstExercise() {
        Scanner scan = new Scanner(System.in);

        Map<String, String> nameAndSurnamesMap = new HashMap<>();
        while (true) {
            System.out.println("enter name");
            String key = scan.nextLine();
            if (key.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("enter surname");
            String value = scan.nextLine();
            if (value.equalsIgnoreCase("exit")) {
                break;
            }
            nameAndSurnamesMap.put(key, value);
        }
        printMap(nameAndSurnamesMap);
    }

    public static void secondExercise() {

        Scanner scanString = new Scanner(System.in);
        Scanner scanInteger = new Scanner(System.in);

        Map<String, Integer> nameAndAges = new HashMap<>();

        while (true) {
            System.out.println("enter name");
            String name = scanString.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("enter age");
            Integer age = scanInteger.nextInt();

            nameAndAges.put(name, age);

        }
        printMapStringInteger(nameAndAges);
    }

    public static void printMapStringInteger(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }

    public static void thirdExercise(){

        Map<String, List<Friend>> friendMap = new HashMap<>();

        Scanner scan = new Scanner((System.in));
        while(true){
            String groupName = scan.nextLine(); //groupName = key
            if(groupName.equalsIgnoreCase("exit")){
                break;
            }
            List<Friend> friendsList = new ArrayList<>();
            System.out.println("add friend to List");
            while(true){
                System.out.println("friend name");
                String friendName = scan.nextLine();
                System.out.println("date of birth");
                String dateOfBirth = scan.nextLine();
                if(dateOfBirth.equalsIgnoreCase("exit")){
                    break;
                }
                Friend friend = new Friend(friendName, dateOfBirth);
                friendsList.add(friend);

            }
            friendMap.put(groupName,friendsList);


        }
        printFriendsMap(friendMap);



    }
    public static void printFriendsMap(Map<String,List<Friend>> friendMap){

        for(Map.Entry<String,List<Friend>> entry:friendMap.entrySet()){
            String groupName = entry.getKey();
            System.out.println(groupName);
            List<Friend> friendList = entry.getValue();
            for(Friend friend : friendList){
                System.out.println("name: "+ friend.getName() + " date of birth" + friend.getDateOfBirth());
            }
        }


    }



}