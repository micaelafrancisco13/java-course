package org.javacoursebymosh;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    // static field
    private static int numberOfEmployees;

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        ++numberOfEmployees;
    }

    // Note that static members only see fellow static members,
    // not instance members.
    // static method
    public static void printNumberOfEmployees() {
        // instance members can't be accessed from a static method
        System.out.println("Number of employees: " + numberOfEmployees);
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or less.");
        this.hourlyRate = hourlyRate;
    }
}
