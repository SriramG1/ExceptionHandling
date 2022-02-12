package com.company;

public class InvalidAgeException extends Throwable{

    public static void Check(int age){
        if (age < 18) {
            try {
                throw new InvalidAgeException();
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
