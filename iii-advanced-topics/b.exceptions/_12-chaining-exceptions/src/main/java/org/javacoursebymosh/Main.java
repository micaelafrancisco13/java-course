package org.javacoursebymosh;

/**
 * The main entry point for demonstrating exception chaining.
 * <p>
 * <b>Exception Chaining</b> is a technique where a new exception is thrown that
 * wraps an original, underlying exception. This is useful for abstracting away
 * low-level, specific exceptions and presenting a more general, stable API to
 * the caller, without losing the details of the original problem.
 */
public class Main {
    public static void main(String[] args) {
        ExceptionsDemo.show();
    }
}