package edu.cy.chapter3;

/**
 * Created by yuchen on 11/10/14.
 */
public class Office {
    public static void main(String[] args) {
        // User-defined constructor
        Employee emp = new Employee();
        emp.Employee();
        System.out.println(emp.name);   // null
        System.out.println(emp.age);    // 0

        // Default constructor
        {
            EmployeeNoConstruct emp1 = new EmployeeNoConstruct();
            EmployeeNoConstruct emp2 = new EmployeeNoConstruct();
            System.out.println(emp1.name);  // null
            System.out.println(emp1.age);   // 0
            emp1.name = "emp1";
            emp2.name = "emp2";
        }

        System.out.println(emp.daysOffWork(1, 2, 3, 4));
        System.out.println(emp.daysOffWork(1, 2, 3));
    }
}
