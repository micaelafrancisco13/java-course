package org.javacoursebymosh;

import java.util.Iterator;

/**
 * A generic list class that implements the {@code Iterable} interface to support
 * iteration via a for-each loop.
 *
 * <p>By implementing {@code Iterable<T>}, this class agrees to provide an {@code Iterator}
 * object, which encapsulates the logic for traversing the list's elements without
 * exposing the underlying array structure.
 *
 * @param <T> The type of elements to be stored in this list.
 */
public class GenericList<T> implements Iterable<T> {
    private final T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    /**
     * Returns an iterator over the elements in this list.
     *
     * <p>This method fulfills the contract of the {@code Iterable} interface. It is
     * responsible for creating and returning a new {@code Iterator} instance that
     * knows how to traverse the elements of this specific list.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<T> iterator() {
        // NOTE: Returning null is a placeholder. A concrete implementation
        // of the Iterator interface is required here.
        return null;
    }
}
