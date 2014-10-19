package edu.cy.chapter4.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by CY on 10/15/14.
 */
class MyPerson{
    String name;
    MyPerson(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof MyPerson){
            // MyPerson p = obj;   // Incompatible types: MyPerson vs. Object
            MyPerson p = (MyPerson) obj;    // // Need typecasting
            // boolean isEqual = p.name.equals(this.name);
            // return isEqual;
            return p.name.equals(this.name);
        }else{
            return false;
        }
    }
}

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> myArrayList1 = new ArrayList<String>();
        ArrayList<String> myArrayList2 = new ArrayList<>();

        // ArrayList<int> myArrayList3 = new ArrayList<>();    // Error, type cannot be primitives
        ArrayList<Integer> myArrayList3 = new ArrayList<>();
        Integer intVal = new Integer(1);
        myArrayList3.add(intVal);
        myArrayList3.add(2);
        myArrayList3.add(new Integer('a'));
        Integer[] intArray = {1, 2};
        // myArrayList3.addAll(intArray);  // Error, cannot be primitive array [], must be Collection<>
        myArrayList3.addAll(myArrayList3);
        System.out.println(myArrayList3);   // [1, 2, 97, 1, 2, 97]

        // ArrayList<char> myArrayList4 = new ArrayList<>();   // Error, type cannot be primitives
        ArrayList<Character> myArrayList4 = new ArrayList<>();
        myArrayList4.add('a');
        // myArrayList4.add("b");  // Error
        System.out.println(myArrayList4);   // [a]

        MyPerson p1 = new MyPerson("Tom");
        MyPerson p2 = new MyPerson("Jerry");
        MyPerson p3 = new MyPerson("Paul");

        /*
        * declaration and add()
         */
        ArrayList<MyPerson> myPersonArrayList = new ArrayList<>();
        myPersonArrayList.add(p1);
        myPersonArrayList.add(p3);

        for(MyPerson person : myPersonArrayList){
            System.out.println(person.name);
        }

        myPersonArrayList.add(1, p2);

        /*
        * Iterator
         */
        Iterator<MyPerson> iterator1 = myPersonArrayList.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next().name);
        }

        /*
        * remove()
         */
        myPersonArrayList.remove(0);

        /*
        * ListIterator
         */
        ListIterator<MyPerson> iterator2 = myPersonArrayList.listIterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next().name);
        }

        myPersonArrayList.add(0, p1);
        // remove() by override the equals() method
        myPersonArrayList.remove(new MyPerson("Jerry"));

        iterator2 = myPersonArrayList.listIterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next().name);
        }

        /*
        * get(index), size()
         */
        // Due to string the address or reference, so both values of the element in the ArrayList and p1 changed
        myPersonArrayList.get(0).name = "Tommy";
        for(int i = 0; i < myPersonArrayList.size(); i++){
            System.out.println(myPersonArrayList.get(i).name);
        }
        System.out.println(p1.name);

        /*
        * contains(), indexOf(), lastIndexOf()
         */
        ArrayList<StringBuilder> myArrayList = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("SB1");
        StringBuilder sb2 = new StringBuilder("SB2");
        myArrayList.add(sb1);
        myArrayList.add(sb2);
        myArrayList.add(sb2);

        // Default
        System.out.println(myArrayList.contains(sb1));                          // true
        System.out.println(myArrayList.contains(new StringBuilder("SB1")));     // false
        System.out.println(myArrayList.indexOf(sb2));                           // 1
        System.out.println(myArrayList.indexOf(new StringBuilder("SB2")));      // -1
        System.out.println(myArrayList.lastIndexOf(sb2));                       // 2
        System.out.println(myArrayList.lastIndexOf(new StringBuilder("SB2")));  // -1

        // After override equals()
        System.out.println(myPersonArrayList.contains(p1));                     // true
        System.out.println(myPersonArrayList.contains(new MyPerson("Tommy")));  // true
        System.out.println(myPersonArrayList.indexOf(p3));                      // 1
        System.out.println(myPersonArrayList.indexOf(new MyPerson("Paul")));    // 1

        // clone()
        ArrayList<StringBuilder> assignedArrayList = myArrayList;
        // ArrayList<StringBuilder> clonedArrayList = myArrayList.clone(); // Incompatible types: clone() returns Object
                                                                            // public Object clone() {}
        ArrayList<StringBuilder> clonedArrayList = (ArrayList<StringBuilder>) myArrayList.clone(); // Need typecasting

        System.out.println(assignedArrayList == myArrayList);   // true
        System.out.println(clonedArrayList == myArrayList);     // false
        System.out.println(clonedArrayList.get(0));             // SB1
        System.out.println(clonedArrayList.get(0) == myArrayList.get(0));   // true
        // Changed the original reference, so the original and cloned get(0) are two different objects now
        myArrayList.set(0, new StringBuilder("SB0"));
        System.out.println(myArrayList.get(0));     // SB0
        System.out.println(clonedArrayList.get(0)); // SB1
        System.out.println(clonedArrayList.get(0) == myArrayList.get(0));   // false
        // get(1) Still the same object
        myArrayList.get(1).append("+1");
        System.out.println(clonedArrayList.get(1)); // SB2+1

        // clear()
        System.out.println(myArrayList1);   // []
        System.out.println(clonedArrayList);    // [SB1, SB2+1, SB2+1]
        // System.out.println(clonedArrayList.clear()); // Error, cannot println a method returning "void"
        clonedArrayList.clear();
        System.out.println(clonedArrayList);    // []

        // Assign null to element
        myArrayList.set(1, null);
        System.out.println(myArrayList.size()); // 3
        System.out.println(myArrayList);    // [SB0, null, SB2+1]
    }
}
