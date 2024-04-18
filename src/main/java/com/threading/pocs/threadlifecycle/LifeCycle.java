package com.threading.pocs.threadlifecycle;

public class LifeCycle implements Runnable{

    public void run() {
        /*Thread t2 = new Thread(new WaitingState());
        t2.start();
        try {
            t2.join();
        }catch (InterruptedException e){
            Thread.currentThread().getStackTrace();
            e.printStackTrace();
        }*/
        blockedState();
    }

    // A thread will be in blocked when it is waiting for lock to be released and trying to access
    // the block of code or a method which is locked by some other thread
    public synchronized void blockedState(){
        while(true){

        }
    }
}
