package edu.cy.chapter7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by phinary0 on 12/12/14.
 */
public class ThrowExceptionInInitializerError {
    static{
        try{
            FileInputStream file = new FileInputStream("1.txt");    // Ok to throw checked exception with catch. no ThrowExceptionInInitializerError
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found");
            throw new RuntimeException();           // throw runtime exception ONLY to cause java.lang.ExceptionInInitializerError, error will not cause this
        }
    }

    public static void main(String[] args) {
        new ThrowExceptionInInitializerError();     // java.lang.ExceptionInInitializerError
    }
}
