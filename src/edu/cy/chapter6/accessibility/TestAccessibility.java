package edu.cy.chapter6.accessibility;

import edu.cy.chapter6.*;

/**
 * Created by phinary0 on 12/15/14.
 */
public class TestAccessibility {        // can define same class name as the imported package
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        // System.out.println(programmer.age);      // can NOT access protected variable from outside of the package
        // programmer.age = 20;
        // System.out.println(programmer.age);
        // programmer.printName(1);
    }
}

class Programmer extends Employee {     // can define same class name as the imported package

}