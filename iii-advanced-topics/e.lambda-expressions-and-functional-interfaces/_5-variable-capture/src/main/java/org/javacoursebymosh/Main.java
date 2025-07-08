package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        /*
         * This local variable 'prefix' is accessible inside the lambda expression below
         * because it is "effectively final."
         *
         * An "effectively final" variable is one whose value is never changed after
         * it is initialized. Because 'prefix' is never reassigned, the lambda can
         * safely capture and use its value.
         *
         * If you were to add a line like `prefix = "*";` later in this method,
         * this code would no longer compile.
         */
        String prefix = "-";

        // We are calling the greet method and passing a lambda expression
        // as the implementation for the 'Printer' functional interface.
        greet(message -> System.out.println(
                "Printing to console using lambda expression... " +
                        prefix + message)); // The 'prefix' variable from the outer scope is used here.

        /*
         * --- How to Modify a Variable Inside a Lambda ---
         *
         * Since lambdas require variables to be final or effectively final, you cannot directly
         * modify a simple local variable (e.g., `int count = 0; count++;`).
         *
         * The solution is to use a mutable wrapper object. The *reference* to the wrapper object
         * is effectively final, but the object's internal state can be changed from within the lambda.
         *
         * ✅ The best practice is to use an Atomic type, like `AtomicInteger`. It is designed for this
         * purpose and is thread-safe, which is crucial for parallel operations.
         *
         * AtomicInteger mutableCounter = new AtomicInteger(0);
         * someList.forEach(item -> {
         * mutableCounter.incrementAndGet(); // This is safe and allowed
         * });
         *
         */

        // --- Lambda Scope Rules ---
        // In the body of a lambda expression, you can access:
        // 1. Final or effectively final variables from the enclosing method.
        // 2. Static and instance fields of the enclosing class.

        // The keyword "this" inside a lambda refers to the instance of the enclosing
        // class (in this case, 'Main'). This differs from anonymous inner classes,
        // where "this" would refer to the instance of the inner class itself.
    }

    /**
     * A method that accepts any implementation of the Printer functional interface.
     * @param printer The implementation that will be used to print the message.
     */
    public static void greet(Printer printer) {
        printer.print("Hello world");
    }
}