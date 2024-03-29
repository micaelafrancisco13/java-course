package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee();

        // data validation implementation via a setter
        employee.setBaseSalary(50_000);
        // returns the value of a private field via a getter
        System.out.println(employee.getBaseSalary());
        employee.setHourlyRate(20);

        int wage = employee.calculateWage(10);
        System.out.println("Wage: " + wage);
    }
}