package org.javacoursebymosh;

// T - type or template
// E - element; acts as a collection
// just like our methods can have parameters, our
// classes can have them as well
public class GenericList<T> {
    // new T[10] results to compilation error because the JVM
    // does not know the type of "T" at compile-time.
    // note that the line below produces ClassCastException.
    // why? see line 23 and onwards
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    // does not work
    // Number number = new Object();

    // works
    // Object number = (Number) 10;
}
