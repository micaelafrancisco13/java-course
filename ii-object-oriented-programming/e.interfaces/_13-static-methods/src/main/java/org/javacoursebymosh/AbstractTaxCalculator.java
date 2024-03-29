package org.javacoursebymosh;

public abstract class AbstractTaxCalculator implements TaxCalculator {
    // we don't want this to be static because this is an implementation
    // detail

    // we want the concrete implementation extends this abstract class
    protected double getTaxableIncome(double income, double expenses) {
        return income - expenses;
    }
}
