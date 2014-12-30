package edu.cy.chapter6;

/**
 * Created by cy on 12/30/14.
 */

class Super { static String ID = "QBANK"; }
class Sub extends Super{
    static final int a;                             // Ok to separate the "static final" declaration and initialization
    static { System.out.print("In Sub"); a = 0;}
}

public class TestClassInitialization {
    public static void main(String[] args) {
        System.out.println(Sub.ID);             // QBANK, call a super class members will NOT initialize a sub class
        new Sub();                              // In Sub
    }
}
