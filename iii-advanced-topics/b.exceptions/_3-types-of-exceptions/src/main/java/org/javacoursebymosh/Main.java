package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        ExceptionsDemo.show();

        // Types of exceptions:
        // 1. Checked exceptions
        // - get checked at compile-time
        // - be anticipated then recover from
        // - be handled properly
        // - instead of letting the runtime terminate our program,
        //   a user-friendly message is displayed
        // - "FileNotFoundException" is an example
        // - scenario: deleting a file

        // 2. Unchecked exceptions (run-time exceptions)
        // - get checked at run-time
        // - occur because of programming errors
        // - be prevented from happening in the first place
        // - be prevented by automated testing
        // - "NullPointerException" is an example
        // - "ArithmeticException" is an example
        // - "IllegalArgumentException" is an example
        // - "IndexOutOfBoundsException" is an example
        // - "IllegalStateException" is an example

        // 3. Error
        // - external to our application or programming error
        // - stack overflow, out-of-memory, and infinite recursion
        //   are examples
        // - let the app crash then display a user-friendly
        //   message
    }
}