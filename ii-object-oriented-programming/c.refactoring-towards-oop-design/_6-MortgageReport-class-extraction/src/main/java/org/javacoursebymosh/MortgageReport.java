package org.javacoursebymosh;

import java.text.NumberFormat;

public class MortgageReport {
    static void printMortgage(int principal, float annualInterest, byte years) {
        // note that calculateMortgage() and calculateBalance()
        // are refactored over the next sections
        double mortgage = Main.calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(' ');
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly payments: " + mortgageFormatted);
    }

    static void printPaymentSchedule(byte years, int principal, float annualInterest) {
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
