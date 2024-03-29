package org.javacoursebymosh;

// when we compile our code, the JVM will replace all these Ts
// with the Object class.

// internally, this class is implemented like the custom List
// class we created earlier.

// the difference between these 2 implementations is compile-time
// type safety.

// when "extends Number" is applied, all these Ts are converted to
// the constraint class we have set.

// when we have 2 constraints, all these Ts are converted to the
// leftmost constraint we have set.

// this is called "type erasure," which means that the JVM erases
// these type parameters and replaces them with the class/interface
// depending on the constraints.
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
