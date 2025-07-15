package org.javacoursebymosh;

/**
 * Provides a detailed overview of Java's exception hierarchy. 🧐
 *
 * <h2>Top Level: {@code Throwable}</h2>
 * The {@code Throwable} class is the superclass for all errors and exceptions in Java.
 * It sits at the top of the hierarchy and defines the common characteristics shared
 * by all throwables, such as an error message and the stack trace.
 *
 * <hr>
 *
 * <h2>Mid-Level: {@code Exception} and {@code Error}</h2>
 * Directly beneath {@code Throwable} are two key subclasses:
 *
 * <ul>
 *   <li><b>{@code Error}:</b> Represents serious problems that are generally external
 *   to the application and from which a program cannot typically recover.
 *   Examples include {@code StackOverflowError} and {@code OutOfMemoryError}.
 *   You shouldn't try to catch these.</li>
 *
 *   <li><b>{@code Exception}:</b> Represents conditions that a program might want to catch.
 *   It is the parent class for all checked and unchecked exceptions.</li>
 * </ul>
 *
 * <hr>
 *
 * <h2>Low-Level: {@code RuntimeException}</h2>
 * This class is a special subclass of {@code Exception} that defines <b>unchecked exceptions</b>.
 *
 * <ul>
 *   <li>Any exception class that inherits from {@code RuntimeException} is considered
 *   an <b>unchecked exception</b> (e.g., {@code NullPointerException}).
 *   The compiler does not force you to handle them.</li>
 *
 *   <li>Any exception class that inherits from {@code Exception} but <em>not</em> from
 *   {@code RuntimeException} is a <b>checked exception</b> (e.g., {@code IOException}).
 *   The compiler requires you to handle these.</li>
 * </ul>
 *
 * <hr>
 *
 * <h3>Example Inheritance Chain</h3>
 * <pre>{@code
 * java.lang.Object
 *  └── java.lang.Throwable
 *      ├── java.lang.Exception
 *      │    └── java.lang.RuntimeException
 *      │         └── java.lang.NullPointerException
 *      └── java.lang.Error
 * }</pre>
 */
public class Main {
    /**
     * The main entry point. This class serves primarily for documentation purposes.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // This method is empty as the class is for demonstrating Javadoc.
    }
}
