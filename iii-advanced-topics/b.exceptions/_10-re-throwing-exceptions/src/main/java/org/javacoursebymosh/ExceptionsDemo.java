package org.javacoursebymosh;

import java.io.IOException;

public class ExceptionsDemo {
    public static void show() throws IOException {
        var account = new Account();

        try {
            account.deposit(-1);
        } catch (IOException e) {
            // in real-world apps, when we throw an exception,
            // we want to log it somewhere (e.g., log to a file,
            // store in a database).
            // assume that we have a logger to log the errors to
            System.out.println("Logging the error...");

            // to display a user-friendly error message, we should
            // re-throw the exception ("throws IOException").
            // in the Main class, we should catch this exception
            throw e;
        }
    }
}
