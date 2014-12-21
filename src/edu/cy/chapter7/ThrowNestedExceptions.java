package edu.cy.chapter7;

import java.io.FileNotFoundException;

/**
 * Created by cy on 12/12/14.
 */

class Sup{
    public void print() throws Exception {     // method can be marked with throws any exception, including checked, even there is no logic inside
        System.out.println("Sup");
    }
}

class Sub extends Sup{
    @Override
    public void print() throws FileNotFoundException,ArrayIndexOutOfBoundsException {  // Derived class overriding method can ONLY throw same or derived Checked Exception as the base class method.
        System.out.println("Sub");                                                      // But no requirement for throwing error or runtime exception
    }
}

class SubSub extends Sub{
    @Override
    public void print() {               // Derived class overriding method can throw nothing
        System.out.println("SubSub");
    }

    public static void printStatic() throws FileNotFoundException {
        System.out.println("SubSub: Static");
        throw new FileNotFoundException("SubSub: File not found");
    }
}

public class ThrowNestedExceptions {
    public static void main(String[] args) throws FileNotFoundException,Exception {
        // SubSub.printStatic();        // FileNotFoundException
        new Sub().print();           // Sub

        try {
            new Sub().print();
            new SubSub().print();
        }
        catch (FileNotFoundException e){            // For catch{} block of checked exception ONLY, the possible throwing logic must exist in its try{} block, even it only exist in the throws signature of the method
            System.out.println("File Not Found");
        }
        catch (Exception e){
            System.out.println("Exception");
        }
        finally {
            System.out.println("Finally");
        }
    }
}
