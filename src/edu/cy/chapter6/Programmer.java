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

    // public Employee() {}         // Subclass can NOT override superclass constructor, no access
    // public super() {}

    public Programmer(String name){
        // super(); // Compilation error, this() must be the first, so is super(), so there can be only one here
        this();
    };

    @Override
    public void printName() {  // Must be public, due to abstract method default as public in interface
        System.out.println(name);
    }

    protected void printName(int i) {  // subclass can overload a method in Interface
        System.out.println("Sub: " + name);
    }

    @Override
    public void printSuperName() {      // for the overrided method, it follow the access modifier of the subclass, which can only be less restrictive
        System.out.println("Sup: " + super.name);
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.printSuperName();
    }
}

class TestAccessibility extends MoreOperations{
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        System.out.println(programmer.age);         // protected can be accessed from the same package
        programmer.age = 20;
        System.out.println(programmer.age);
        programmer.printName(1);

        new TestAccessibility().printName();
        // new MoreOperations();        // Compilation error, an abstract class can NOT be initialized, now matter what is inside it
        // new MoreMoreOperations();
    }

    @Override
    public void printName() {  // Must be public, due to abstract method default as public in interface
        System.out.println("Foobar");
    }
}

abstract class MoreOperations implements Operations { // Use "implements", NOT extends
    public MoreOperations(){}               // Ok, abstract class can have constructor
    private MoreOperations(int i) {}        // Ok, private constructor is allowed
}

abstract class MoreMoreOperations{
    public void printName() {  // Must be public, due to abstract method default as public in interface
        System.out.println("Foobar");
    }
}