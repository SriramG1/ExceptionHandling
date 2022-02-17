package com.company;

import java.util.Scanner;

public class CompareString {
    public static String[] largeString(String []array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                    if (array[i].charAt(0) > array[j].charAt(0)) {
                        String temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                }
            }
        return array;
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter length of array :");
        int size= in.nextInt();
        String []array=new String[size];
        for(int i=0;i<size;i++){
            array[i]=in.next();
        }
        String []arr=largeString(array);
        System.out.println("Large String is :"+arr[0]);
        System.out.println("Small String is :"+array[arr.length-1]);
    }
}
