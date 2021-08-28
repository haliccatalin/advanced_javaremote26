package com.sda.encapsulation.exercises;
/*
Create class Pocket.
a) Add field „money", create constructor, getter and setter.
b) Add verification for both getter and setter. Getter should result in returning as much money, as the user asked for. It should return 0 if money <= 10.
c) Setter should not accept values below 0 and greater than 3000. It may print a message like „I don't have enough space in my pocket for as much money!"
 */
public class Pocket {
    private int money;

    public Pocket(){
        this.money = 0;
    }

    public int getMoneyFromPocket(int moneyRequest){
        if (money <= 10){
            return 0;
        }
        if(this.money >= moneyRequest){
//            this.money = this.money - moneyRequest;
            this.money -= moneyRequest;
            System.out.println("Sold: " + this.money);
            return this.money;
        }
        System.out.println("Fonduri insuficiente");
        return -1;
    }

    public void setMoney(int money){
        if(money > 0 && money <= 3000){
            this.money = money;
            return;
        }
        System.out.println("I don't have enough space in my pocket for as much money!");

    }

    public int getMoney(){
        return this.money;
    }
}
