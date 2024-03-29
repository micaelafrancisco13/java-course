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
        short numberOfPaymentsMade = 1;
        // from Main.MONTHS_IN_YEAR to MortgageCalculator.MONTHS_IN_YEAR
        while (numberOfPaymentsMade <= (calculator.getYears() * MortgageCalculator.MONTHS_IN_YEAR)) {
            double balance = calculator.calculateBalance(numberOfPaymentsMade);
            String balanceFormatted = NumberFormat.getCurrencyInstance().format(balance);
            System.out.println(numberOfPaymentsMade + ". " + balanceFormatted);
            ++numberOfPaymentsMade;
        }
    }
}
