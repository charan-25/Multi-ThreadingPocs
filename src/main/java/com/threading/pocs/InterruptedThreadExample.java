package com.threading.pocs;

public class InterruptedThreadExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(()->{
            try {
                for(int i=0;i<5;i++){
                    System.out.println("Working");
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e){
                System.out.println("Interrupted while sleeping");
                e.printStackTrace();
            }
        });
        myThread.start();

        myThread.interrupt();
    }
}
