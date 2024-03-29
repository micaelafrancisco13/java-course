package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // Abstraction reduces complexity by hiding unnecessary
        // details
        var employee = new Employee();

        employee.setBaseSalary(50_000);
        System.out.println(employee.getBaseSalary());
        employee.setHourlyRate(20);

        int wage = employee.calculateWage(10);
        System.out.println("Wage: " + wage);
    }
}