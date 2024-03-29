package org.javacoursebymosh;

public class MortgageCalculator {
    // we can now make these 2 static fields private
    private static final byte MONTHS_IN_YEAR = 12;
    private static final byte PERCENT = 100;

    private final int principal;
    private final float annualInterest;
    private final byte years;

    public MortgageCalculator(int principal,
                              float annualInterest,
                              byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = getMonthlyInterest();
        short numberOfPayments = getNumberOfPayments();
        return principal
                * (Math.pow((1 + monthlyInterest), numberOfPayments) - Math.pow((1 + monthlyInterest), numberOfPaymentsMade))
                / (Math.pow((1 + monthlyInterest), numberOfPayments) - 1);
    }

    public double calculateMortgage() {
        float monthlyInterest = getMonthlyInterest();
        short numberOfPayments = getNumberOfPayments();

        return principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    private short getNumberOfPayments() {
        return (short) (years * MONTHS_IN_YEAR);
    }

    // getRemainingBalances() returns a double[] to be iterated by the
    // MortgageCalculator's printPaymentSchedule()
    public double[] getRemainingBalances() {
        double[] balances = new double[getNumberOfPayments()];

        short numberOfPaymentsMade = 1;
        while (numberOfPaymentsMade <= balances.length) {
            balances[numberOfPaymentsMade - 1] = calculateBalance(numberOfPaymentsMade);
            ++numberOfPaymentsMade;
        }

        return balances;
    }

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }

    // delete getYears()
}
