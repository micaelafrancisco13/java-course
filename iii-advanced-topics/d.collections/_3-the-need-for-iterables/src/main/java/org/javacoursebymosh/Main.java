package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // the Iterable interface is at the top of the hierarchy.
        // more accurately, this interface isn't a part of the
        // Collections framework, in fact, it's part of the
        // "java.lang" package.

        var genericList = new GenericList<String>();
        genericList.add("a");
        genericList.add("b");
        genericList.add("c");
        genericList.add("d");
        genericList.add("e");

        // "for (var item : genericList)" throws a compilation error
        // one way to solve this problem is go back to the GenericList
        // and make the "items" field public, then we'll be able to
        // access it.
        // "for (var item : genericList.items)"
        // this approach violates the abstraction principle, and if we
        // change its data structure (e.g., ArrayList<T>), all the code
        // that uses this field will have to be changed.

        // how can we iterate through a list w/o knowing its internal
        // implementation?
    }
}