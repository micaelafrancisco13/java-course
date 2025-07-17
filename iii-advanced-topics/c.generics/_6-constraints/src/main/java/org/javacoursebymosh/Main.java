package org.javacoursebymosh;

/**
 * Demonstrates the use of bounded generics to create specialized collections.
 */
public class Main {

    /**
     * The main entry point for showcasing constrained generic types.
     *
     * <h2>Constraining Generic Types</h2>
     * Java's generics can be restricted using a <b>bounded type parameter</b> with the
     * {@code extends} keyword. This ensures that only certain types can be used,
     * making the generic class more specialized and safe.
     *
     * <ul>
     *   <li><b>Constraining by Class:</b> For a declaration like {@code <T extends Number>}, the
     *       type {@code T} can only be {@code Number} or one of its subclasses.</li>
     *   <li><b>Constraining by Interface:</b> For a declaration like {@code <T extends Comparable>},
     *       the type {@code T} must be a class that implements the {@code Comparable} interface.
     *       This is useful when the generic class needs to perform operations like sorting.</li>
     * </ul>
     */
    public static void main(String[] args) {
        // This is valid because Short is a subclass of Number.
        var list = new GenericList<Short>();

        // For GenericListComparable, a type would need to implement
        // both Comparable and Cloneable.
    }
}
