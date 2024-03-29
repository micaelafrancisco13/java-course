package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // Coupling is about how much a class is dependent upon
        // or coupled to another class.

        // The Main class is coupled to Employee class

        // The following are the coupling points:
        // 1. new Employee() - if we pass an argument, the main
        // class has to be re-compiled
        // 2. employee.setBaseSalary(50_000);
        // 3. employee.setHourlyRate(20);
        // 4. employee.calculateWage(10);

        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println("Wage: " + wage);
    }
}