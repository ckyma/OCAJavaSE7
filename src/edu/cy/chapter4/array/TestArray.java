package edu.cy.chapter4.array;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.Arrays;

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

        // multiArray = intArray2; // Error, int[][] vs. int[]
        int[] intArray3 = new int[]{1};
        intArray3 = intArray2;
        System.out.println(Arrays.toString(intArray3)); // [1, 2]

        // System.out.println(intArray);    // Error: array has not been initialized
        int[] intArray4 = new int[4];
        System.out.println(Arrays.toString(intArray4)); // [0, 0, 0, 0]

        multiArray = new int[2][];
        // multiArray[0] = new int[2][];   // Error, int[] vs. int[][]
        multiArray[0] = new int[2];
        multiArray[1] = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(multiArray));    // [I@600f11bc, [I@7d557ee8]
        System.out.println(Arrays.deepToString(multiArray));    // [[0, 0], [1, 2, 3]]

        Object[] objArray = new Object[]{
                new MyClass1(),
                null,
                new Car(),
                new Date(),
                new String("name"),
                new Integer[7]
        };
        System.out.println(objArray.length);

        /*
        * println() an Array
         */
        System.out.println(Integer.toHexString(objArray.hashCode()));   // 4aa594e1
        System.out.println(objArray);   // [Ljava.lang.Object;@4aa594e1, i.e. element type @ hashCode()
        System.out.println(intArray2);  // [I@1127a1d8
    }
}
