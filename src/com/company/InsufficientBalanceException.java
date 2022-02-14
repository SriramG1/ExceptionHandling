package com.company;

public class InsufficientBalanceException extends Throwable {
    InsufficientBalanceException(int balanceAmd){
        System.out.println(balanceAmd +" is need !!!");
    }
}
