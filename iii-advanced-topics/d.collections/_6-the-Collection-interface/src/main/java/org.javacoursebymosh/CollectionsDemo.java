package org.javacoursebymosh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Demonstrates the common methods available in the {@code java.util.Collection} interface.
 *
 * <p>This demo uses {@code ArrayList} as the concrete implementation, but the methods shown
 * are available in any class that implements the {@code Collection} interface
 * (such as {@code HashSet}, {@code ArrayDeque}, etc.).
 *
 * <p>It's a best practice to program to the interface
 * (e.g., {@code Collection<String> collection}) rather than the implementation.
 */
public class CollectionsDemo {

    /**
     * Showcases the core functionality of the {@code Collection} interface.
     */
    public static void show() {
        // Both declarations create an ArrayList of Strings, but there's a subtle difference in type:
        //
        // 1. 'collection' is declared as a Collection<String>, which is a more generic interface type.
        //    This means you can assign any Collection implementation (like ArrayList, LinkedList, etc.),
        //    and you're encouraged to program to the interface rather than the implementation.
        //
        // 2. 'collection2' uses 'var' and is inferred as an ArrayList<String>.
        //    The compiler infers the specific implementation (ArrayList) as the variable type,
        //    which can be less flexible for polymorphism but more concise.
        //
        // Best practice: use the interface (like Collection or List) for flexibility unless you need
        // specific methods of the implementation class.
        Collection<String> collection = new ArrayList<>();
        var collection2 = new ArrayList<String>();

        collection.add("a");
        collection.add("b");
        collection.add("c");

        // The Collections utility class provides helpful static methods.
        Collections.addAll(collection, "d", "e");

        System.out.println("Initial collection: " + collection);
        System.out.println("Size: " + collection.size());

        // --- Removing Elements ---
        collection.remove("d");
        System.out.println("After removing 'd': " + collection);

        // collection.clear(); // This would remove all elements.

        // --- Querying Elements ---
        System.out.println("Contains 'a'? " + collection.contains("a"));

        // --- Converting to an Array ---
        // The toArray(T[] a) method converts the collection to an array of the specified type.
        // Providing `new String[0]` is a common idiom to specify the array's type;
        // the JVM will automatically create a new array of the correct size.
        String[] array = collection.toArray(new String[0]);
        System.out.println("First element of array: " + array[0]);

        // --- Comparing Collections ---
        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        // The equals() method compares the content and order (if applicable) of the collections.
        // The == operator compares memory addresses (references).
        System.out.println("collection.equals(other)? " + collection.equals(other)); // true
    }
}
