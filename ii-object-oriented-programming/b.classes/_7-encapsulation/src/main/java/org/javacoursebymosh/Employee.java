package org.javacoursebymosh;

public class Employee {
    public int baseSalary;
    public int hourlyRate;

    // the method below does not have the 2 fields above as
    // parameters because they are the fields in this class
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
}
