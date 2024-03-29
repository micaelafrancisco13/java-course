package org.javacoursebymosh;

// we can remove "implements TaxCalculator" because the
// AbstractTaxCalculator already does this
public class TaxCalculator2018 extends AbstractTaxCalculator {
    private final double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        // in this class, we can access getTaxableIncome()
        // we have inherited a reusable hidden logic from the outside
        final double PERCENT = 0.3;
        return taxableIncome * PERCENT;
    }
}
