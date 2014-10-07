package edu.cy.chapter1.library;

/**
 * Created by yuchen on 5/10/14.
 */
public class Book { // Error after removing "public", as the derived class in the other package can NOT access it
    public String isbn;
    public void printBook(){}
    protected String author;
    protected void modifyTemplate(){}
    int issueCount; // package or default accessibility
    void issueHistory(){}   // package or default accessibility
    public static void main(String[] args) {
        System.out.println("Book");
    }
}

// public class Book1{}    // Error:(15, 8) java: class Book1 is public, should be declared in a file named Book1.java
class Book1{
    public static void main(String[] args) {
        System.out.println("Book1");
    }
}