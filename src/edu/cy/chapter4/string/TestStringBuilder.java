package edu.cy.chapter4.string;

/**
 * Created by yuchen on 14/10/14.
 */
public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("0123456");
        System.out.println(sb1.substring(2, 4));
        System.out.println(sb1.reverse());
        // System.out.println(sb1.substring(2, 4).reverse());   // Cannot find symbol, i.e. cannot use reverse for substring

        /*
        * insert()
          */
        // sb1.insert(sb1.length()+1, "z"); // runtime error, java.lang.StringIndexOutOfBoundsException
        sb1.insert(sb1.length(), "z");
        System.out.println(sb1);

        sb1.delete(sb1.length()-1, sb1.length());

        sb1.replace(4, 6, "7");
        System.out.println(sb1);
        sb1.replace(4, 5, "89");
        System.out.println(sb1);
        sb1.replace(4, 6, null);

    }
}
