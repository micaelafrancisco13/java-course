package org.javacoursebymosh;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * A class for demonstrating modern exception handling features in Java.
 */
public class ExceptionsDemo {

    /**
     * Demonstrates the modern {@code try-with-resources} statement for automatic resource management. ✨
     *
     * <h2>The {@code try-with-resources} Statement</h2>
     * Introduced in Java 7, this feature provides a cleaner and safer way to handle external
     * resources that need to be closed, such as files, streams, or database connections.
     *
     * <p>
     * You can declare and initialize one or more resources within the parentheses {@code ()}
     * following the {@code try} keyword. Multiple resources are separated by a semicolon.
     * </p>
     *
     * <hr>
     *
     * <h2>Automatic Resource Management 🤖</h2>
     * The key advantage is that the JVM automatically calls the {@code close()} method on
     * each resource when the {@code try} block is exited—whether it completes normally or
     * an exception is thrown.
     *
     * <p>
     * This makes explicit {@code finally} blocks for resource cleanup unnecessary,
     * resulting in more concise and less error-prone code.
     * </p>
     *
     * <hr>
     *
     * <h2>The {@code AutoCloseable} Interface</h2>
     * For a class to be used in a {@code try-with-resources} statement, it must implement the
     * {@code java.lang.AutoCloseable} interface.
     *
     * <p>
     * This interface defines a single method, {@code close()}, which the JVM automatically
     * invokes for cleanup. Most standard Java I/O and JDBC classes implement this interface.
     * </p>
     */
    public static void show() {
        try (
                var reader = new FileReader("file.txt");
                var writer = new FileWriter("file2.txt")
        ) {
            var value = reader.read();
        } catch (IOException ex) {
            System.out.println("Could not read or write data.");
        }
    }
}
