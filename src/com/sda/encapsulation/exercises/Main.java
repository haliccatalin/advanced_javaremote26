package com.sda.encapsulation.exercises;

import com.sda.encapsulation.Dog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Bob", 4, "male", "Pitbull", 12.5);

        System.out.println("Age: " + dog.getAge() + " Weight: " + dog.getWeight());
        System.out.println(dog.toString());


        Dog dog1 = new Dog("female", "Doberman");
        System.out.println(dog1.toString());

        dog1.setAge(2);
        dog1.setWeight(0);
        System.out.println(dog1.toString());

        System.out.println("---------");

        Pocket pocket = new Pocket();

        pocket.setMoney(2999);
        System.out.println(pocket.getMoney());

        Scanner scan = new Scanner(System.in);
        while(true){

            System.out.println("Money: ");
            int moneyRequest = scan.nextInt();
            if(moneyRequest <= 0){
                continue;
            }
            int pocketMoney = pocket.getMoneyFromPocket(moneyRequest);
            if(pocketMoney == 0){
                break;
            }

        }

    }
}