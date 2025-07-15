package org.javacoursebymosh;

import java.io.IOException;

/**
 * Demonstrates an advanced exception handling pattern: catching and re-throwing.
 */
public class ExceptionsDemo {

    /**
     * Demonstrates the "catch and re-throw" exception handling strategy.
     *
     * <p>
     * This pattern is useful for creating layered applications. A lower-level layer can
     * catch an exception to perform a specific action (like logging) and then re-throw
     * it so a higher-level layer can handle it differently—such as displaying a
     * user-friendly error message.
     * </p>
     *
     * <h2>How It Works</h2>
     * <ol>
     *   <li>The {@code try} block calls a method that might fail.</li>
     *
     *   <li>The {@code catch} block intercepts the {@code IOException}. Inside this block,
     *   we perform a task suitable for this layer, such as <b>logging the full error</b>
     *   to a file or database for developers to analyze. 📝</li>
     *
     *   <li>After logging, we use {@code throw e;} to <b>re-throw the original exception</b>.
     *   This passes the exception up the call stack.</li>
     * </ol>
     *
     * <p>
     * Because this method re-throws a checked exception, it must also be declared with
     * {@code throws IOException} in its signature.
     * </p>
     *
     * @throws IOException if the deposit operation fails.
     */
    public static void show() throws IOException {
        var account = new Account();

        try {
            account.deposit(-1);
        } catch (IOException e) {
            System.out.println("LOGGING: An error occurred. Details are being recorded...");
            // After logging the technical details, re-throw the exception
            // to let the caller handle the user-facing part.
            throw e;
        }
    }
}
