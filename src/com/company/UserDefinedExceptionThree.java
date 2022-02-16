package com.company;

import java.util.Scanner;

public class UserDefinedExceptionThree {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Your First subject mark :");
        int markOne=in.nextInt();
        System.out.println("Enter Your Second subject mark :");
        int markTwo=in.nextInt();
        System.out.println("Enter Your Third subject mark :");
        int markThree=in.nextInt();
        System.out.println("Enter Your Fourth subject mark :");
        int markFour=in.nextInt();
        System.out.println("Enter Your Fifth subject mark :");
        int markFive=in.nextInt();

        int total=markOne+markTwo+markThree+markFour+markFive;
        int average=total/5;
            if (average < 35) {
              //  try {
                    throw new FailMarkException(average);
              //  }
             //   catch (FailMarkException failMarkException){
                  //  System.err.println("Your mark is not eligible");
              //  }
            }
        else{
            System.out.println("You are pass !!!");
        }
    }
}
