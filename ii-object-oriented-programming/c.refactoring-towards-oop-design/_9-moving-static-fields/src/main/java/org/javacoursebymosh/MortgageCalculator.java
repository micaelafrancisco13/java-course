package org.javacoursebymosh;

public class MortgageCalculator {
    public static final byte MONTHS_IN_YEAR = 12;
    public static final byte PERCENT = 100;

    private int principal;
    private float annualInterest;

    private byte years;

    public MortgageCalculator(int principal,
                              float annualInterest,
                              byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

        return principal
                * (Math.pow((1 + monthlyInterest), numberOfPayments)
                - Math.pow((1 + monthlyInterest), numberOfPaymentsMade))
                / (Math.pow((1 + monthlyInterest), numberOfPayments) - 1);
    }

    public double calculateMortgage() {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

        return principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public byte getYears() {
        return years;
    }
}
