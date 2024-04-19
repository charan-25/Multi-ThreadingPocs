package com.threading.pocs.executorservice;



import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsProgram {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for(int i=0;i<10;i++){
            NumberPrinting printing = new NumberPrinting(i);
            Future<Integer> future = executor.submit(printing);
            Integer num = future.get();
            System.out.println(num);
        }
        executor.shutdown();
    }
}
