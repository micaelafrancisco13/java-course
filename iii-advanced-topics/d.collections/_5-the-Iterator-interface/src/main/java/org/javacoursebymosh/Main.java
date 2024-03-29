package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // we made our GenericList iterable by implementing the
        // Iterable interface.
        // the ListIterator class' instance is an object that
        // knows how to iterate over a GenericList.

        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        for (var item : list)
            System.out.println(item);
    }
}