package org.javacoursebymosh;

/**
 * A generic list with a type constraint, accepting only {@code Number} objects
 * or its subclasses.
 *
 * <h2>Bounded Type Parameters</h2>
 * The declaration {@code <T extends Number>} is a <b>bounded type parameter</b>. It
 * restricts the type {@code T} to be either the {@code Number} class itself or any
 * class that inherits from {@code Number}. This allows us to use methods of the
 * {@code Number} class on objects of type {@code T} from within this class.
 *
 * @param <T> The type of elements to be stored, which must be a subclass of {@code Number}.
 */
public class GenericList<T extends Number> {
    private final T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
