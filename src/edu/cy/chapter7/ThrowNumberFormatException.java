package edu.cy.chapter7;

import java.io.FileNotFoundException;

/**
 * Created by yuchen on 26/10/14.
 */
public class ThrowNumberFormatException {
    public static int convertToNum(String val){
        int num = 0;
        try{
            num = Integer.parseInt(val, 16);
        }
        // catch(FileNotFoundException e){ }           // compilation error to try to catch a checked exception can never be thrown
        catch(ExceptionInInitializerError e){ }     // Ok to catch unrelated error or runtime exception
        catch(NumberFormatException e){
            throw new NumberFormatException(val + " cannot be converted to hexadecimal number.");   // Customize error message
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(convertToNum("16b"));
        System.out.println(convertToNum("65v"));    // java.lang.NumberFormatException: 65v cannot be converted to hexadecimal number.
    }
}
