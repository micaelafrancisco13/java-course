package org.javacoursebymosh;

public class ExceptionsDemo {
    // an exception is an object that contains information
    // about an error
    public static void show() {
        // this will result to "java.lang.NullPointerException"
        sayHello(null);
    }

    // a stack trace shows methods that have been called in the
    // reverse order.

    // when an exception occurs in a method, we say that method
    // "threw" an exception. when this happens, JVM looks for a
    // block of code in that method for handling that exception.
    // we refer to that as an "exception handler."
    // JVM looks for an exception handler, if it does not find it,
    // it goes to the previous method stated in the call stack until
    // JVM terminates our program and displays the exception because
    // it didn't find any handlers.
    // sayHello() -> show() -> main()
    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
