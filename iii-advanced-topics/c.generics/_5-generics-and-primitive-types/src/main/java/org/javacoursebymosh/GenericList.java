package org.javacoursebymosh;

/**
 * A generic list class that can store elements of any reference type.
 *
 * @param <T> The type of elements to be stored in this list.
 */
public class GenericList<T> {
    /**
     * The underlying array to store the list items.
     */
    private final T[] items = (T[]) new Object[10];

    /**
     * The current number of items in the list.
     */
    private int count;

    /**
     * Adds an item to the end of the list.
     *
     * @param item The item of type T to be added.
     */
    public void add(T item) {
        items[count++] = item;
    }

    /**
     * Retrieves the item at the specified index.
     *
     * @param index The index of the item to retrieve.
     * @return The item of type T at the given index.
     */
    public T get(int index) {
        return items[index];
    }
}