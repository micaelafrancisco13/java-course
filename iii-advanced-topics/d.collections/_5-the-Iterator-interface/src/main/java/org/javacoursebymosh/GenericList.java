package org.javacoursebymosh;

import java.util.Iterator;

/**
 * A generic list class that implements the {@code Iterable} interface and provides
 * its own custom iterator via a private inner class.
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
     * @return a new instance of the custom {@code ListIterator}.
     */
    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    /**
     * A private inner class that implements the {@code Iterator} interface.
     *
     * <p>This class encapsulates the state and logic required for iterating over an
     * instance of {@code GenericList}. Using an inner class is a common and effective
     * pattern because it has direct access to the private members ({@code items} and
     * {@code count}) of its enclosing {@code GenericList} instance.
     */
    private class ListIterator implements Iterator<T> {

        /**
         * A reference to the list instance that this iterator will traverse.
         */
        private final GenericList<T> list;

        /**
         * The current position of the iterator (acts as a cursor).
         */
        private int index;

        /**
         * Constructs an iterator for the given list.
         *
         * @param list The {@code GenericList} to iterate over.
         */
        private ListIterator(GenericList<T> list) {
            this.list = list;
        }

        /**
         * Checks if the iteration has more elements.
         *
         * @return {@code true} if the iterator has more elements, otherwise {@code false}.
         */
        @Override
        public boolean hasNext() {
            return index < list.count;
        }

        /**
         * Returns the next element in the iteration and advances the cursor.
         *
         * @return the next element in the iteration.
         */
        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
