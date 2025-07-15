package org.javacoursebymosh;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * A utility class to demonstrate different types of exceptions.
 */
public class ExceptionsDemo {

    /**
     * Demonstrates both checked and unchecked exceptions.
     * <p>
     * This method contains examples that trigger exceptions. Comment or uncomment lines
     * to see how the Java compiler and runtime behave.
     */
    public static void show() {
        // --- Checked Exception Example ---
        // The FileReader constructor can throw a FileNotFoundException, which is a
        // checked exception. The compiler enforces that we handle it, for example,
        // with a try-catch block.
        try {
            var reader = new FileReader("file.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("LOGGING: A checked exception occurred: " + ex.getMessage());
        }

        // --- Unchecked Exception Example ---
        // Calling a method with a null argument when it's not expected is a programming
        // error that leads to an unchecked (runtime) exception.
        sayHello(null);
    }

    /**
     * Prints the uppercase version of a name.
     *
     * @param name The name to print.
     * @throws NullPointerException if the {@code name} parameter is null.
     */
    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}