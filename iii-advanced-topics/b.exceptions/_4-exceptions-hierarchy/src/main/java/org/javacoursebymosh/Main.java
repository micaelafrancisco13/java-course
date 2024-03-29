package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // Throwable class
        // - top hierarchy
        // - defines common characteristics for all exceptions and
        //   errors such as error message and the stack trace

        // Exception class and Error class
        // - middle hierarchy
        // - "Error" class, and all of its subtypes represent errors
        //   that are external to our app such as stack overflow or
        //   out-of-memory error.
        // - "Exception" class is the parent for all checked and
        //   unchecked exceptions

        // RuntimeException class
        // - bottom hierarchy
        // - represents run-time or unchecked exceptions
        // - if an exception class derives from the RuntimeException,
        //   it's considered as an unchecked exception, otherwise, it
        //   is a checked exception

        // java.lang.Object
        //     java.lang.Throwable
        //         java.lang.Exception
        //             java.lang.RuntimeException
        //                 java.lang.NullPointerException
    }
}