package com.sda.threads;

public class Main {

    public static void main(String[] args) {
        // extends Thread class
        CoffeeMaker coffeeMakerThread = new CoffeeMaker();
        // .start() => pornim un thread
//        coffeeMakerThread.start();


        // implements Runnable
        // pentru ca YoutubeViewer implementeaza interfata Runnable
        // avem nevoie de un obiect din clasa Thread si de un obiect
        // din clasa YoutubeViewer.
        // In constructorul clasei Thread() trimtem obiectul de tipul
        // YoutubeViewer, apoi apelam metoda start a obiectului din clasa
        // Thread
        YoutubeViewer youtubeViewer = new YoutubeViewer();
        Thread threadYoutubeViewer = new Thread(youtubeViewer);

//        threadYoutubeViewer.start();

        Bank bank = new Bank(1);

        BankDrawThread bankDrawThread1 = new BankDrawThread(bank);
        BankDrawThread bankDrawThread2 = new BankDrawThread(bank);

//        bankDrawThread1.start();
//        bankDrawThread2.start();


        LoadImage loadImage = new LoadImage();
        try {
            System.out.println(loadImage.call());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
