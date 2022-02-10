package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberFormat {
    public static void main(String[] args) throws IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(in);
        System.out.println("Enter the String :");
        String text=br.readLine();
        System.out.println("Your string value is "+text);
        System.out.println("Enter Your integer :");
        try {
        int number = Integer.parseInt(br.readLine());
        System.out.println("Your integer value is :" + number);
        }
        catch (NumberFormatException nfe){
        System.err.println("Enter only integers !");
        }
        System.out.println("Enter the float :");
        float floatValue= Float.parseFloat(br.readLine());
        System.out.println("Your float value is :"+floatValue);
    }
}
