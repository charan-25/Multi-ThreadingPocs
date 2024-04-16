package com.threading.pocs.threadcreation;

public class UsingThreadClass extends Thread{

    int start,end,target;
    int index =-1;
    int[] arr;

    UsingThreadClass(int start,int end,int[] arr,int target){
        this.start = start;
        this.end  = end;
        this.arr = arr;
        this.target = target;
    }

    public void run(){
        System.out.println("Run Method is executed using :: "+Thread.currentThread().getName());
        if(end>=arr.length) return;
        for(int i = start;i<=end;i++){
            if(arr[i] == target){
                this.index = i;
                return;
            }
        }
    }
}
