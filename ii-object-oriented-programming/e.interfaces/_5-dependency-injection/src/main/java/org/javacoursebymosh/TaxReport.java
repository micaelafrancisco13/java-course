package org.javacoursebymosh;

public class TaxReport {
    private final TaxCalculator2018 calculator;

    // Creating a calculator object and using it are 2 different
    // concerns, and we need to separate them.
    // We want to take the responsibility of creating this
    // dependency from our report class and give it to another
    // class. We'll have that class give our report class a
    // calculator object. Hence, that other class will pass or
    // inject a dependency.
    // Ways to pass dependencies:
    // 1. Constructor injection
    // 2. Setter injection
    // 3. Regular method injection
    public TaxReport() {
        calculator = new TaxCalculator2018(100_000);
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
