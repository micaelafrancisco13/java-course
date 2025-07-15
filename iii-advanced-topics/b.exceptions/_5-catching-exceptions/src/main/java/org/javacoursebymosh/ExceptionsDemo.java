package org.javacoursebymosh;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * A class that demonstrates exception handling concepts in Java.
 */
public class ExceptionsDemo {

    /**
     * Demonstrates how to properly handle checked exceptions using a try-catch block.
     * <p>
     * <b>The {@code try} Block:</b><br>
     * This block encloses code that may throw an exception. In this case, creating a
     * {@code new FileReader("file.txt")} can throw a {@code FileNotFoundException}.
     * If an exception occurs on a line within this block, the control immediately jumps
     * to the corresponding {@code catch} block, and any subsequent lines inside the
     * {@code try} block are not executed.
     * <p>
     * <b>The {@code catch} Block:</b><br>
     * This block is executed only when an exception of the specified type
     * ({@code FileNotFoundException}) is thrown in the {@code try} block. The variable
     * {@code ex} is an instance of the exception class and contains details about the
     * error. We can use it to log a message ({@code ex.getMessage()}) or print the full
     * stack trace ({@code ex.printStackTrace()}) for debugging. 🐛
     */
    public static void show() {
        try {
            var reader = new FileReader("file.txt");
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
