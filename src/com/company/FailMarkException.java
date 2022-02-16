package com.company;

public class FailMarkException extends RuntimeException{
    FailMarkException(int mark){
        System.out.println("Your average mark is : "+mark);
    }
}
