package edu.cy.chapter1.library;

/**
 * Created by yuchen on 5/10/14.
 */
public class CourseBook extends Book {
    public CourseBook(){
        int c = issueCount; // OK, package accessibility
        issueHistory(); // OK, package accessibility
    }
}
