package org.javacoursebymosh;

import java.io.IOException;

public class Account {
    private float balance;

    public void deposit(float value) throws IOException {
        if (value <= 0) throw new IOException();
    }

    public void withdraw(float value) throws InsufficientFundsException {
        // "value" is a user input, hence, this is a checked
        // exception

        // when throwing an exception, we want to handle it
        // somewhere else
        if (value > balance) throw new InsufficientFundsException();
    }
}
