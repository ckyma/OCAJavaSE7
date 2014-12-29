package edu.cy.chapter1;

/**
 * Created by yuchen on 30/12/14.
 */
public class TestReturnType {
    public static void main(String[] args) {
        // String a = run();        // Compilation error, incompatible types, void can NOT be assigned
        // System.out.println(run());  // Compilation error, can not resolve println(void), treat void as a special type
    }

    static void run() {}
    // static void run(void i) {}   // Compilation error, illegal type 'void'
}
