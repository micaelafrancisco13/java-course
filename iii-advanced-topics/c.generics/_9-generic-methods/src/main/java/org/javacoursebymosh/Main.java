package org.javacoursebymosh;

/**
 * Demonstrates the use of a static generic method from a utility class.
 */
public class Main {

    /**
     * The main entry point for the application.
     *
     * <p>This method shows how a single generic method, {@code Utils.max()}, can work
     * on different data types (like {@code Integer} and our custom {@code User} class),
     * as long as those types fulfill the method's generic constraint (implementing
     * the {@code Comparable} interface).
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // A generic method can be declared even inside a non-generic class.
        var result1 = Utils.max(1, 2);
        System.out.println(result1);

        var result2 = Utils.max(new User(10), new User(20));
        System.out.println(result2);
    }
}
