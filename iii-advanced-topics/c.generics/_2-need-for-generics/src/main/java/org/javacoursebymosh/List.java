package org.javacoursebymosh;

/**
 * A simple, non-generic list for storing a fixed number of integers.
 * <p>
 * This implementation is tightly coupled to the {@code int} primitive type.
 */
public class List {
    /**
     * The underlying array to store the list items.
     */
    private final int[] items = new int[10];

    /**
     * The current number of items in the list.
     */
    private int count;

    /**
     * Adds an integer to the end of the list.
     *
     * @param item The integer to be added.
     */
    public void add(int item) {
        items[count++] = item;
    }

    /**
     * Retrieves the integer at the specified index.
     *
     * @param index The index of the item to retrieve.
     * @return The integer at the given index.
     */
    public int get(int index) {
        return items[index];
    }
}