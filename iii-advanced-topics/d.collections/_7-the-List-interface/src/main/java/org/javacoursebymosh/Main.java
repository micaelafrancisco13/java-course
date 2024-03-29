package org.javacoursebymosh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // the following are interfaces with inheritance applied:
        //          Iterable
        //         Collection
        //      List   Queue   Set

        // the List interface represents an ordered collection also
        // called a "sequence"

        // in Collection interface, we don't have access to element's
        // index, unlike in List interface, we have.
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        // overload of add() that inserts an element at a given index
        list.add(1, "second element");
        System.out.println(list);

        // adds elements in one go
        Collections.addAll(list, "f", "g", "h");
        System.out.println(list);

        // prints the element at a given index
        System.out.println(list.get(1));

        // replaces an element at a given index
        list.set(1, "updated second element");
        System.out.println(list);

        // removes an element at a given index
        list.remove(1);
        System.out.println(list);

        // returns the index of a given element's first occurrence
        // returns -1 if the element doesn't exist
        System.out.println(list.indexOf("a"));

        // returns the index of a given element's last occurrence
        System.out.println(list.lastIndexOf("a"));

        // "from" is inclusive and "to" is exclusive
        // returns the elements from 0 to 1 index
        // subList() is immutable
        System.out.println(list.subList(0, 2));
    }
}