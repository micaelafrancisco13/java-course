package org.javacoursebymosh;

public class Main {
    static final byte MONTHS_IN_YEAR = 12;
    static final byte PERCENT = 100;

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1000, 1000000);
        float annualInterest = (float) Console.readNumber("Annual interest rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        // create a calculator object to pass to the constructor
        // of the MortgageReport class
        var calculator = new MortgageCalculator(principal, annualInterest, years);

        // and create a single report object to display the
        // relevant information to the console
        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }
}
