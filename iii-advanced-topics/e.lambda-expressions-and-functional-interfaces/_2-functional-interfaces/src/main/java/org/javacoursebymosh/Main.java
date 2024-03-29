package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // what is a functional interface?
        // it is an interface with only a single abstract method

        // the Comparable interface is a functional interface, it
        // only has the compareTo()

        // create a functional interface Printer

        // implementation of the Printer interface
        greet(new ConsolePrinter());

        // sometimes, we don't want to explicitly create a class to
        // implement an interface. this is done by using anonymous
        // inner classes
    }

    public static void greet(Printer printer) {
        printer.print("Hello world");
    }
}