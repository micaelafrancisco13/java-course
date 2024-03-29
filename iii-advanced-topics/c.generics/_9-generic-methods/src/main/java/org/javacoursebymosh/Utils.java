package org.javacoursebymosh;

public class Utils {
    // get the maximum of 2 values
    public static <T extends Comparable<T>> T max(T first, T second) {
        // comparison operators can only be applied to
        // numbers and characters.

        // how can we compare the rest? using the
        // compareTo() from Comparable interface.

        // we can tell the JVM that the T inside <>
        // extends the Comparable interface.
        return first.compareTo(second) < 0 ? second : first;
    }
}
