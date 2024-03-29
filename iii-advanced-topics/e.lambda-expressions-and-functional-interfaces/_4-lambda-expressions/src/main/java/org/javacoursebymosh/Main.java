package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        greet(new ConsolePrinter());

        // Java 8 introduced a better alternative to anonymous inner classes,
        // that's called a lambda expression
        greet(message -> System.out.println(
                "Printing to console using lambda expression... " +
                        message));

        // whenever we have a functional interface, we can represent this
        // interface using a lambda expression

        // we can store lambda expressions in a variable
        // lambda expressions are essentially objects
        Printer printer1 = new ConsolePrinter();
        Printer printer2 = message -> System.out.println(
                "Printing to console using lambda expression... " +
                        message);
    }

    public static void greet(Printer printer) {
        printer.print("Hello world");
    }
}