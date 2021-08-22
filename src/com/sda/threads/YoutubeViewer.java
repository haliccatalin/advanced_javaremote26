package com.sda.threads;

public class YoutubeViewer implements Runnable {

    @Override
    public void run() {
       while(true) {
           try {
               System.out.println("Youtube searching...");
               Thread.sleep(1000 * 1);
           } catch (InterruptedException interruptedException) {
               System.out.println(interruptedException.getMessage());
           }
       }
    }
}
