package org.javacoursebymosh;

import java.text.NumberFormat;

public class Main {
    static final byte MONTHS_IN_YEAR = 12;
    static final byte PERCENT = 100;

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1000, 1000000);
        float annualInterest = (float) Console.readNumber("Annual interest rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        printMortgage(principal, annualInterest, years);
        printPaymentSchedule(years, principal, annualInterest);
    }

    private static void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(' ');
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly payments: " + mortgageFormatted);
    }

    private static void printPaymentSchedule(byte years, int principal, float annualInterest) {
        System.out.println(' ');
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        short numberOfPaymentsMade = 1;
        while (numberOfPaymentsMade <= (years * MONTHS_IN_YEAR)) {
            double balance = calculateBalance(principal, annualInterest, years, numberOfPaymentsMade);
            String balanceFormatted = NumberFormat.getCurrencyInstance().format(balance);
            System.out.println(numberOfPaymentsMade + ". " + balanceFormatted);
            ++numberOfPaymentsMade;
        }
    }

    private static double calculateBalance(int principal,
                                           float annualInterest,
                                           byte years,
                                           short numberOfPaymentsMade) {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

        return (principal *
                (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public static double calculateMortgage(int principal,
                                           float annualInterest,
                                           byte years) {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

        return principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }
}
