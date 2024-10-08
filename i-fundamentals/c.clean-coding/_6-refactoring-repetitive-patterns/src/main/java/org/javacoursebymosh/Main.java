package org.javacoursebymosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int principal = (int) readNumber("Principal: ", 1000, 1000000);
        float annualInterest = (float) readNumber("Annual interest rate: ", 1, 30);
        byte years = (byte) readNumber("Period (Years): ", 1, 30);

        double mortgage = calculateMortgage(principal, annualInterest, years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }

    public static double calculateMortgage(int principal,
                                           float annualInterest,
                                           byte years) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

        return principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    // readInt(), readFloat(), readByte(), are still not reusable
    // the reusable method is shown below
    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        // we want to work with a generic variable
        double value;

        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            // the range depends on the prompt
            if (value >= min && value <= max)
                break;

            System.out.println("Enter a value between " + min + " and " + max);
        }

        return value;
    }
}
