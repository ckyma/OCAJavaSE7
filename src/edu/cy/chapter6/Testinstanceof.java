package edu.cy.chapter6;

import com.sun.xml.internal.fastinfoset.algorithm.BooleanEncodingAlgorithm;

/**
 * Created by yuchen on 30/12/14.
 *
 * @note instanceof check the type of the underlying object not the reference variable.
 */
public class Testinstanceof {
    public static void main(String[] args) {
        B b = new B();
        A a = b;
        // C c = (C) b;                         // Compilation error, incompatible types
        // C c = (C) a;                         // Runtime exception, java.lang.ClassCastException
        System.out.println(a instanceof B);     // true
        System.out.println(a instanceof A);     // true
        System.out.println(a instanceof C);     // false
        System.out.println(a instanceof D);     // false

        A ad = new D();
        System.out.println(a instanceof B);     // true
        // B ba = (B) new A();                  // Runtime exception, java.lang.ClassCastException, explicit casting super to sub class
    }
}

class A {}
class B extends A {}
class C extends A {}
class D extends B {}