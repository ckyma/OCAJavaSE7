package edu.cy.chapter7;

/**
 * Created by yuchen on 26/10/14.
 */
public class TwistInTaleCasting {
    public static void main(String[] args) throws Exception {       // Ok to include a checked Exception in main method signature without any Compilation error and runtime exception
        Printable printable = null;
        BlackInk blackInk = new BlackInk();
        printable = (Printable) blackInk;       // For Interface, Runtime error: java.lang.ClassCastException
        // Ink ink = (Ink) blackInk;            // For Class, Compilation error: Inconvertible types
    }
}

class Ink {}
interface Printable {}
class ColorInk extends Ink implements Printable {}
class BlackInk {}