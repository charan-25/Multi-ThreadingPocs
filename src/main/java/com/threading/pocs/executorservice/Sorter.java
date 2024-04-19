package com.threading.pocs.executorservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    private List<Integer> arrToSort;
    private ExecutorService executor;

    Sorter(List<Integer> arrToSort,ExecutorService executor){
        this.arrToSort =arrToSort;
        this.executor = executor;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(arrToSort.size()<=1) return arrToSort;

        int mid = arrToSort.size()/2;

        List<Integer> leftArray = new ArrayList<>();
        for(int i=0;i<mid;i++) leftArray.add(arrToSort.get(i));

        List<Integer> rightArray = new ArrayList<>();
        for(int i=mid;i<arrToSort.size();i++) rightArray.add(arrToSort.get(i));

        Sorter task1 = new Sorter(leftArray,executor);
        Sorter task2 = new Sorter(rightArray,executor);

        Future<List<Integer>> sortedLeftArray = executor.submit(task1);
        Future<List<Integer>> sortedRightArray = executor.submit(task2);

        leftArray = sortedLeftArray.get();
        rightArray = sortedRightArray.get();

        List<Integer> mergeArray = new ArrayList<>();
        int i=0,j=0;
        while(i<leftArray.size() && j<rightArray.size()){
            if(leftArray.get(i)<rightArray.get(j)){
                mergeArray.add(leftArray.get(i));
                i++;
            }else{
                mergeArray.add(rightArray.get(j));
                j++;
            }
        }

        while(i<leftArray.size()){
            mergeArray.add(leftArray.get(i));
            i++;
        }

        while (j<rightArray.size()){
            mergeArray.add(rightArray.get(j));
            j++;
        }
        return mergeArray;
    }
}
