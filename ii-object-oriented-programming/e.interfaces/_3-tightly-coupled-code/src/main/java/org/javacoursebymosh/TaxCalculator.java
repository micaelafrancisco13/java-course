package org.javacoursebymosh;

public class TaxCalculator {
    private final double taxableIncome;

    public TaxCalculator(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    // if you modify any logic here, this class and all of its
    // dependencies have to be re-compiled and re-deployed
    public double calculateTax() {
        final double PERCENT = 0.3;
        return taxableIncome * PERCENT;
    }
}
