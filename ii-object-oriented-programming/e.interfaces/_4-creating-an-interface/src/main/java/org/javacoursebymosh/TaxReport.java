package org.javacoursebymosh;

public class TaxReport {
    private TaxCalculator2018 calculator;

    public TaxReport(TaxCalculator2018 calculator) {
        calculator = new TaxCalculator2018(100_000);
    }

    public void show() {
        System.out.println(calculator.calculateTax());
    }
}

