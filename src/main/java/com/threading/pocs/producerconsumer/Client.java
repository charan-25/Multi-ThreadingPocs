package com.threading.pocs.producerconsumer;

public class Client {
    public static void main(String[] args) {
        Data data = new Data();
        Thread send = new Thread(new Producer(data));
        Thread receive = new Thread(new Consumer(data));
        send.start();
        receive.start();
    }
}
