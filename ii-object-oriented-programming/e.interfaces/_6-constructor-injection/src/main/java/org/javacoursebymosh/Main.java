package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // Pass the concrete implementation as a dependency
        var report = new TaxReport(new TaxCalculator2018(100_000));

        // Today we're using TaxCalculator2018. Tomorrow we can
        // create another class like "TaxCalculator2019" and pass
        // this to our tax report. Our tax report doesn't care. It's
        // not affected.
    }
}