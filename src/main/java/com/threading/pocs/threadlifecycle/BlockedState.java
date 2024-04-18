package com.threading.pocs.threadlifecycle;

public class BlockedState {

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread blockedThread = new Thread(()->{
            synchronized(lock){
                while (true){

                }
            }
        });
        blockedThread.start();

        Thread observerThread = new Thread(()->{
            synchronized (lock){
                System.out.println("Acquired the lock");
            }
        });
        observerThread.start();
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        System.out.println(observerThread.getState());
    }


}
