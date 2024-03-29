package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        var report = new TaxReport(new TaxCalculator2018(100_000));
        report.show();

        // Throughout the lifetime of this program, we can change
        // the dependency w/o having to create a new "report" object.
        report.setCalculator(new TaxCalculator2019());
        report.show();
    }
}