package org.javacoursebymosh;

// a class can extend another class and implement 1 or more
// interfaces simultaneously
public class TaxCalculator2018 implements TaxCalculator {
    private final double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    // implementation of the method that we declare in our
    // interface
    // BEST PRACTICE -> apply "@Override" to interface methods
    @Override
    public double calculateTax() {
        final double PERCENT = 0.3;
        return taxableIncome * PERCENT;
    }
}
