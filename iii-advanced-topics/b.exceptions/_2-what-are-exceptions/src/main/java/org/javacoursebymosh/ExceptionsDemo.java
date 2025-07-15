package org.javacoursebymosh;

/**
 * A class to demonstrate how exceptions are thrown and propagated in Java.
 * <p>
 * An exception is an event, which occurs during the execution of a program,
 * that disrupts the normal flow of the program's instructions.
 */
public class ExceptionsDemo {

    /**
     * Triggers a {@code NullPointerException} to demonstrate the exception handling flow.
     * <p>
     * When an exception is not caught (handled), the JVM searches up the call stack
     * for a handler. If none is found, the program terminates and prints the stack trace.
     *
     * @see #sayHello(String)
     */
    public static void show() {
        sayHello(null);
    }

    /**
     * Converts a name to uppercase and prints it to the console.
     * <p>
     * A stack trace shows the sequence of method calls that led to the exception,
     * in reverse order. For an exception here, the trace would be:
     * {@code sayHello() -> show() -> main()}
     *
     * @param name The string to convert to uppercase.
     * @throws NullPointerException if the input {@code name} is null, as methods cannot be
     * invoked on a null reference.
     */
    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}