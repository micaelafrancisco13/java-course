package org.javacoursebymosh;

import java.io.FileReader;
import java.io.IOException;

/**
 * A class demonstrating resource management in exception handling.
 */
public class ExceptionsDemo {

    /**
     * Demonstrates the use of the {@code finally} block for resource cleanup.
     *
     * <h2>The Resource Leak Problem</h2>
     * When working with external resources like files, network sockets, or database
     * connections, it is crucial to release them after use.
     * <p>
     * Failing to do so can cause a <b>resource leak</b>, where the operating system's
     * resources are consumed and not returned, potentially crashing the application
     * or the system.
     * </p>
     *
     * <p>
     * Simply calling {@code reader.close()} at the end of the {@code try} block is
     * not safe, because an exception could be thrown before the {@code close()}
     * method is ever reached.
     * </p>
     *
     * <hr>
     *
     * <h2>The {@code finally} Block</h2>
     * The {@code finally} block provides a solution. It is a block of code that
     * <b>always executes</b> after the {@code try} block, regardless of whether an
     * exception was thrown or not. This makes it the ideal place for cleanup logic.
     *
     * <p>Inside the {@code finally} block, we must:</p>
     * <ol>
     *   <li>Check if the resource object is {@code null}. This prevents a
     *   {@code NullPointerException} if the resource was never successfully initialized.</li>
     *   <li>Wrap the {@code close()} call in its own {@code try-catch} block, because
     *   the {@code close()} method itself can throw an {@code IOException}.</li>
     * </ol>
     *
     * <p>
     * ⭐ <b>Modern Approach:</b> While this pattern is important to understand,
     * Java 7 introduced the <b>try-with-resources</b> statement, which automates
     * resource management and is the preferred method today.
     * </p>
     */
    public static void show() {
        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
            var value = reader.read();
        } catch (IOException ex) {
            System.out.println("Could not read data from the file.");
        } finally {
            // This block ensures that the resource is closed.
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    // Log the error that occurred during closing.
                    System.out.println("Error closing the file: " + e.getMessage());
                }
            }
        }
    }
}
