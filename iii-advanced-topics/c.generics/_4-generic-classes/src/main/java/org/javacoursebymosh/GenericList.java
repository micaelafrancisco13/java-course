package org.javacoursebymosh;

/**
 * A generic list class that can store elements of any type.
 *
 * <h2>Type Parameter</h2>
 * The {@code <T>} in the class declaration is a <b>type parameter</b>. It acts as a
 * placeholder for a specific data type that will be provided when an instance of
 * {@code GenericList} is created.
 *
 * <p>Common conventions for type parameters:</p>
 * <ul>
 *   <li>{@code T} for Type</li>
 *   <li>{@code E} for Element (often used in collections)</li>
 *   <li>{@code K} for Key</li>
 *   <li>{@code V} for Value</li>
 * </ul>
 *
 * <h2>Generic Array Creation</h2>
 * Creating a generic array directly like {@code new T[10]} is illegal in Java.
 * This is due to <b>type erasure</b>, where the type {@code T} is not known at runtime.
 *
 * <p>
 * The common workaround is to create an {@code Object} array and cast it to a generic
 * array: {@code (T[]) new Object[10]}. This generates an "unchecked cast" warning but
 * is a widely accepted practice for creating generic collections backed by arrays.
 * </p>
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
