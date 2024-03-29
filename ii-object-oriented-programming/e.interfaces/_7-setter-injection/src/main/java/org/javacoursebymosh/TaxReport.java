package org.javacoursebymosh;

public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

    // Setter injection
    // In addition to this constructor, we can use this setter
    // to inject a dependency in this class. What's the benefit?
    // The benefit is that we can change these dependencies
    // throughout the lifetime of our program.
    // Create a new class called "TaxCalculator2019" then go back
    // to the main class.
    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}
