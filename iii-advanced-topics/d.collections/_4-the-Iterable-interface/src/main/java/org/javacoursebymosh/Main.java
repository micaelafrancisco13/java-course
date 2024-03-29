package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // how can we iterate through a list w/o knowing its internal
        // implementation?
        // the Iterable interface represents an object that can be
        // looped through / iterated w/o knowing anything about its
        // implementation detail.

        var list = new GenericList<String>();
        var iterator = list.iterator();

        // we can now loop over a list
        while (iterator.hasNext()) {
            var currentObject = iterator.next();
            System.out.println(currentObject);
        }

        // say that our list looks like this:
        // [a, b, c]
        //  ^ - this iterator is like a pointer that is pointing to
        //      one object
        // hasNext() -> advances to next object
        // next() -> returns the current object

        // the for-each loop is a syntactic sugar over the Iterator
        // object. JVM converts a for-each loop to use the Iterator
        // object.
    }
}