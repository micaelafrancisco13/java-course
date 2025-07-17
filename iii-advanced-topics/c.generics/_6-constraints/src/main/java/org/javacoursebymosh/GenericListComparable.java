package org.javacoursebymosh;

/**
 * A generic list that has multiple bounds, requiring types that are both
 * comparable and cloneable.
 *
 * <h2>Multiple Bounds</h2>
 * You can set multiple constraints on a type parameter using the {@code &} operator,
 * like {@code <T extends Bound1 & Bound2>}.
 *
 * <p><b>Rule:</b> If one of the bounds is a class, it must be listed first.
 * The remaining bounds must be interfaces.</p>
 *
 * <p>In this example:</p>
 * <ul>
 *   <li>{@code Comparable}: Ensures that objects of type {@code T} can be compared to
 *       each other, which is necessary for sorting.</li>
 *   <li>{@code Cloneable}: A marker interface indicating that objects of type {@code T}
 *       can be cloned or copied.</li>
 * </ul>
 *
 * @param <T> The type of elements, which must implement {@code Comparable} and {@code Cloneable}.
 */
public class GenericListComparable<T extends Comparable<T> & Cloneable> {
    private final T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
