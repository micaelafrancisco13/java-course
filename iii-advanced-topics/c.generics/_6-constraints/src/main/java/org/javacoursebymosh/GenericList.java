package org.javacoursebymosh;

// what if we want to support the operations
// only on integers?
// "extends Number"
// T can now be the Number class or any of the Number
// class' child classes
public class GenericList<T extends Number> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
