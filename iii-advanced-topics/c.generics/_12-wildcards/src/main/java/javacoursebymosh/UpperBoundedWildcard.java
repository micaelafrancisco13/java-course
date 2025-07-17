package javacoursebymosh;

import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates the upper bounded wildcard {@code <? extends Type>}.
 *
 * <h2>Upper Bounded Wildcard: {@code List<? extends Number>}</h2>
 * This wildcard restricts the unknown type to be either {@code Number} or a
 * <b>subtype</b> of {@code Number} (like {@code Integer} or {@code Double}). It is ideal
 * for scenarios where you need to <b>read</b> from a collection (a "producer").
 *
 * <p>This follows the "Producer Extends" part of the <b>PECS</b> principle.</p>
 *
 * <h3>Rules:</h3>
 * <ul>
 *   <li><b>Reading Elements:</b> You can safely read elements from the list and treat
 *       them as the bound type (in this case, {@code Number}). This is because you are
 *       guaranteed that any element will be at least a {@code Number}.</li>
 *   <li><b>Write-Restricted:</b> You cannot add elements to the list (except for
 *       {@code null}). The compiler doesn't know the list's exact type—is it a
 *       {@code List<Integer>} or a {@code List<Double>}? Adding an {@code Integer} to a
 *       {@code List<Double>} would be a type error, so the compiler prohibits it.</li>
 * </ul>
 */
public class UpperBoundedWildcard {
    public static void demo() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5);

        System.out.println("Sum of integers: " + sumList(integers));
        System.out.println("Sum of doubles: " + sumList(doubles));
    }

    /**
     * Calculates the sum of a list of numbers.
     *
     * @param list A list containing elements of type Number or its subclasses.
     * @return The sum of the list's elements as a double.
     */
    private static double sumList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }
}
