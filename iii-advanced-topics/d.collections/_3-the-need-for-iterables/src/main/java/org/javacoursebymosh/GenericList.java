package org.javacoursebymosh;

/**
 * A simple generic list class.
 * <p>
 * In its current form, this class does not support iteration with a for-each loop
 * because it does not implement the {@code java.lang.Iterable} interface.
 *
 * @param <T> The type of elements to be stored in this list.
 */
public class GenericList<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}