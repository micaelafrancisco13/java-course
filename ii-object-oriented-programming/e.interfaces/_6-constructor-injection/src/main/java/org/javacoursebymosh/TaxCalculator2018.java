package org.javacoursebymosh;

public class TaxCalculator2018 implements TaxCalculator {
    private final double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    // If we change the 30% here to 40%, our TaxReport is not
    // affected. Yes, the code in this class has to be recompiled,
    // but because the TaxReport is not dependent on that
    // concrete implementation, it doesn't need to be recompiled.
    // It doesn't need any modifications. So this is "loose
    // coupling" in action.
    @Override
    public double calculateTax() {
        final double PERCENT = 0.3;
        return taxableIncome * PERCENT;
    }
}
