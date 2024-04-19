package com.threading.pocs.executorservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSortUsingMultiThreading {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(8,1,2,4,5,2,10,1,4,90);
        ExecutorService executor = Executors.newCachedThreadPool();
        Sorter sort = new Sorter(list,executor);
        Future<List<Integer>> future = executor.submit(sort);
        List<Integer> res = future.get();
        System.out.println(res);
    }
}
