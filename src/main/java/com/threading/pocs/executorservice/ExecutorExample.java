package com.threading.pocs.executorservice;

import java.util.concurrent.*;

public class ExecutorExample {
    public static void main(String[] args) {


        Executor executor = new ThreadPoolExecutor(1, 10,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
        Runnable runnableTask = ()->{
            try{
                for(int i =0;i<10;++i){
                    if(i%2==0) System.out.println(i);
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        };
        executor.execute(runnableTask);


    }
}
