package javacoursebymosh;

import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates the unbounded wildcard {@code <?>}.
 *
 * <h2>Unbounded Wildcard: {@code List<?>}</h2>
 * This wildcard represents a list of some <b>unknown type</b>. It is most useful
 * when you want to write a method that works with any type of list, but the method's
 * logic does not depend on the specific type of the elements inside it.
 *
 * <h3>Rules:</h3>
 * <ul>
 *   <li><b>Read-Only Nature:</b> You cannot add any elements to the list (except for
 *       {@code null}) because the compiler cannot verify if the element you are adding
 *       matches the list's unknown type. This ensures type safety.</li>
 *   <li><b>Reading Elements:</b> You can safely read elements from the list, but the
 *       compiler can only guarantee that they are instances of {@code Object}.</li>
 * </ul>
 */
public class UnboundedWildcard {
    public static void demo() {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<String> strList = Arrays.asList("a", "b", "c");

        printList(intList);
        printList(strList);
    }

    /**
     * Prints all elements in a list of any type.
     *
     * @param list A list of an unknown element type.
     */
    private static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }
}
