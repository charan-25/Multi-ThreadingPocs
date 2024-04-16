package com.threading.pocs.threadlifecycle;

public class TimedWaiting implements Runnable{

    public void run() {
        try {
            Thread.sleep(6000);
        }catch (Exception e){
            Thread.currentThread().getStackTrace();
            e.printStackTrace();
        }
    }
}
