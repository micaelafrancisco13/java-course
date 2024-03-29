package org.javacoursebymosh;

// Comparable interface is used for implementing classes
// that can be compared with each other

// if we implement the Comparable interface in User class,
// we can compare User objects based on some criteria (e.g.,
// user points) then we can sort users based on their points

// this list can only store objects that are comparable

// we can also add multiple interfaces as constraints by using
// the "&" operator.
// if you want to be able to clone/copy a class, Cloneable interface
// must be implemented in that class.
public class GenericListComparable<T extends Comparable & Cloneable> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
