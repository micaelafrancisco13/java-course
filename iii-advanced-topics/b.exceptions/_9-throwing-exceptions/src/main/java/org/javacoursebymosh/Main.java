package org.javacoursebymosh;

import java.io.IOException;

/**
 * The main entry point for the application, demonstrating how to call a method
 * that throws a checked exception.
 */
public class Main {
    /**
     * Demonstrates handling a checked exception thrown from another method.
     * <p>
     * When a method, like {@code account.deposit()}, is declared with {@code throws IOException},
     * the compiler enforces that we handle this <b>checked exception</b>. This is typically
     * done using a {@code try-catch} block.
     * <p>
     * In contrast, if the method threw an <b>unchecked exception</b> (like
     * {@code IllegalArgumentException}), it would typically indicate a programming error. The
     * best practice for unchecked exceptions is often to fix the source of the problem
     * (e.g., not passing an invalid value like -1) rather than catching the exception.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        var account = new Account();
        try {
            // This call requires a try-catch because deposit() throws a checked exception.
            account.deposit(-1);
        } catch (IOException e) {
            System.out.println("An expected error occurred: " + e.getMessage());
        }
    }
}