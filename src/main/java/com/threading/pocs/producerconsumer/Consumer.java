package com.threading.pocs.producerconsumer;

import java.util.concurrent.ThreadLocalRandom;

public class Consumer implements Runnable{
    private Data load;

    Consumer(Data load){
        this.load = load;
    }

    @Override
    public void run() {
        for(String receiveMessage = load.receive() ; !"End".equals(receiveMessage); receiveMessage = load.receive() ){
            System.out.println(receiveMessage);
            /*try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000,5000));
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }*/
        }
    }
}
