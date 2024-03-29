package org.javacoursebymosh;

public class TaxReport {
    // we're dependent on the TaxCalculator class
    private TaxCalculator calculator;

    // if you go back to TaxCalculator and add a parameter
    // (line 10), our TaxReport will be broken
    public TaxReport(TaxCalculator calculator) {
        calculator = new TaxCalculator(100_000);
    }

    public void show() {
        System.out.println(calculator.calculateTax());
    }
}

