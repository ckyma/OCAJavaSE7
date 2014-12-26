package edu.cy.chapter2;

import java.util.Objects;

/**
 * Created by yuchen on 26/12/14.
 * Auto-boxing of primitive variable into wrapper class object when passing as an argument
 */
public class WrapperClass {
    static Object returnAutoWrapperObject(Object obj){
        System.out.println(obj);
        return obj;
    }

    public static void main(String[] args) {
        // Auto boxing into wrapper class
        // int ot Integer
        Object a = WrapperClass.returnAutoWrapperObject(10);
        System.out.println(a instanceof Integer);
        // boolean ot Boolean
        Object b = WrapperClass.returnAutoWrapperObject(false);
        System.out.println(b instanceof Boolean);
    }
}
