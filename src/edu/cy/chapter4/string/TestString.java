package edu.cy.chapter4.string;

/**
 * Created by yuchen on 12/10/14.
 */
public class TestString {
    public static void main(String[] args) {
        String str1 = new String("Harry");
        String str2 = new String("Harry");
        System.out.println(str1 == str2);   // false, comparing addresses

        String str3 = "Harry";
        String str4 = "Harry";
        System.out.println(str3 == str4);   // true, same object and address in the String constant pool
        System.out.println(str1 == str3);   // false, comparing addresses

        // Use array of char to initialize
        char[] name = {'H', 'a', 'r', 'r', 'y'};
        String str5 = new String(name);
        char[] name1 = new char[]{'H', 'a', 'r', 'r', 'y'};
        String str6 = new String(name1);

        // Use StringBuilder Class to initialize
        StringBuilder sd1 = new StringBuilder("Harry");
        String str7 = new String(sd1);
        // Use StringBuffer Class to initialize
        StringBuffer sb1 = new StringBuffer("Harry");
        String str8 = new String(sb1);

        String str9 = null;
        System.out.println(str9);   // null
        // System.out.println(null);   // Ambiguous method call for println(char[]) and println(String)
        System.out.println(str9.substring(0));   // Runtime error, java.lang.NullPointerException

        System.out.println(str1.substring(1, str1.length()));
        // System.out.println(str9 = str1.subSequence(1, 1)); // Error: Incompatible types, subSequence returns a CharSequence object
        System.out.println(str9 = (String) str1.subSequence(1, 2));
    }
}
