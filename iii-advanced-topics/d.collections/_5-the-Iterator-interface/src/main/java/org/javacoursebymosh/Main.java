package org.javacoursebymosh;

/**
 * Demonstrates a custom collection that is fully iterable, making it compatible
 * with Java's for-each loop.
 */
public class Main {

    /**
     * The main entry point for the application.
     *
     * <p>Because the {@code GenericList} class now correctly implements the
     * {@code Iterable} interface and provides a concrete {@code Iterator},
     * its instances can be seamlessly used in an enhanced for-loop.
     *
     * <p>The compiler automatically translates this loop into the underlying
     * {@code hasNext()} and {@code next()} calls.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        for (var item : list) {
            System.out.println(item);
        }
    }
}
