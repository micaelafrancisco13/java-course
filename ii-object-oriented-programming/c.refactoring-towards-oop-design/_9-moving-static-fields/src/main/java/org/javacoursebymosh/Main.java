package org.javacoursebymosh;

public class Main {
    // the 2 fields below don't belong to the Main class,
    // they belong to MortgageCalculator class

    // static final byte MONTHS_IN_YEAR = 12;
    // static final byte PERCENT = 100;

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1000, 1000000);
        float annualInterest = (float) Console.readNumber("Annual interest rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        var calculator = new MortgageCalculator(principal, annualInterest, years);
        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }
}
