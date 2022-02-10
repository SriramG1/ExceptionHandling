package com.company;

public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        try {
            for (int i = 0; i <= array.length; i++) {
                System.out.println(array[i] + " ");
            }
        }
        catch (ArrayIndexOutOfBoundsException ae){
            System.err.println(" enter valid option ");
        }
    }
}
