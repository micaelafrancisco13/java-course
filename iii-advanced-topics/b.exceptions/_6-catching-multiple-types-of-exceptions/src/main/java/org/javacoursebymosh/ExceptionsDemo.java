package org.javacoursebymosh;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * A class for demonstrating advanced exception handling techniques.
 */
public class ExceptionsDemo {

    /**
     * Demonstrates handling multiple types of exceptions from a single try block.
     * <p>
     * This method illustrates two key concepts: using a multi-catch block to handle
     * different exceptions with the same logic, and understanding the role of
     * polymorphism in exception handling.
     * </p>
     *
     * <h2>Handling Multiple Exceptions</h2>
     * A single {@code try} block can throw various exceptions. You can handle them
     * separately or group them.
     *
     * <ul>
     *   <li><b>Separate {@code catch} Blocks:</b> Each block targets a specific
     *   exception. Only one {@code catch} block is executed—the first one that
     *   matches the type of exception thrown.</li>
     *
     *   <li><b>Multi-Catch Block:</b> Starting with Java 7, you can combine multiple
     *   exception types in a single {@code catch} block using the {@code |} operator.
     *   This is useful for reducing code duplication when the handling logic is the same.</li>
     * </ul>
     *
     * <hr>
     *
     * <h2>Catch Order and Polymorphism</h2>
     * The order of {@code catch} blocks matters. Since exceptions are classes, they
     * follow inheritance rules.
     * <p>
     * For example, {@code FileNotFoundException} is a subclass of {@code IOException}:
     * </p>
     *
     * <pre>{@code
     * java.io.IOException
     * └── java.io.FileNotFoundException
     * }</pre>
     *
     * <p>
     * A {@code catch} block for a <b>superclass</b> (like {@code IOException}) can also catch
     * any of its <b>subclasses</b>. Therefore, when using separate {@code catch} blocks,
     * you must place the subclass catch block <em>before</em> the superclass catch block
     * to avoid a compile-time error.
     * </p>
     */
    public static void show() {
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
        } catch (IOException | ParseException e) {
            System.out.println("An error occurred: Could not read data or parse the format.");
            // The exception object 'e' is implicitly final in a multi-catch block.
        }
    }
}
