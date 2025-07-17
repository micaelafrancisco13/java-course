package org.javacoursebymosh;

/**
 * Demonstrates using multiple type parameters in both generic methods and classes.
 */
public class Main {
    /**
     * The main entry point for the application.
     * <p>
     * This method showcases how a generic method like {@code Utils.print()} can accept
     * arguments of different types. It also introduces the concept of a generic class
     * with multiple type parameters, like the {@code KeyValuePair} class.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Utils.print(1, "One");
        Utils.print("Two", 2);
        Utils.log(new KeyValuePair<>("One", 1));
        Utils.log(new KeyValuePair<>(2, "Two"));
    }
}