package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // Encapsulation = data + methods that operate on the data
        // We're dealing with the concept of an employee
        // Create a class Employee
        var employee = new Employee();

        // set the value of the fields
        employee.baseSalary = 50_000;
        employee.hourlyRate = 20;

        int wage = employee.calculateWage(10);
        System.out.println("Wage: " + wage);
    }
}