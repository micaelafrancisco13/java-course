package org.javacoursebymosh;

import java.io.IOException;

/**
 * Represents a simple bank account to demonstrate exception throwing.
 */
public class Account {

    /**
     * Deposits a specific value into the account.
     * <p>
     * This method practices <b>defensive programming</b> by validating its input. It ensures
     * that only positive values can be deposited. This type of validation is critical at the
     * boundaries of an application, where it receives input from users or external systems.
     * <p>
     * By using {@code throw new IOException()}, we are throwing a <b>checked exception</b>.
     * This forces the caller of this method to explicitly handle the exception with a
     * {@code try-catch} block or declare it in their own method signature. This is useful when
     * you want to ensure the caller is aware of a potential failure condition.
     *
     * @param value The amount to deposit; must be greater than 0.
     * @throws IOException if the {@code value} is less than or equal to 0.
     */
    public void deposit(float value) throws IOException {
        if (value <= 0) {
            throw new IOException("Deposit amount must be positive.");
        }
        // Proceed with deposit logic here...
    }
}