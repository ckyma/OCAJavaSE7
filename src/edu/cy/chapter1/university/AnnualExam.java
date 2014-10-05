package edu.cy.chapter1.university;
import static edu.cy.chapter1.certification.ExamQuestion.*; // import static

/**
 * Created by yuchen on 5/10/14.
 */
public class AnnualExam {
    AnnualExam(){
        marks = 20; // static variables can be used directly
        print();    // static methods can be invoked directly
        // numbers = 1;    // Error: cannot find symbol, only static members can be imported
    }
}
