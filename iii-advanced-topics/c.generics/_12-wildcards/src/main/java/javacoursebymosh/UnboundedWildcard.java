package javacoursebymosh;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcard {
    public static void demo() {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<String> strList = Arrays.asList("a", "b", "c");

        printList(intList);  // prints numbers
        printList(strList);  // prints strings
    }

    // An unbounded wildcard represents an unknown type. It is used when the type
    // parameter can be any type. For example, suppose you want to write a method
    // that can work with a list of any type:
    private static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }
//    In this method:
//    - List<?> means “a list of elements of some unknown type.”
//    - Since the type is unknown, you cannot add elements into the list (except
//    null), because you cannot guarantee type safety.
//    - You can safely read from the list; every element will at least be an Object.
}
