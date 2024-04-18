package com.threading.pocs.producerconsumer;

public class Data {

    private String packet;

    private boolean transfer = true;

    public synchronized void send(String packet){
        while(!transfer){
            try{
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.err.println("Interrupted");
            }
        }

        transfer = false;
        this.packet = packet;
        notifyAll();
    }

    public synchronized String receive(){
        while (transfer){
            try {
                wait();
            }catch (InterruptedException ex){
                Thread.currentThread().interrupt();
                System.err.println("Interrupted");
            }
        }
        transfer = true;
        String receiveData = packet;
        notifyAll();
        return receiveData;
    }
}
