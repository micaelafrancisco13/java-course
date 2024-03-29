package org.javacoursebymosh;

public class ConsolePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Printing to console... " + message);
    }
}
