package com.threading.pocs.threadlifecycle;

public class Driver {
    public static void main(String[] args) {
        Thread thread = new Thread(new LifeCycle());
        System.out.println(thread.getState());

        thread.start();
        System.out.println(thread.getState());
    }
}
