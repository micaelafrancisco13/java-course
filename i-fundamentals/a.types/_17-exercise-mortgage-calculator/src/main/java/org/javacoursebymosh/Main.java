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
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = (annualInterestRate / 100) / 12;

        System.out.print("Period in years: ");
        byte numberOfYearsToPay = scanner.nextByte();
        final byte MONTHS = 12;
        byte numberOfPayments = (byte) (numberOfYearsToPay * MONTHS);

        double mortgage =
                (principal) * ((monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfPayments))
                        / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));

        System.out.println("Mortgage " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}