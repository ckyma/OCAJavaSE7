package edu.cy.chapter6;

/**
 * Created by cy on 12/9/14.
 */
public class Employee {
    protected String name;
    protected int age;

    public Employee(){
        name = "Employee";
    };

    Employee(String name){
        this.name = name;
    };

    protected void printSuperName(){
        System.out.println("Super: " + name);
    }
}
