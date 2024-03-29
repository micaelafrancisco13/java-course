package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        var report = new TaxReport(new TaxCalculator2018(100_000));
        report.show();

        // there are new bad features in Java
        // 1. declaring fields in interfaces
        // these fields are constants and static

        // 2. static methods in interfaces
        // what is wrong with this?
        // Go to TaxCalculator.
        // TaxCalculator has implementation and this logic can
        // change in the future

        // Interfaces are about WHATs not HOWs

        // What if we need to reuse the getTaxableIncome() across
        // all classes that implement this interface?
        // That's when you define an abstract class and move this
        // logic there, so it can be shared by all its children
    }
}