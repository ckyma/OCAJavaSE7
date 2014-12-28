package edu.cy.chapter6;

/**
 * Created by cy on 12/9/14.
 */
public class Employee {             // Employee can not be superclass of Programmer, cyclic inheritance is not allowed
    protected String name;
    protected int age;
    private String gender;

    static int n;

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
