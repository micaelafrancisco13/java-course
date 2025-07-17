package javacoursebymosh;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates the lower bounded wildcard {@code <? super Type>}.
 *
 * <h2>Lower Bounded Wildcard: {@code List<? super Integer>}</h2>
 * This wildcard restricts the unknown type to be either {@code Integer} or a
 * <b>supertype</b> of {@code Integer} (like {@code Number} or {@code Object}). It is
 * ideal for scenarios where you need to <b>write</b> to a collection (a "consumer").
 *
 * <p>This follows the "Consumer Super" part of the <b>PECS</b> principle.</p>
 *
 * <h3>Rules:</h3>
 * <ul>
 *   <li><b>Writing Elements:</b> You can safely add elements of type {@code Integer} (or
 *       its subtypes) to the list. This is because the list is guaranteed to be of a
 *       type that can hold {@code Integer}s (e.g., {@code List<Integer>},
 *       {@code List<Number>}).</li>
 *   <li><b>Read-Restricted:</b> When you read from the list, the only type you can
 *       safely assume is {@code Object}. The compiler doesn't know if the list contains
 *       {@code Integer}s, {@code Number}s, or just plain {@code Object}s.</li>
 * </ul>
 */
public class LowerBoundedWildcard {
    public static void demo() {
        List<Integer> integerList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        addIntegers(integerList);
        addIntegers(numberList);
        // addIntegers(objectList); // Uncommenting this would work if allowed by the method signature
    }

    /**
     * Adds integers to a list that can hold integers or their supertypes.
     *
     * @param list A list capable of consuming Integer objects.
     */
    private static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);

        // Reading is restricted to Object.
        Object obj = list.getFirst(); // For Java 21+ with List.getFirst()
    }
}
