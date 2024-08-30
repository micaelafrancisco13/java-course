package org.javacoursebymosh;

public class LambdasDemo {
    public static void printAgain(String message) {
        System.out.println("Printing to console using method reference... " + message);
    }

    public static void show() {
        // we're simply passing the "message" to the println().
        // in this cases, we can reference this method directly.
        // lines 17 & 20 are identical
        greet(message -> System.out.println(message));

        // Class/Object::method
        greet(System.out::println);

        // we can reference static or instance methods, as well
        // as constructors.
        greet(LambdasDemo::printAgain);

        var demo = new LambdasDemo();
        greet(demo::print);
    }

    public static void greet(Printer printer) {
        printer.print("Hello world");
    }

    // the signature of this method matches the print() of the Printer interface
    public void print(String message) {
        System.out.println("Printing to console using method reference... " + message);
    }
}
