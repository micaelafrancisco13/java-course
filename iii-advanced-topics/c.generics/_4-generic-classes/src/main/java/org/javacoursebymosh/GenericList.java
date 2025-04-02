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
    private final T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    // Line 24 does not work.
    // Number number = new Object();

    // An instance of Object (created by new Object()) is not necessarily a Number.
    // Although every Number is an Object, not every Object is a Number.
    // The type system enforces that the right-hand side must be of type Number (or a
    // subclass thereof) for this assignment to be valid. Since Object is a more general
    // type, the compiler rejects this assignment.

    // Line 33 works.
    // Object number = (Number) 10;

    // The literal 10 is first autoboxed into an Integer (which is a subclass of Number).
    // The cast (Number) 10 tells the compiler to treat the resulting Integer as a Number.
    // Since Integer is indeed a Number, the cast is valid. Finally, assigning that Number
    // to an Object is allowed because every Number is an Object.
}
