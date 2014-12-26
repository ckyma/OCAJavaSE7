package edu.cy.chapter6;

/**
 * Created by yuchen on 26/12/14.
 */
// interface Runnable{}

public class TestInterface {
    public static void main(String[] args) {
        // Runnable r = new Runnable();       // Compilation error, interface can NOT be initialized
        Runnable r = new Runnable(){        // Ok, after overriding all of its abstract methods
            @Override
            public void run() { }
        };

        r.run();
    }
}
