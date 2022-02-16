package com.company;

import java.util.Scanner;
import java.lang.Exception;
public class UserDefinedExceptionTwo {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Your balance :");
        int balance= in.nextInt();
        System.out.println("Enter Your withdraw amount :");
        int amount= in.nextInt();
        try {
            if (amount > balance) {
                throw new InsufficientBalanceException(amount-balance);
            }
        }
        catch (InsufficientBalanceException insufficientBalanceException){
            System.err.println("Invalid bank balance");
        }
    }
}
