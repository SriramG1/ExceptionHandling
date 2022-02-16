package com.company;
import java.lang.Exception;
public class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(int balanceAmd){
        System.out.println(balanceAmd +" is need !!!");
    }
}
