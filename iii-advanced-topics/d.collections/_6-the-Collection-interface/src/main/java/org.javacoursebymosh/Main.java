package org.javacoursebymosh;

/**
 * Introduces the {@code Collection} interface, the foundation of the Java Collections Framework.
 *
 * <p>The framework is built upon a hierarchy of interfaces:
 *
 * <pre>{@code
 * Iterable
 *    |
 * Collection
 *  /    |    \
 * List  Queue  Set
 * }</pre>
 *
 * <p>The {@code Collection} interface acts as a blueprint for any class that represents a
 * group of objects. It defines the core operations that a collection should support,
 * such as adding, removing, and querying elements.
 */
public class Main {
    public static void main(String[] args) {
        CollectionsDemo.show();
    }
}
