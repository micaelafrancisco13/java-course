package org.javacoursebymosh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        // ArrayList is one of the classes that implements the
        // Collection interface.
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("e");

        // collection is iterable
        for (var item : collection)
            System.out.println(item);

        // add elements in one go
        Collections.addAll(collection, "f", "g", "h");

        // prints the collection as a whole
        System.out.println(collection);

        // returns the size of the collection
        System.out.println(collection.size());

        // the following are operations:
        // removes an item from the collection
        collection.remove("d");
        System.out.println(collection);

        // removes all items in one go
        // collection.clear();

        // check for an item's existence
        System.out.println(collection.contains("a"));

        // converts a collection to a regular array
        // if no argument is passed on toArray(), it'll return
        // an Object[]
        // new String[0] - 0 here means that the JVM will create
        // an array with enough capacity to hold the collection
        // items
        var arrayCollection = collection.toArray(new String[0]);
        System.out.println(arrayCollection[0]);

        Collection<String> other  = new ArrayList<>();

        // note that if we used "var" for line 52, the type of
        // the "other" variable is the ArrayList class, not the
        // Collection interface.

        // adds all the items from "collection" to "other"
        other.addAll(collection);

        // compares 2 collections for equality
        // "==" compares objects by their memory address
        System.out.println(collection.equals(other));
    }
}
