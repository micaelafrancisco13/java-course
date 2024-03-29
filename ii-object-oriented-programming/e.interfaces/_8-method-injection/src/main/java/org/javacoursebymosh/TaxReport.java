package org.javacoursebymosh;

public class TaxReport {
    // Method injection
    public void show(TaxCalculator calculator) {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
