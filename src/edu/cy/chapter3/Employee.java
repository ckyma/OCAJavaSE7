package edu.cy.chapter3;

/**
 * Created by yuchen on 11/10/14.
 */
public class Employee {
    protected String name;
    protected int age;

    // Constructor
    Employee(){
        // Error: java: call to this must be first statement in constructor
        this(null, 0);  // call overloaded constructor within a constructor
        // Employee(null, 0);  // Error: Employee cannot be applied to given types

        // this(); // Error: recursive constructor invocation

        // // Error: java: call to super must be first statement in constructor
        // super();    // call parent class constructor

        System.out.println("Employee: Constructor");
    }

    // Overload constructor
    Employee(String newName, int newAge){
        // this(); // Error: recursive constructor invocation
        name = newName;
        age = newAge;
        System.out.println("Employee: Another Constructor");
    }

    // A regular method, not a constructor
    void Employee(){
        // this(null, 0);  // Erorr: call to this must be first statement in constructor
        System.out.println("Employee: Method");
    }

    // Initializer, which is executed before the constructor
    {
        System.out.println("Employee: Initializer");
    }

    public void setName(String name) {
        this.name = name;
    }

    public int daysOffWork(int... days){
        int daysOff = 0;
        for(int i = 0; i < days.length; i++){
            daysOff += days[i];
        }
        return daysOff;
    }
}
