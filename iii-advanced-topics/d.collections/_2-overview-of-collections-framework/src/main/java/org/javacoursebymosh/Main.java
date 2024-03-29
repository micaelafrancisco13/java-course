package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // the following are interfaces with inheritance applied:
        //          Iterable
        //         Collection
        //      List   Queue   Set

        // and the following are classes that implement these
        // interfaces:
        // ArrayList - PriorityQueue - HashSet
        // LinkedList

        // the Iterable interface represents an object that
        // can be used in a for-each statement.
        // if we implement this interface in our GenericList
        // class, we'll be able to iterate through the instance
        // of that class.

        // the Collection interface represents an object that
        // acts as a container or collection of objects.
        // in a collection, we should be able to do the ff.
        // add an object
        // remove an object
        // check for the existence of an object and so on...
        // add() - addAll() - clear() and so on...

        // List interface
        // - ordered collection
        // - access objects using their index
        // - ArrayList and LinkedList are implementations

        // Queue interface
        // - we use queue when we have a resource that can be
        //   shared amongst many consumers
        // - PriorityQueue is an implementation

        // Set interface
        // - this represents a collection without duplicates
        // - HashSet is an implementation
    }
}