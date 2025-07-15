package org.javacoursebymosh;

public class Main {
    /**
     * Explains the hierarchy of throwables in Java, categorized into three main types.
     *
     * <h2>1. Checked Exceptions</h2>
     * These are exceptional conditions that a well-written application should anticipate and
     * recover from.
     * <ul>
     * <li><b>Checked at compile-time:</b> The compiler ensures that you handle them using a
     * {@code try-catch} block or by declaring them with the {@code throws} keyword.</li>
     * <li><b>Purpose:</b> They represent predictable but unpreventable problems, like a missing
     * file or a network connectivity issue. The goal is to handle them gracefully and
     * show a user-friendly message instead of letting the program crash.</li>
     * <li><b>Example:</b> {@code FileNotFoundException} when trying to read a file that
     * does not exist.</li>
     * </ul>
     *
     * <h2>2. Unchecked (Runtime) Exceptions</h2>
     * These exceptions result from programming errors, such as logic flaws or improper API usage.
     * <ul>
     * <li><b>Checked at run-time:</b> They are not checked by the compiler.</li>
     * <li><b>Purpose:</b> They indicate bugs in the code that should be fixed. You should
     * prevent them from happening in the first place, often through better coding and
     * automated testing, rather than catching them.</li>
     * <li><b>Examples:</b> {@code NullPointerException}, {@code ArithmeticException},
     * {@code IllegalArgumentException}, {@code IndexOutOfBoundsException}.</li>
     * </ul>
     *
     * <h2>3. Errors</h2>
     * These are serious problems that are external to the application and from which an
     * application usually cannot recover.
     * <ul>
     * <li><b>Cause:</b> Often caused by issues in the Java Virtual Machine (JVM) itself,
     * not by the application code.</li>
     * <li><b>Recovery:</b> It's generally not recommended to try and catch Errors. The best
     * course of action is often to let the application crash and log the issue.</li>
     * <li><b>Examples:</b> {@code StackOverflowError} (e.g., from infinite recursion) or
     * {@code OutOfMemoryError}.</li>
     * </ul>
     */
    public static void main(String[] args) {
        ExceptionsDemo.show();
    }
}