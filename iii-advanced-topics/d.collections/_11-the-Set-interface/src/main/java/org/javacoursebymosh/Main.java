package org.javacoursebymosh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // the following are interfaces with inheritance applied:
        //          Iterable
        //         Collection
        //      List   Queue   Set

        // the Set interface represents a collection that has no
        // duplicates

        Set<String> set = new HashSet<>();
        set.add("sky");
        set.add("is");
        set.add("blue");
        set.add("blue");

        // removes the duplicate
        // does not guarantee the order of the set items
        System.out.println(set);

        // removes the duplicates from a collection
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c", "c");

        // put this collection in a set
        Set<String> collectionWithoutDuplicates = new HashSet<>(collection);
        System.out.println(collectionWithoutDuplicates);

        // initializing a set
        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

        // 4 operations on a set
        // these operations are mutable
        // first one is union, which combines the items from 2 sets
        set1.addAll(set2);
        System.out.println("set1 " + set1);

        // the second one is intersection, which returns the common items in
        // both sets
        set1.retainAll(set2);
        System.out.println("set1 " + set1);

        // the third one is difference, which returns the item in the first
        // set that we don't have in the second set
        set1.removeAll(set2);
        System.out.println("set1 " + set1);
    }
}