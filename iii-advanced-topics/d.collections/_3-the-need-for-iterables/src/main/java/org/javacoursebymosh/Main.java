package org.javacoursebymosh;

/**
 * Demonstrates the limitations of custom collections with respect to iteration
 * and highlights why exposing internal structures is a poor design choice.
 */
public class Main {

    /**
     * Entry point of the application.
     *
     * <p><strong>The Iteration Problem</strong><br>
     * Custom collection classes (like {@code GenericList}) do not support for-each loops by default.
     * For example, the following code will not compile:
     *
     * <pre>{@code
     * for (var item : genericList) {  // Compile-time error!
     *     // ...
     * }
     * }</pre>
     *
     * <p>This raises the question: How can we iterate over a custom list without exposing
     * or depending on its internal structure?
     *
     * <hr>
     *
     * <p><strong>Why Exposing Internals Is a Bad Idea</strong><br>
     * A naive workaround is to make the internal array of {@code GenericList} public.
     * However, this violates the principle of <strong>encapsulation</strong>, leading to several issues:
     *
     * <ul>
     *   <li><strong>Breaks abstraction:</strong> External code becomes dependent on internal
     *       implementation details.</li>
     *   <li><strong>Reduces flexibility:</strong> Changes to the internal structure (e.g., switching
     *       from an array to an {@code ArrayList}) can break dependent code.</li>
     *   <li><strong>Increases maintenance cost:</strong> Any internal refactor would ripple
     *       through all code that relies on direct access.</li>
     * </ul>
     *
     * <p><strong>✅ Best Practice:</strong> Implement the {@code Iterable} interface to allow
     * for-each iteration while preserving encapsulation and flexibility.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        var genericList = new GenericList<String>();
        genericList.add("a");
        genericList.add("b");
        genericList.add("c");

        // Iteration will only be supported after implementing Iterable in GenericList.
        // for (var item : genericList) {
        //     System.out.println(item);
        // }
    }
}
