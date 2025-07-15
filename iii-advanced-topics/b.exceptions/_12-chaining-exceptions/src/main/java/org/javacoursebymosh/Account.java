package org.javacoursebymosh;

import java.io.IOException;

/**
 * Represents a simple bank account that demonstrates exception chaining.
 */
public class Account {
    private float balance;

    public void deposit(float value) throws IOException {
        if (value <= 0) {
            throw new IOException("Deposit amount must be positive.");
        }
        this.balance += value;
    }

    /**
     * Withdraws a value, demonstrating exception chaining.
     * <p>
     * Instead of throwing multiple specific exceptions, this method throws a single,
     * more general {@code AccountException}. If a specific error occurs (like
     * insufficient funds), it creates the specific exception
     * ({@code InsufficientFundsException}) and "wraps" it inside the
     * {@code AccountException}. This technique keeps the method's API stable,
     * even if new types of internal errors are added later.
     *
     * @param value The amount to withdraw.
     * @throws AccountException if an error occurs during the withdrawal process.
     */
    public void withdraw(float value) throws AccountException {
        if (value > this.balance) {
            // Throw a general exception, with the specific exception as its cause.
            throw new AccountException(new InsufficientFundsException());
        }
    }
}