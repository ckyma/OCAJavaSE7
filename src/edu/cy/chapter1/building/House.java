package edu.cy.chapter1.building;
import edu.cy.chapter1.library.Book;

/**
 * Created by yuchen on 5/10/14.
 */
public class House {
    House(){
        Book book = new Book();
        String value = book.isbn;
        book.printBook();
        // book.modifyTemplate();   // Error:(12, 13) java: modifyTemplate() has protected access in edu.cy.chapter1.library.Book
    }
}
