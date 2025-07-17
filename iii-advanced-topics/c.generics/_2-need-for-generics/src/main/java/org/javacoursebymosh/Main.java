package org.javacoursebymosh;

/**
 * Demonstrates the limitations of a non-generic collection class.
 * <p>
 * This example uses a custom {@code List} class that is designed to work only
 * with {@code int} primitives. The problem with this approach is its lack of
 * flexibility. If we need a list to store a different type, such as a {@code User}
 * object, we would be forced to create a separate, nearly identical {@code UserList}
 * class. This leads to code duplication and is inefficient to maintain.
 * <p>
 * This problem highlights the need for <b>Generics</b>, which allow us to create
 * a single, reusable class that can work with any data type.
 */
public class Main {
    /**
     * The main entry point for the application.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Using the custom List class for integers.
        var list = new List();
        list.add(1);
    }
}