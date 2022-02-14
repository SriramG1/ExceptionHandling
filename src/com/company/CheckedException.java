package com.company;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedException {
    public static void main(String []args) throws IOException
    {
        try {
            FileInputStream fis = new FileInputStream("B:/myfile.txt");
            int k;

            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }
            fis.close();
        }
        catch(IOException ioException){
            System.err.println("Your file is not founded!");
        }
        System.out.println("Program finished");
    }
}
