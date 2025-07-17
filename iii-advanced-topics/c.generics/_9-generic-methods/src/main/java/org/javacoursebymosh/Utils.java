package org.javacoursebymosh;

/**
 * A utility class containing reusable, static helper methods.
 */
public class Utils {

    /**
     * A generic method to find the greater of two objects.
     *
     * <p>The {@code <T extends Comparable<T>>} declaration before the return type
     * defines this as a <b>generic method</b> with a <b>bounded type parameter</b>.
     *
     * <ul>
     *   <li>The {@code <T>} declares a type parameter {@code T} for this method only.</li>
     *   <li>The {@code extends Comparable<T>} part is a constraint. It means this method
     *       will only accept objects of a type {@code T} that implements the
     *       {@code Comparable<T>} interface.</li>
     * </ul>
     *
     * <p>This constraint is necessary because comparison operators like {@code >} or {@code <}
     * only work on primitive types. For objects, we must use the {@code compareTo()}
     * method to define how they are compared.
     *
     * @param <T>    The type of the objects to compare, which must be comparable.
     * @param first  The first object.
     * @param second The second object.
     * @return The greater of the two objects.
     */
    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second) < 0) ? second : first;
    }
}
