package org.javacoursebymosh;

public class TaxReport {
    // We don't want our tax report class to be dependent on a
    // concrete implementation. We want it to be dependent on an
    // interface.
    private final TaxCalculator calculator;

    // This is what we call "constructor injection"
    // The main class is the one who's going to inject the
    // dependency.
    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }


    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
