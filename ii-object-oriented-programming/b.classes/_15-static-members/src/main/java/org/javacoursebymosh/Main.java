package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // There are 2 types of members
        // 1. Instance members belong to each instance of a class
        // 2. Static members belong to a class (Employee.)

        // When do we use static members?
        // When we want to represent a concept that should be in
        // a single place (Employee.numberOfEmployees)
        var employee = new Employee(50_000, 20);
        int wage = employee.calculateWage(10);
        System.out.println("Wage: " + wage);
        Employee.printNumberOfEmployees();

        // Why is the main method static?
        // To enable the JVM to directly call this method w/o having
        // to create a new object

        // Native static members
        // System.out -> "out" is a static field
        // Integer.parseInt() -> "parseInt" is a static method
    }
}