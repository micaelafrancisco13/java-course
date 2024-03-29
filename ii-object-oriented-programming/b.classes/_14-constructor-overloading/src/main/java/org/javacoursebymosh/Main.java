package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // Constructor overloading -> same constructor but with
        // different signatures
        var employee1 = new Employee(50_000, 20);

        // has only 1 argument
        var employee2 = new Employee(50_000);
        int wage = employee2.calculateWage(10);
        System.out.println("Wage: " + wage);
    }
}