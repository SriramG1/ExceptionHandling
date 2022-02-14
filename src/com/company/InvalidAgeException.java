package com.company;

public class InvalidAgeException extends Throwable{
    InvalidAgeException(int age){
        System.out.println("Your age is "+age);
    }

    public static void Check(int age){
        if (age < 18) {
            try {
                throw new InvalidAgeException(age);
            }
            catch (InvalidAgeException invalidAgeException){
                System.err.println("Access denied");
            }
        }
        else{
            System.out.println(" Welcome to our application ");
        }
    }
}
