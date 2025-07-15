package org.javacoursebymosh;

/**
 * A class to demonstrate handling chained exceptions.
 */
public class ExceptionsDemo {
    /**
     * Demonstrates how to catch a general exception and inspect its underlying cause.
     * <p>
     * This method calls {@code account.withdraw()}, which can throw a general
     * {@code AccountException}. Inside the {@code catch} block, we demonstrate how
     * to retrieve the original, wrapped exception (the "cause") using the
     * {@code getCause()} method. This allows for logging or handling the specific
     * root problem while catching a more abstract exception type.
     */
    public static void show() {
        var account = new Account();

        try {
            account.withdraw(10);
        } catch (AccountException e) {
            // Get the original exception that was wrapped inside AccountException.
            Throwable cause = e.getCause();
            System.out.println("An account error occurred. Cause: " + cause.getMessage());
        }
    }
}