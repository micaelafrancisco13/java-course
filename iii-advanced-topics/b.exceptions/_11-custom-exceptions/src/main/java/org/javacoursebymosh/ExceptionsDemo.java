package org.javacoursebymosh;

/**
 * A class to demonstrate handling custom exceptions.
 */
public class ExceptionsDemo {
    /**
     * Demonstrates how to call a method and handle a custom checked exception.
     * <p>
     * The {@code account.withdraw()} method is declared to throw an
     * {@code InsufficientFundsException}. Because this is a checked exception, the
     * compiler requires that we handle it. The {@code try-catch} block allows us
     * to gracefully manage this specific error, for example, by displaying the
     * custom error message to the user.
     */
    public static void show() {
        var account = new Account();

        try {
            account.withdraw(10);
        } catch (InsufficientFundsException e) {
            // Catches the specific business rule exception and prints its friendly message.
            System.out.println(e.getMessage());
        }
    }
}