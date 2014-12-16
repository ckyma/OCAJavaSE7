package edu.cy.chapter8.q85;

/**
 * Created by cy on 12/16/14.
 * @ a is wrong, d is right
 * a. The code prints Camera:null.
 * b. The code prints Camera:Adjust settings manually.
 * c. The code will print Camera:.
 * d. The code will fail to compile.
 *
 * @Caution Compilation Error: java: unreachable statement is for loop only, "while" and "for", NOT for "if" and even "do-while". For literal "false" and "final" boolean variable of value false.
 */

public class Camera {
    public static void main(String args[]) {
        String settings;        // local variable is not initialized, even for object reference.

        // System.out.println("Camera:" + settings);  // Compilation Error: java: variable settings might not have been initialized

        /*
        * Original case:
         */
        // while (false) {                                 // Compilation Error: java: unreachable statement, including { }
        //     settings = "Adjust settings manually";
        // }
        // System.out.println("Camera:" + settings);    // Compilation Error: java: variable settings might not have been initialized

        /*
        * Similar cases:
         */
        /* Case 1: */
        // while(false);    // Compilation Error

        /* Case 2: */
        if(false);         // Ok
        if(false){}         // Ok

        /* Case 3: */
        boolean b = false;
        while(b){
            settings = "Adjust settings manually";
        }
        // System.out.println("Camera:" + settings);       // Compilation Error: java: variable settings might not have been initialized

        /* Case 4: */
        while(b){}          // Ok
        while(b);           // Ok

        /* Case 5: */
        final boolean c = false;
        // while(c){}          // Compilation Error:(9, 23) java: unreachable statement, including { }

        /* Case 6: */
        do;                     // must with ; or {}
        while (false);          // ok
        do {}
        while (false);          // ok

        /* Case 7: */
        // for(;false;);        // Compilation Error: java: unreachable statement, including { }
        // for(;false;){}
    }
}
