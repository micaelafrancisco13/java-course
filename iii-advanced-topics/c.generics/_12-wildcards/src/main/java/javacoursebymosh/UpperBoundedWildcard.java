package javacoursebymosh;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcard {
    public static void demo() {
//        The upper-bounded wildcard restricts the unknown type to be a subtype of T
//        (or T itself). This is particularly useful when you need to read items
//        from a generic structure and ensure that they are at least of type T.

//        Syntax: List<? extends Number>
//        This means “a list of elements that are of some type that extends Number.”

//        Read-Only: When you use ? extends T, you’re primarily allowed to get (read)
//        values out because you know that each element is at least of type T.
//        However, you cannot add any specific type to the list because the list
//        could be of any type that extends T (e.g., Integer, Double).

//        Flexibility in Return Types: It is used in method declarations when you want
//        to allow a method to accept a collection of any type that is a subtype of a
//        particular class.

        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5);

        // This is invalid as Integer cannot be assigned to Double without casting it
        // doubles.add(integers.getFirst());

        System.out.println(sumList(integers)); // Outputs 10.0
        System.out.println(sumList(doubles));  // Outputs 7.5
    }

//    List<? extends Number> means the list can be a list of any class that is a
//    subclass of Number, so reading a number is safe.
    private static double sumList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) { // Up-casting
            sum += num.doubleValue();
        }
        return sum;
    }
}
