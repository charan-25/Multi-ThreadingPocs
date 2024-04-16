package com.threading.pocs.threadcreation;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {

        /* int[] arr = {1,2,3,4,5};
		  int result = Arrays.stream(arr).map(n->n*n).filter(n->n%2==0).reduce(0,Integer::sum);
		  System.out.println(result);
		*/

        //Thread Creation by extending Thread Class
//        int[] array = new int[]{45,92,60,29,36, 97,72, 23,29,81,45,22,62,58,72};
//        int n = array.length;
//        int target = 62;
//
//        UsingThreadClass thread = new UsingThreadClass(0,n/2,array,target);
//        thread.run();
//        thread.start();
//
//        UsingThreadClass thread1 = new UsingThreadClass(n/2+1,n-1,array,target);
//        thread1.run();
//        thread1.start();
//
//        if(thread1.index ==-1||thread.index==-1)
//            System.out.println("Index of first occurence of "+target+" int the array "+ Arrays.toString(array)+" is at the index "+Math.max(thread1.index, thread.index));
//        else
//            System.out.println("Index of first occurence of "+target+" int the array "+Arrays.toString(array)+" is at the index "+Math.min(thread.index,thread1.index));


        //Thread Creation by implementing Runnable Interface
        Thread thread2 = new Thread(new Library());
        Thread thread3 = new Thread(new Person());

        thread3.start();
        thread2.start();
        //letting Person to finish first before printing count
        while(thread3.isAlive());
        System.out.println("There are "+Library.count+" copies of book : "+Library.bookName);
    }
}
