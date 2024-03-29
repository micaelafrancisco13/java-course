package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // Method overloading -> same method but with different
        // signatures
        var employee = new Employee(50_000, 20);
        int wage1 = employee.calculateWage(10);
        int wage2 = employee.calculateWage(); // w/o argument
        System.out.println("Wage: " + wage2);
    }
}