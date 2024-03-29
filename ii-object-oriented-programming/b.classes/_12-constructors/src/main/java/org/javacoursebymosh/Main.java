package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // if not using a constructor, whoever is using the
        // Employee class has to remember to call the 3 methods
        // below in order
        // setBaseSalary() -> setHourlyRate() -> calculateWage()
        var employee = new Employee(50_000, 20);
        int wage = employee.calculateWage(10);
        System.out.println("Wage: " + wage);
    }
}