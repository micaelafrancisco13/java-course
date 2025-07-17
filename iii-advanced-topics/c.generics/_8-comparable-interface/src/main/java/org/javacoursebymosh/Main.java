package org.javacoursebymosh;

/**
 * Demonstrates the use of the Comparable interface to define a natural order
 * for custom objects.
 */
public class Main {

    /**
     * The main entry point for the application.
     *
     * <h2>The {@code Comparable} Interface</h2>
     * The {@code Comparable<T>} interface is used to impose a <b>natural ordering</b>
     * on the objects of a class. It contains a single method,
     * {@code compareTo(T other)}, which compares the current object with another
     * object of the same type.
     *
     * <p>The {@code compareTo} method returns:
     * <ul>
     *   <li>A <b>negative integer</b> if the current object is less than the other object.</li>
     *   <li><b>Zero</b> if the current object is equal to the other object.</li>
     *   <li>A <b>positive integer</b> if the current object is greater than the other object.</li>
     * </ul>
     */
    public static void main(String[] args) {
        var user1 = new User(10);
        var user2 = new User(20);

        // This will print a negative number because user1 (10) < user2 (20).
        System.out.println(user1.compareTo(user2));
    }
}
