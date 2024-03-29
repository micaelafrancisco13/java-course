package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        var report = new TaxReport(new TaxCalculator2018(100_000));
        report.show();

        // there are new bad features in Java
        // 1. declaring fields in interfaces
        // these fields are constants and static

        // reason for adding this feature?
        // to avoid magic numbers

        // Why is this feature a bad practice?
        // Go to TaxCalculator
        // Can minimumTax's value change from one year to another?
        // Yes, very likely. This constant is something we should
        // declare in our implementations, not in our interface

        // What if we're dealing with a real constant such as PI?
        // This is still an implementation detail.
        // What if we change our implementation and remove the
        // constant on our interface? That means we have broken
        // the contract with our interface and this will impact
        // the classes that are dependent on this interface
    }
}