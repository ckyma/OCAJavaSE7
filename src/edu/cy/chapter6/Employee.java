package edu.cy.chapter6;

/**
 * Created by phinary0 on 12/9/14.
 */
public class Employee {
    String name;

    Employee(){
        name = "Employee";
    };

    Employee(String name){
        this.name = name;
    };

    protected void printSuperName(){
        System.out.println("Super: " + name);
    }
}
