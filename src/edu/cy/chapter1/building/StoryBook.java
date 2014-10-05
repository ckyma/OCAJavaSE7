package edu.cy.chapter1.building;
import edu.cy.chapter1.library.Book;

/**
 * Created by yuchen on 5/10/14.
 */
public class StoryBook extends Book {
    StoryBook(){
        author = "ABC"; // OK
        modifyTemplate();   // OK
        // Book book = new Book();
        // String v = book.author;  // Error:(12, 24) java: author has protected access in edu.cy.chapter1.library.Book
        // book.modifyTemplate();   // Error:(13, 13) java: modifyTemplate() has protected access in edu.cy.chapter1.library.Book
        // int c = issueCount; // Error: package accessiblity not accessible outside the package
        // issueHistory(); // Error: package accessiblity not accessible outside the package
    }
}
