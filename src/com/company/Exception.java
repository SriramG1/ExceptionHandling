package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception extends Throwable {
    public void addition() {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers for addition :");
        int numberOne=in.nextInt();
        int numberTwo=in.nextInt();
        int result = numberOne+numberTwo;
        System.out.println("Addition result : "+result);
    }

    public void divide() {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers for division :");
        try {
            int numberOne = in.nextInt();
            int numberTwo = in.nextInt();
            int result = numberOne / numberTwo;
            System.out.println("Division result : " + result);
        }
        catch (ArithmeticException ae) {
            System.err.println("Don't divide by zero");
            divide();
        }
        catch(InputMismatchException ime){
            System.err.println("Enter only integers ");
            divide();
        }
        finally {
            System.out.println("This is Finally");
        }
    }
    public static void main(String[] args) {
        Exception handling=new Exception();
        handling.divide();
        handling.addition();
    }
}

