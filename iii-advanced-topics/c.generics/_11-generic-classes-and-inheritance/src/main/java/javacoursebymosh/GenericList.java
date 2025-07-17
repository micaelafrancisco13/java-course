package javacoursebymosh;

import java.lang.reflect.Array;

/**
 * A generic list constrained to hold objects of type {@code User} or its subclasses.
 *
 * @param <T> The type of elements, which must be a subclass of {@code User}.
 */
public class GenericList<T extends User> {
    private final T[] items;
    private int count;

    /**
     * Constructs a new {@code GenericList}.
     *
     * <p>This constructor uses <b>reflection</b> via
     * {@code java.lang.reflect.Array.newInstance()} to create a generic array.
     * This is a more robust and type-safe approach than casting from {@code new Object[]},
     * as it correctly sets the runtime type of the array.
     *
     * @param clazz The {@code Class} object of the type {@code T}, used to create the array.
     * @param size  The initial capacity of the list.
     */
    @SuppressWarnings("unchecked")
    public GenericList(Class<T> clazz, int size) {
        items = (T[]) Array.newInstance(clazz, size);
    }

    /**
     * Adds an item to the end of the list.
     *
     * @param item The item of type {@code T} to be added.
     */
    public void add(T item) {
        items[count++] = item;
    }

    /**
     * Retrieves the item at the specified index.
     *
     * @param index The index of the item to retrieve.
     * @return The item of type {@code T} at the given index.
     */
    public T get(int index) {
        return items[index];
    }
}
