package com.company;

import java.util.Scanner;

public class CompareString {
    public static String largeString(String []array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].charAt(0) == array[j].charAt(0)) {

                    if (array[i].charAt(1) == array[j].charAt(1)) {
                        if (array[i].charAt(2) > array[j].charAt(2)) {
                            String temp = array[i];
                            array[j] = array[i];
                            array[i] = temp;
                        }
                        if (array[i].charAt(1) > array[j].charAt(1)) {
                            String temp = array[i];
                            array[j] = array[i];
                            array[i] = temp;
                        }
                    }
                    if (array[i].charAt(0) > array[j].charAt(0)) {
                        String temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                }
            }
        }
        return array[0];
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter length of array :");
        int size= in.nextInt();
        String []array=new String[size];
        for(int i=0;i<size;i++){
            array[i]=in.next();
        }
        System.out.println(largeString(array));
    }
}
