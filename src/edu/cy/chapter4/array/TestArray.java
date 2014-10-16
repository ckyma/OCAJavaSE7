package edu.cy.chapter4.array;

import java.util.Date;

/**
 * Created by yuchen on 14/10/14.
 */
interface MyInterface{}
class MyClass1 implements MyInterface {}
abstract class Vehicle{}
class Car extends Vehicle{}

public class TestArray {
    public static void main(String[] args) {
        int intArray[];
        int[] intArray1[];
        int[] multiArray[];
        int[][] multiArray1;
        int multiArray2[][];

        int[] intArray2 = {1, 2};

        // System.out.println(intArray);    // Error: array has not been initialized

        Object[] objArray = new Object[]{
                new MyClass1(),
                null,
                new Car(),
                new Date(),
                new String("name"),
                new Integer[7]
        };
        System.out.println(objArray.length);
    }
}
