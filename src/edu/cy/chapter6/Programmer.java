package edu.cy.chapter6;

/**
 * Created by cy on 12/9/14.
 */

interface Operations{
    // protected String printName();  // modifier protected is not allowed here
    String printName();
    // Operations();    // constructor not allowed
}

public class Programmer extends Employee implements Operations {
    String name;

    Programmer(){
        super();
        name = "Programmer";
    };

    Programmer(String name){
        // super(); // Compilation error, this() must be the first, so is super(), so there can be only one here
        this();
    };

    public String printName() {  // Must be public, due to abstract method default as public
        return name;
    }

    protected String printName(int i) {  // subclass can overload a method in Interface
        return name;
    }

    public void printSuperName() {      // for the overrided method, it follow the access modifier of the subclass, which can only be less restrictive
        System.out.println("Sub: " + name);
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.printSuperName();
    }
}
