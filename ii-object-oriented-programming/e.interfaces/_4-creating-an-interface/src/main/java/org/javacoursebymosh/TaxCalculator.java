package org.javacoursebymosh;

public interface TaxCalculator {
    // An interface can only have method declarations that
    // determine what needs to be done (in this case, we need to
    // be able to calculate the tax).

    // all methods in an interface are public by default

    double calculateTax(); // abstract method
}
