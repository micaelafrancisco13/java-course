package org.javacoursebymosh;

public class MortgageCalculator {
    // both these methods have the same 3 parameters, apply
    // encapsulation by storing the values to the fields of this
    // class
    private int principal;
    private float annualInterest;
    private byte years;

    // add a constructor to initialize the fields the moment we
    // create a calculator object
    public MortgageCalculator(int principal,
                              float annualInterest,
                              byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    // now that the fields are present, remove the 3 parameters
    // and make the 2 methods below as non-static.
    // go to MortgageReport
    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * Main.MONTHS_IN_YEAR);

        return principal
                * (Math.pow((1 + monthlyInterest), numberOfPayments)
                - Math.pow((1 + monthlyInterest), numberOfPaymentsMade))
                / (Math.pow((1 + monthlyInterest), numberOfPayments) - 1);
    }

    public double calculateMortgage() {
        float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * Main.MONTHS_IN_YEAR);

        return principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }
}
