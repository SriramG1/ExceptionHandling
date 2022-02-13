package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

class ThrowsDemo {
    public void Division(int numberOne,int numberTwo) throws ArithmeticException, InputMismatchException {
        int result=numberOne/numberTwo;
        System.out.println("Your division value is "+result);
    }
}
public class ThrowsProgram  {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        try {
            System.out.println("Enter  Your First Number :");
            int firstNumber=in.nextInt();
            System.out.println("Enter  Your Second Number :");
            int secondNumber=in.nextInt();
            ThrowsDemo obj=new ThrowsDemo();
            obj.Division(firstNumber, secondNumber);
        }
        catch (ArithmeticException arithmeticException){
            System.err.println("Don't divide by zero");
        }
        catch (InputMismatchException inputMismatchException){
            System.err.println("Enter valid Integers only");
        }
    }
}
