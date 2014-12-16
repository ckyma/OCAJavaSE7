package edu.cy.chapter8.q80;

/**
 * Created by cy on 12/16/14.
 * @ c is wrong, d is right
 * a. m1; b. m2; c. m3 d. Code fails to compile.
 */
public class EMyMethods {
    static String name = "m1";

    void riverRafting() {
        String name = "m2";
        if (8 > 2) {
            // String name = "m3";         // Compilation error, can NOT define a same name local variable in a scope of scope, not like C++
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        EMyMethods m1 = new EMyMethods();
        m1.riverRafting();                      // m2
    }
}
