package com.company;

import java.util.Scanner;

public class SmallestString {
    public static String getSmallest(String str1,String str2){
        String smallest="";
        String smallString;
        if(str1.length()>str2.length()){
            smallString=str2;
        }
        else{
            smallString=str1;
        }
        int min=Math.min(str1.length(),str2.length());
        for(int i=0;i<min;i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (str1.charAt(i) < str2.charAt(i)) {
                    smallest = str1;
                } else {
                    smallest = str2;
                }
                break;
            }
        }
        if(smallest.equals("")){
            return smallString;
        }
        else {
            return smallest;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First string :");
        String stringOne= in.next();
        System.out.println("Enter Second String :");
        String stringTwo= in.next();
        System.out.println("Smallest string is : "+getSmallest(stringOne,stringTwo));
    }
}
