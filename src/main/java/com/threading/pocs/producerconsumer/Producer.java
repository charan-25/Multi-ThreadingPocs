package com.threading.pocs.producerconsumer;

import java.util.concurrent.ThreadLocalRandom;

public class Producer implements Runnable{
    private Data data;

    Producer(Data data){
        this.data = data;
    }

    @Override
    public void run() {
        String[] packets = {"First Packet","Second Packet","Third Packet","Fourth Packet","End"};
        for(String packet : packets){
            data.send(packet);
            /*try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000,5000));
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }*/
        }
    }
}
