package org.javacoursebymosh;

/**
 * A simple list that uses the {@code Object} class to store items of any type.
 * <p>
 * This pre-generics approach allows for flexibility but lacks compile-time
 * type safety, requiring explicit casting and risking runtime errors.
 */
public class List {
    /**
     * The underlying array to store any type of object.
     */
    private final Object[] items = new Object[10];

    /**
     * The current number of items in the list.
     */
    private int count;

    /**
     * Adds an object to the end of the list.
     *
     * @param item The object to be added.
     */
    public void add(Object item) {
        items[count++] = item;
    }

    /**
     * Retrieves the object at the specified index.
     *
     * @param index The index of the item to retrieve.
     * @return The object at the given index.
     */
    public Object get(int index) {
        return items[index];
    }
}