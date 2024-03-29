package org.javacoursebymosh;

import java.util.Iterator;

// the Iterator interface has 2 non-default methods that we need
// to implement, hasNext() and next()
public class GenericList<T> implements Iterable<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    // instead of returning null, we're going to return an instance
    // of the ListIterator
    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    // we need a class that implements the Iterator interface.
    // this class is a nested class inside this GenericList class.
    private class ListIterator implements Iterator<T> {
        private final GenericList<T> list;

        // as long as the index variable is less than the array's
        // length, we increment it
        private int index;

        // in this class, we want to iterate over a generic list.
        private ListIterator(GenericList<T> list) {
            this.list = list;
            // we have access to GenericList's members
        }

        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        // initially, the index is set to 0.
        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
