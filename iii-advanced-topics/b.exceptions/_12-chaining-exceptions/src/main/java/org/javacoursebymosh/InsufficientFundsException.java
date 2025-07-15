package org.javacoursebymosh;

/**
 * A custom checked exception for when a withdrawal exceeds the account balance.
 * In this context, it serves as the "cause" in an exception chain.
 */
public class InsufficientFundsException extends Exception {
    /**
     * Constructs a new exception with a default detail message.
     */
    public InsufficientFundsException() {
        super("Insufficient funds in your account.");
    }
}