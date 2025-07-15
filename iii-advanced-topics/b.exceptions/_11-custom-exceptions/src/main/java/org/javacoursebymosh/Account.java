package org.javacoursebymosh;

import java.io.IOException;

/**
 * Represents a simple bank account with a balance, supporting deposits and withdrawals.
 */
public class Account {
    /**
     * The current monetary balance of the account.
     */
    private float balance;

    /**
     * Deposits a positive value to increase the account balance.
     *
     * @param value The amount to deposit; must be positive.
     * @throws IOException if the deposit value is non-positive.
     */
    public void deposit(float value) throws IOException {
        if (value <= 0) {
            throw new IOException("Deposit amount must be positive.");
        }
        this.balance += value;
    }

    /**
     * Withdraws a specific value from the account if funds are sufficient.
     * <p>
     * This method enforces a business rule: a user cannot withdraw more money than
     * their current balance. If this rule is violated, it throws a custom, checked
     * {@code InsufficientFundsException}. This is not a programming error, but rather
     * a predictable exceptional scenario that the application must handle gracefully.
     *
     * @param value The amount to withdraw.
     * @throws InsufficientFundsException if the withdrawal amount exceeds the current balance.
     */
    public void withdraw(float value) throws InsufficientFundsException {
        if (value > balance) {
            throw new InsufficientFundsException();
        }
        this.balance -= value;
    }
}