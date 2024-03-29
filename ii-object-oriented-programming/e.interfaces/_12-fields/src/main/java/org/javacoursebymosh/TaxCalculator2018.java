package org.javacoursebymosh;

public class TaxCalculator2018 implements TaxCalculator {
    private final double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        final double PERCENT = 0.3;
        System.out.println(TaxCalculator.minimumTax);
        return taxableIncome * PERCENT;
    }
}
