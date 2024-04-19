package com.threading.pocs.executorservice;



import java.util.concurrent.Callable;

public class NumberPrinting implements Callable {
    private int num;
    NumberPrinting(int num){
        this.num = num;
    }
/*//    @Override
//    public void run() {
//        System.out.println("Printing Number :: "+this.num+" using thread : "+Thread.currentThread().getName());
//    }*/

    @Override
    public Integer call() throws Exception {
        System.out.println("Printing Number :: "+this.num+" using thread : "+Thread.currentThread().getName());
        return num;
    }
}
