package org.javacoursebymosh;

import java.io.IOException;

/**
 * Represents a simple bank account to demonstrate exception throwing.
 */
public class Account {
    /**
     * Deposits a positive value into the account.
     *
     * @param value The amount to deposit, which must be greater than 0.
     * @throws IOException if the provided {@code value} is non-positive.
     */
    public void deposit(float value) throws IOException {
        if (value <= 0) {
            throw new IOException("Deposit amount must be positive.");
        }
    }
}