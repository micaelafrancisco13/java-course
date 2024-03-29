package org.javacoursebymosh;

import java.util.Iterator;

// we want to implement the Iterable interface in this class,
// and then have other classes that use this class program against
// the Iterable interface. this interface has 3 methods, forEach(),
// iterator(), and spliterator(). the forEach() and spliterator()
// have default implementations.
public class GenericList<T> implements Iterable<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    // go back to Main class
    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
