package com.company;

import java.util.Scanner;

public class NullPointer {
    public static void main(String[] args) {
      char []array=null;
      try {
          System.out.println(array[1]);
      }
      catch(NullPointerException ne)
      {
          System.err.println("Array is Null");
      }
    }
}
