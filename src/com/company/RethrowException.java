package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RethrowException {
    public static void addition() {
        Scanner in = new Scanner(System.in);
        int fNumber,lNumber,add;
        System.out.println("Enter Your Two numbers :");
        try {
            fNumber = in.nextInt();
            lNumber = in.nextInt();
        }
        catch (InputMismatchException inputMismatchException){
            throw new ArithmeticException();
        }
        add=fNumber+lNumber;
        System.out.println(fNumber+" + "+lNumber+" = "+add);
    }
    public static void main(String[] args) throws Throwable {
        try {
            addition();
        }
        catch (ArithmeticException arithmeticException){
            System.err.println("Enter valid input");
        }
    }
}
