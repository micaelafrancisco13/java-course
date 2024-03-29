package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        String prefix = "-";

        greet(message -> System.out.println(
                "Printing to console using lambda expression... " +
                        prefix + message));

        // in the body of the lambda expression, we can access the ff:
        // 1. variables in the enclosing method
        // 2. static and instance fields

        // "this," in the body of the lambda expression represents the
        // enclosing class whereas in anonymous inner classes, "this"
        // represents the inner class
    }

    public static void greet(Printer printer) {
        printer.print("Hello world");
    }
}