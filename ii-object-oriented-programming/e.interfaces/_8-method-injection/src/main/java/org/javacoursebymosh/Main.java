package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport();

        // Go to TaxReport class then go back here
        report.show(calculator);
        report.show(new TaxCalculator2019());

        // This is what we call method injection. We pass a
        // dependency to the method that needs that dependency.
    }
}