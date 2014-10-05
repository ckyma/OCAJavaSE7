package edu.cy.chapter1.library;

/**
 * Created by yuchen on 5/10/14.
 */
public class Librarian {
    public Librarian(){
        Book book = new Book();
        book.author = "ABC";    // OK, protected
        book.modifyTemplate();  // OK, protected
        int c = book.issueCount;    // OK, package accessibility
        book.issueHistory();    // OK, package accessibility
    }
}
