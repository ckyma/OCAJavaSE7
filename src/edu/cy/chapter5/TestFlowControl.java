package edu.cy.chapter5;

import java.util.ArrayList;

/**
 * Created by yuchen on 19/10/14.
 */
public class TestFlowControl {
    public static void main(String[] args) {
        /*
        * if-else if-else
         */
        // Using 'else' without if block won't compile, need add {}
        if(false)
        {}              // Must have
        else{
            System.out.println("else");
        }

        // When there is no braces, working from the innermost, match 'else' with the nearest 'if'
        int score = 110;
        if (score > 200)
            if(score < 400)
                if(score > 300)
                    System.out.println(">300, <400");
        else
            System.out.println(">200, <=300");
            else
                System.out.println(">=400");

        /*
         * switch
          */
        // int score1 = 1.2;    // Error, Java is more strict for implicit type-casting, only promotion is allowed
        double score1 = 1;      // OK
        System.out.println(score1);         // 1.0
        switch (score){
            case 1:
                System.out.println(1);
                break;
            // case 1.2:   // Error: incompatible types double vs. int
            // case 10/6:  // Error: duplicate 1
            case 13/6:  // Ok, 2. Caution: int/int = int
                System.out.println(2);
            case 'a':
                System.out.println('a');
            default:
                System.out.println(score);
        }

        // switch uses equals() for String
//        String day = "SUN";   // Sunday Tuesday
        String day = "WED";     // NA Sunday Tuesday
        Switch: // Label
        switch (day){
            case "MON":
                System.out.println("Monday");
                break;
            default:
                System.out.println("NA");
                // break;
            case "SUN":
                System.out.println("Sunday");
                break Switch;
            case "Tue":
                System.out.println("Tuesday");
                // continue Switch;             // ONLY loop label is allowed for continue
        }

        /*
        * for loop
         */
        for (int i = 0, j = 0; i < 2 && j < 2; i++, printMethod()){
            System.out.println(i + ", " + j);
        }

        /*
        * enhanced for loop, or for-each loop
         */
        ArrayList<String> exams = new ArrayList<>();
        exams.add("Oracle");
        exams.add("Java");
        ArrayList<String> levels = new ArrayList<>();
        levels.add("Associate");
        levels.add("Professional");
        // Nested ArrayList
        ArrayList<ArrayList<String>> nestedArrayList = new ArrayList<>();
        nestedArrayList.add(exams);
        nestedArrayList.add(levels);

        for (ArrayList<String> nestedElement : nestedArrayList){
            for (String element : nestedElement){
                System.out.println(element);
            }
        }

        ArrayList<StringBuilder> examsSB = new ArrayList<>();
        examsSB.add(new StringBuilder("Oracle"));
        examsSB.add(new StringBuilder("Java"));
        // enhanced for loop create a copy of the element, the change to its value won't change the originals
        for(StringBuilder element : examsSB){
            element = new StringBuilder("Sun");
        }
        for(StringBuilder element : examsSB){
            System.out.println(element);
        }
        // But the change to the underlying object will change the originals
        for(StringBuilder element : examsSB){
            element.append("_Sun");
        }
        for(StringBuilder element : examsSB){
            System.out.println(element);
        }

        // Nested enhanced for loop
        for(StringBuilder element : examsSB){
            System.out.println(element);
            for(StringBuilder element1 : examsSB){
                System.out.println(element1);
            }
        }
    }

    private static void printMethod(){  // Must be declared as 'static', otherwise Error
        System.out.println("Happy");
    }
}
