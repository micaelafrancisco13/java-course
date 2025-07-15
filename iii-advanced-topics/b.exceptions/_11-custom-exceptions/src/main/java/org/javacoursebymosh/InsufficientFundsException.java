package org.javacoursebymosh;

/**
 * A custom-checked exception that represents the business rule violation of
 * attempting to withdraw more funds than are available in an account.
 * <p>
 * In Java, custom exceptions are created by extending one of the existing
 * throwable classes.
 * <ul>
 * <li>Extending {@code Exception} (as done here) creates a <b>checked exception</b>.
 * The compiler forces the caller to handle it.</li>
 * <li>Extending {@code RuntimeException} creates an <b>unchecked exception</b>, which
 * typically represents a programming error.</li>
 * </ul>
 */
public class InsufficientFundsException extends Exception {

    /**
     * Constructs a new exception with a default detail message.
     */
    public InsufficientFundsException() {
        super("Insufficient funds in your account.");
    }

    /**
     * Constructs a new exception with the specified detail message.
     *
     * @param message The detail message.
     */
    public InsufficientFundsException(String message) {
        super(message);
    }
}