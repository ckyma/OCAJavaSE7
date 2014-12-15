package edu.cy.chapter7;

import java.io.FileNotFoundException;

/**
 * Created by phinary0 on 12/12/14.
 */

class Sup{
    public void print() throws Exception {
        System.out.println("Sup");
    }
}

class Sub extends Sup{
    @Override
    public void print() throws FileNotFoundException,ArrayIndexOutOfBoundsException {  // Derived class overriding method can ONLY throw same or derived Checked Exception as the base class method.
        System.out.println("Sub");                                                      // But no requirement for throwing error or runtime exception
    }
}

public class ThrowNestedExceptions {
    public static void main(String[] args) {
        try {
            new Sub().print();
        }
        catch (FileNotFoundException e){
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
