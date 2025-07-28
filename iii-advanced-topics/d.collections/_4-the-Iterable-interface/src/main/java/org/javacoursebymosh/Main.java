package org.javacoursebymosh;

/**
 * Demonstrates the Iterator design pattern using Java's {@code Iterable} and
 * {@code Iterator} interfaces.
 */
public class Main {

    /**
     * The main entry point for the application.
     *
     * <p><strong>The Solution: {@code Iterable} and {@code Iterator}</strong><br>
     * To allow a custom collection to be iterated over without exposing its internal
     * structure, we use the Iterator design pattern, implemented in Java via two interfaces:
     *
     * <ol>
     *   <li><strong>{@code Iterable<T>}:</strong> An interface that a collection class must implement.
     *       It signals that the class can be iterated over. Its single abstract method,
     *       {@code iterator()}, acts as a factory that provides an {@code Iterator} object.</li>
     *
     *   <li><strong>{@code Iterator<T>}:</strong> An object that acts like a cursor, keeping track
     *       of the current position while traversing a collection. It has two core methods:
     *       <ul>
     *         <li>{@code hasNext()}: Returns {@code true} if there are more elements.</li>
     *         <li>{@code next()}: Returns the current element and advances the cursor.</li>
     *       </ul>
     *   </li>
     * </ol>
     *
     * <p><strong>For-Each Loop: Syntactic Sugar</strong><br>
     * The for-each loop is convenient <em>syntactic sugar</em>. When the compiler sees a
     * for-each loop, it automatically translates it into a {@code while} loop that uses
     * the collection's {@code iterator()}. This is why implementing {@code Iterable}
     * makes a class compatible with the for-each loop.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");

        // We can now get an iterator from our list.
        var iterator = list.iterator();

        // And use it to loop over the items.
        while (iterator.hasNext()) {
            var current = iterator.next();
            System.out.println(current);
        }
    }
}
