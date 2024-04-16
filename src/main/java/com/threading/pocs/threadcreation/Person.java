package com.threading.pocs.threadcreation;

import java.util.Scanner;

public class Person implements Runnable{

    int id;
    String name;
    String issuedBook;

    public void run() {
        getDetails();
    }

    public void getDetails(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ur name ");
        name = scan.nextLine();
        System.out.println("Enter book u required ");
        issuedBook = scan.nextLine();
        System.out.println(name+" you are issued with the book "+issuedBook);
    }
}

class Library implements  Runnable{
    String[] books = {"Clean Code", "Introduction to algorithm", "Design Patterns", "Clean Code", "The art of computer programming", "Head first Java", "Design Patterns", "Clean code"};
    static String bookName = "Design Patterns";
    static int count =0 ;

    public void run() {
        for(int i=0;i<books.length;i++) {
            if(books[i].equals(bookName)) count++;
        }
    }
}