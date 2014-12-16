package edu.cy.chapter8.q69;

/**
 * Created by phinary0 on 12/16/14.
 */

interface Roamable{}
class Phone {}

public class Tablet extends Phone implements Roamable {
    public static void main(String[] args) {
        // No compilation exception
        Roamable var = (Roamable)new Phone();   // Runtime exception: java.lang.ClassCastException: edu.cy.chapter8.q69.Phone cannot be cast to edu.cy.chapter8.q69.Roamable
    }
}

class TabletEmpty {
    public static void main(String[] args) {
        // No compilation exception, any object can be explicitly casted to a unrelated interface reference variable at compilation.
        Roamable var = (Roamable)new Phone();   // Runtime exception: java.lang.ClassCastException: edu.cy.chapter8.q69.Phone cannot be cast to edu.cy.chapter8.q69.Roamable

        // Compilation error, Error: java: inconvertible types
        // TabletEmpty tabletEmpty = (TabletEmpty)new Tablet();
    }
}
