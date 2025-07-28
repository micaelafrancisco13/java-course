package org.javacoursebymosh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrates the core functionality of the {@code java.util.List} interface.
 *
 * <p>The {@code List} interface extends the {@code Collection} interface and represents an
 * <strong>ordered collection</strong> of elements, also known as a sequence. Unlike a general
 * {@code Collection}, a {@code List} provides precise control over the position of each
 * element.
 *
 * <p><strong>Key characteristics of a {@code List}:</strong>
 * <ul>
 *   <li><strong>Indexed Access:</strong> Elements can be accessed, inserted, and removed using
 *       their zero-based integer index.</li>
 *   <li><strong>Ordered:</strong> It maintains the insertion order of elements.</li>
 *   <li><strong>Allows Duplicates:</strong> Lists can contain duplicate elements.</li>
 * </ul>
 */
public class Main {

    /**
     * The main entry point showcasing the methods specific to the {@code List} interface.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e");

        // --- Inserting and Replacing Elements ---
        list.add(1, "x"); // Inserts "x" at index 1, shifting subsequent elements.
        list.set(1, "y"); // Replaces the element at index 1 with "y".
        System.out.println("After insertion and replacement: " + list);

        // --- Accessing Elements ---
        System.out.println("Element at index 1: " + list.get(1));

        // Returns the index of the first occurrence of "c". Returns -1 if not found.
        System.out.println("Index of 'c': " + list.indexOf("c"));

        // Returns the index of the last occurrence of "a".
        System.out.println("Last index of 'a': " + list.lastIndexOf("a"));

        // --- Removing Elements ---
        list.remove(1); // Removes the element at index 1.
        System.out.println("After removing element at index 1: " + list);

        // --- Creating a Sub-List ---
        // Returns a view of the portion of this list between the specified indices.
        // The "from" index is inclusive, and the "to" index is exclusive.
        List<String> sublist = list.subList(0, 2); // Contains elements at index 0 and 1.
        System.out.println("Sublist from index 0 to 2: " + sublist);
    }
}
