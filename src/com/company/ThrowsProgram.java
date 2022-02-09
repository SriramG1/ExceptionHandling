package com.company;

import java.util.Scanner;

    class ThrowsDemo {
        public void Division(int numberOne,int numberTwo) throws ArithmeticException{
           int result=numberOne/numberTwo;
            System.out.println("Your division value is "+result);
        }
    }
    public class ThrowsProgram  {
        public static void main(String[] args) {
            ThrowsDemo obj=new ThrowsDemo();
            try {
                obj.Division(10, 0);
            }
            catch (ArithmeticException ae){
                System.out.println("Don't divide by zero");
            }
    }
}
