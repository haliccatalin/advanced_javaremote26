package com.sda.threads;

public class Bank {
        private int accountMoney;

        public Bank(int accountMoney) {
            this.accountMoney = accountMoney;
        }

//       synchronized -> ne ajuta sa sincronizam accesul threadurilor in metoda
        public  void drawMoney() {

            System.out.println("Welcome");

            synchronized (this) {
                if (accountMoney > 0) {
                    System.out.println("Take money");
                    accountMoney--;
                    System.out.println("Money left " + accountMoney);
                } else {
                    System.out.println("No money in your account");
                }
            }

            System.out.println("Have a good day!");

        }

//    public synchronized void drawMoney() {
//
//        System.out.println("Welcome");
//
//            if (accountMoney > 0) {
//                System.out.println("Take money");
//                accountMoney--;
//                System.out.println("Money left " + accountMoney);
//            } else {
//                System.out.println("No money in your account");
//            }
//
//        System.out.println("Have a good day!");
//
//    }
    }
