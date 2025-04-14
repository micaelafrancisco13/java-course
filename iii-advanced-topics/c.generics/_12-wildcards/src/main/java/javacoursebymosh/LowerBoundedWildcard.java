package javacoursebymosh;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcard {
    public static void demo() {
//        The lower-bounded wildcard restricts the unknown type to be a supertype
//        of T. It is used when you want to write data to a generic structure.

//        Syntax: List<? super Integer>
//        This means “a list of elements that are of some type that is a supertype
//        of Integer” (for example, Number or Object).

//        Write-Only (for Specific Types): With ? super T, you can add values of
//        type T into the list because you are guaranteed that the list can accept
//        T or any subclass of T. However, when reading from the list, all you can
//        safely assume is that the objects are of type Object because the compiler
//        doesn’t know exactly how far up the class hierarchy the list type is.

//        Flexibility for Input Parameters: It’s especially useful for methods that
//        need to insert items into a structure.

        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        addIntegers(numberList);  // Legal: Number is a supertype of Integer.
        addIntegers(objectList);  // Legal: Object is a supertype of Integer.
    }

    private static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);

        // You can add Integer elements to the list, but if you try to read a value,
        // the safest type you can assume is Object:
        // Safe, but you don’t know if it’s an Integer, Number, etc.
        Object obj = list.getFirst();

        // This is invalid as not all Number objects are Integers.
        // Integer obj = list.getFirst();
    }
}
