package org.javacoursebymosh;

/**
 * A general exception for account-related errors, designed to support exception chaining.
 * This acts as a "wrapper" for more specific exceptions.
 */
public class AccountException extends Exception {

    /**
     * Constructs a new AccountException and sets its underlying cause.
     *
     * @param cause The original exception that triggered this one.
     */
    public AccountException(Exception cause) {
        super(cause);
    }
}