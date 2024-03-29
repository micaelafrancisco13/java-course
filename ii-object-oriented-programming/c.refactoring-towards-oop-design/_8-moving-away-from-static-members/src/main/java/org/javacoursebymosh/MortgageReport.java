package org.javacoursebymosh;

import java.text.NumberFormat;

public class MortgageReport {
    private final MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    public void printMortgage() {
        // calculator = new MortgageCalculator(principal, annualInterest, years);
        // we just simply call calculateMortgage() from the calculator object
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(' ');
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly payments: " + mortgageFormatted);
    }

    // "byte years" is a parameter of printPaymentSchedule()
    // we can access the years variable via the calculator
    // object
    // line 32 calculator.getYears()
    public void printPaymentSchedule() {
        System.out.println(' ');
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        short numberOfPaymentsMade = 1;
        while (numberOfPaymentsMade <= (calculator.getYears() * Main.MONTHS_IN_YEAR)) {
            // use calculateBalance() from the calculator object
            double balance = calculator.calculateBalance(numberOfPaymentsMade);
            String balanceFormatted = NumberFormat.getCurrencyInstance().format(balance);
            System.out.println(numberOfPaymentsMade + ". " + balanceFormatted);
            ++numberOfPaymentsMade;
        }
    }
}
