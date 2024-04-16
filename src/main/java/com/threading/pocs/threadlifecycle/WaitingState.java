package com.threading.pocs.threadlifecycle;

public class WaitingState implements  Runnable{

    public void run() {
        System.out.println(Driver.t.getState());
    }
}
