package edu.cy.chapter7;

/**
 * Created by yuchen on 26/10/14.
 */
public class ThrowNumberFormatException {
    public static int convertToNum(String val){
        int num = 0;
        try{
            num = Integer.parseInt(val, 16);
        }
        catch(ExceptionInInitializerError e){

        }
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
