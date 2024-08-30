package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        greet(new ConsolePrinter());

        // sometimes, we don't want to explicitly create a class to
        // implement an interface. this is done by using anonymous
        // inner classes.

        // instead of creating a new instance of the ConsolePrinter
        // class, here we can do this:
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(
                        "Printing to console using anonymous inner class... " +
                                message);
            }
        });

        // it's anonymous because new Printer() class does not have
        // a name. and we call it inner class because we're using it
        // inside a method.

        // Java 8 introduced a better alternative to anonymous inner classes,
        // that's called a lambda expression
    }

    public static void greet(Printer printer) {
        printer.print("Hello world");
    }
}