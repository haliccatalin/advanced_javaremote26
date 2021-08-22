package com.sda.threads;

public class CoffeeMaker extends Thread {

    @Override
    public void run() {
        super.run();

        int counter = 0;

        while(true) { // counter < 10
            System.out.println("Coffee Maker");

            // Thread.sleep() ii spune trheadului sa faca o pauza

//          1000 * 60 * 60 * 24 * 7 .... etc
            int millisecond = 1;
            int second = millisecond * 1000;
            int minute = second * 60;
            int hour = minute * 60;
            int day = hour * 24;
            int week = day * 7;

            if(counter == 10) {
                break;
            }

            try {
//              pauza de 2 secunde
                Thread.sleep(second * 2);

                counter++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
