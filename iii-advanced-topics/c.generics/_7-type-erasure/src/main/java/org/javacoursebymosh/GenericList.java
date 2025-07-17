package org.javacoursebymosh;

/**
 * A generic list class used to demonstrate the concept of Type Erasure.
 *
 * <h2>Type Erasure in Java Generics</h2>
 * For backward compatibility with older, non-generic Java code, the compiler
 * performs a process called <b>type erasure</b>. This means it erases the generic
 * type parameters (like {@code <T>}) and replaces them with a concrete type.
 *
 * <p>The replacement rules are as follows:
 * <ul>
 *   <li><b>Unbounded Type ({@code <T>}):</b> The type parameter {@code T} is replaced
 *   with {@code Object}.</li>
 *
 *   <li><b>Bounded Type ({@code <T extends Number>}):</b> The type parameter {@code T} is
 *   replaced with its bound, which is {@code Number} in this case.</li>
 *
 *   <li><b>Multiple Bounds ({@code <T extends Number & Cloneable>}):</b> The type {@code T} is
 *   replaced with the <em>first</em> bound in the list ({@code Number}).</li>
 * </ul>
 *
 * <p>Even though this information is "erased" for the runtime, the compiler uses it
 * during compilation to enforce the strict type safety that makes generics powerful.
 *
 * @param <T> The type of elements, which must be a subclass of {@code Number}.
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
