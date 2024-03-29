package org.javacoursebymosh;

import java.text.NumberFormat;

public class MortgageReport {
    private static MortgageCalculator calculator;

    // since calculateMortgage() and calculateBalance() are now
    // non-static, an object must be created to access them.

    // note that there are 2 calculators object that will be
    // created, one for line 20 and one for line 35, we can
    // refactor this by declaring the calculator object as a
    // field of this class

    public static void printMortgage(int principal, float annualInterest, byte years) {
        // line 20 should be refactored because we have to
        // call printMortgage() first before the calculator
        // object is initialized
        calculator = new MortgageCalculator(principal, annualInterest, years);
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(' ');
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly payments: " + mortgageFormatted);
    }

    public static void printPaymentSchedule(byte years, int principal, float annualInterest) {
        System.out.println(' ');
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        short numberOfPaymentsMade = 1;
        while (numberOfPaymentsMade <= (years * Main.MONTHS_IN_YEAR)) {
//            double balance = Main.calculateBalance(principal, annualInterest, years, numberOfPaymentsMade);
//            String balanceFormatted = NumberFormat.getCurrencyInstance().format(balance);
//            System.out.println(numberOfPaymentsMade + ". " + balanceFormatted);
            ++numberOfPaymentsMade;
        }
    }
}
