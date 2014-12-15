package edu.cy.chapter2;

/**
 * Created by phinary0 on 10/7/14.
 */
public class DataTypes {
    public static void main(String[] args) {

        /*
        * 2.1.1 Boolean
         */
        boolean result = true;
        System.out.println(result); // true
        // boolean result1 = 1;    // Error: incompatible types

        /*
        * 2.1.2 Numeric
         */
        long fishInSea = 764398609800L;
         // byte Byte = fishInSea; // Error: incompatible types
        // byte Byte = 1000;    // Error: incompatible types, 1000 is too long for byte type, is considered as int now.
        byte Byte = 100;

        int baseDecimal = 267;
        int octVal = 0413;
        int hexVal = 0x10B;
        int binVal = 0b100001011;   // Error:(15, 22) java: binary literals are not supported in -source 1.6,
        // solution: File -> Project Structure -> Project -> Project language level -> 7.0

        // Use underscore to group the literal without any real meaning
        int baseDecimal1 = 2_6_7;
        int octVal1 = 0_413;
        int hexVal1 = 0x1_0B;
        int binVal1 = 0b100_001_011;
        // int i = Integer.parseInt("45_98");  // Runtime Error: java.lang.NumberFormatException: For input string: "45_98"
        // System.out.println(i);

        System.out.println(baseDecimal + octVal);   // 534, System.out.println() print decimal value by default
        System.out.println(hexVal + binVal);    // 534, System.out.println() print decimal value by default
        System.out.println(Integer.toBinaryString(0b100001011));    // 100001011

        long var7 = 100___12__12;
        System.out.println(var7);   // 1001212

        float average = 20.1F;
        float orbit = 1765.6f;
        // float orbit1 = 1765.6;   // Error: incompatible types, default is double
        double inclination = 120.1;
        double inclination1 = 120;
        // int inclination2 = 120.1;   // Error: incompatible types, default is double, can assign type promotion only, stricter than C++

        /*
        * 2.1.3 Character
         */
        char c1 = 'D';
        // char c2 = "D";   // Error
        char c3 = 122;
        char c4 = '\u0122';
        // char c5 = -122; // Error
        char c6 = (char) -122;  // casting

        System.out.println("c1 = " + c1);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);
        System.out.println("c6 = " + c6);

        /*
        * 2.2 Identifiers
         */
        int $dollar = 0;
        int _val = 0;
        int m, n;

        /*
        * 2.4 Operators
         */
        // int a += 1; // Error
        // int a;
        // System.out.println(a);  // Error:(74, 28) java: variable a might not have been initialized

        long b = 100976543356L;
        // int c = b; // Error: incompatible types
        int c = (int) b;
        System.out.println(c);  // -2102671748

        System.out.println(10 / 6);   // 1
        System.out.println(10 / 6.0); // 1.6666666666666667
        double d = 10 / 6;
        System.out.println(d);  // 1.0
        System.out.println(0f); // 0.0, caution: printed with ".0" for double and float
        System.out.println(10.0 % 6.0); // 4.0
        System.out.println(0 % 6); // 0
        System.out.println(1 % 6); // 1
        System.out.println(2 % 6); // 2

    }
}
