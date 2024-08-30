package org.javacoursebymosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // output on the terminal window:
        // Principal: 100000
        // Annual interest rate: 3.92
        // Period in years: 30
        // Mortgage: $472.81

        Scanner scanner = new Scanner(System.in);
        System.out.println("MORTGAGE CALCULATOR");
        int principal;
        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();

            if (principal >= 1000 && principal <= 1_000_000) break;
            else System.out.println("Enter a number between 1,000 to 1,000,000.");
        }

        double monthlyInterestRate;
        while (true) {
            System.out.print("Annual interest rate: ");
            double annualInterestRate = scanner.nextDouble();

            if (annualInterestRate > 0 && annualInterestRate <= 30) {
                monthlyInterestRate = (annualInterestRate / 100) / 12;
                break;
            } else System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }

        byte numberOfPayments;
        while (true) {
            System.out.print("Period in years: ");
            byte numberOfYearsToPay = scanner.nextByte();
            final byte MONTHS = 12;

            if (numberOfYearsToPay >= 1 && numberOfYearsToPay <= 30) {
                numberOfPayments = (byte) (numberOfYearsToPay * MONTHS);
                break;
            } else System.out.println("Enter a value between 1 and 30.");
        }

        double mortgage =
                (principal) * ((monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfPayments))
                        / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));

        System.out.println("Mortgage " + NumberFormat.getCurrencyInstance().format(mortgage));

    }
}