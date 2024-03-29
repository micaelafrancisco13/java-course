package org.javacoursebymosh;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        // 1234567 as $1,234,567.00 or
        // 0.1 as 10%

        // NumberFormat can't be instantiated.
        // instead, it has a bunch of get methods
        // getCurrencyInstance() creates an instance
        // of the NumberFormat class and return it.
        // this is what we call a "factory method"
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        // this returns a string representation of this number
        // formatted as currency
        // prints "₱1,234,567.89"
        System.out.println(currency.format(1234567.891));

        // prints "13%"
        System.out.println(NumberFormat.getPercentInstance().format(0.13));
    }
}