package com.company;

import java.util.Scanner;

public class UserDefinedException {
    static int age;

    public static void AgeScanner(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Your Age :");
        age=in.nextInt();
    }
    public static void main(String []args) throws InvalidAgeException {
        AgeScanner();
        InvalidAgeException.Check(age);
    }
}
