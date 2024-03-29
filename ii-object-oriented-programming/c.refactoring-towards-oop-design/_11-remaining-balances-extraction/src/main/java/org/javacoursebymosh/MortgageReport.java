package org.javacoursebymosh;

import java.text.NumberFormat;

public class MortgageReport {
    private final MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(' ');
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
        System.out.println(' ');
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");

        // this class should not worry about calculating the
        // remaining balance for each month.
        // move the while-loop to the MortgageCalculator class
        // and call the method "getPaymentSchedule()"

        // short numberOfPaymentsMade = 1;
        // while (numberOfPaymentsMade <= (calculator.getYears() * MortgageCalculator.MONTHS_IN_YEAR)) {
        //    double balance = calculator.calculateBalance(numberOfPaymentsMade);
        //    String balanceFormatted = NumberFormat.getCurrencyInstance().format(balance);
        //    System.out.println(numberOfPaymentsMade + ". " + balanceFormatted);
        //    ++numberOfPaymentsMade;
        // }

        // refactored version
        for (double balance : calculator.getRemainingBalances()) {
            String balanceFormatted = NumberFormat.getCurrencyInstance().format(balance);
            System.out.println(balanceFormatted);
        }
    }
}
