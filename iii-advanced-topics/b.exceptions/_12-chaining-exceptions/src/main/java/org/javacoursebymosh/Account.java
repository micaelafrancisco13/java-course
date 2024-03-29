package org.javacoursebymosh;

import java.io.IOException;

public class Account {
    private float balance;

    public void deposit(float value) throws IOException {
        if (value <= 0) throw new IOException();
    }

    // assume that withdrawing money could fail for various
    // reasons, so here, we could throw another exception apart
    // from InsufficientFundsException

    // we could create an "AccountException" then we can wrap
    // InsufficientFundsException inside that AccountException

    // more general exception -> what caused that exception?
    public void withdraw(float value) throws AccountException {
        // we're throwing an AccountException that is caused by
        // InsufficientFundsException
        if (value > balance)
            throw new AccountException(new InsufficientFundsException());
    }
}
