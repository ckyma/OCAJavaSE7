package edu.cy.chapter7;

/**
 * Created by yuchen on 28/12/14.
 */
public class ThrowCheckedException {
    public static void main(String[] args) throws Exception {       // No compilation error, ok to ONLY include checked exception here without handling it
        try{
            m1();
            System.out.println("A");
        }finally {
            System.out.println("B");
        }

        System.out.println("C");
    }

    public static void m1() throws Exception {
        throw new Exception();
    }
}
