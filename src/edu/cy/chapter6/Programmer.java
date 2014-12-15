package edu.cy.chapter6;

/**
 * Created by cy on 12/9/14.
 */

interface Operations{
    // protected String printName();  // modifier protected is not allowed here
    void printName();     // default as public
    // Operations();    // constructor not allowed
}

public class Programmer extends Employee implements Operations {
    String name;
    private char gender = 'M';

    public Programmer(){
        super();
        name = "Programmer";
    };

    public Programmer(String name){
        // super(); // Compilation error, this() must be the first, so is super(), so there can be only one here
        this();
    };

    public void printName() {  // Must be public, due to abstract method default as public in interface
        System.out.println(name);
    }

    protected void printName(int i) {  // subclass can overload a method in Interface
        System.out.println("Sub: " + name);
    }

    public void printSuperName() {      // for the overrided method, it follow the access modifier of the subclass, which can only be less restrictive
        System.out.println("Sup: " + super.name);
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.printSuperName();
    }
}

class TestAccessibility{
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        System.out.println(programmer.age);         // protected can be accessed from the same package
        programmer.age = 20;
        System.out.println(programmer.age);
        programmer.printName(1);
    }
}