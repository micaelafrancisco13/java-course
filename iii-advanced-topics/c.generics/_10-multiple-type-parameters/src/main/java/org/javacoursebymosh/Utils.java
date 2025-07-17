package org.javacoursebymosh;

/**
 * A utility class containing reusable, static helper methods.
 */
public class Utils {
    /**
     * A generic method to find the greater of two comparable objects.
     *
     * @param <T>    The type of the objects to compare.
     * @param first  The first object.
     * @param second The second object.
     * @return The greater of the two objects.
     */
    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second) < 0) ? second : first;
    }

    /**
     * A generic method that accepts two arguments of potentially different types.
     * <p>
     * The {@code <K, V>} declaration defines two type parameters for this method,
     * allowing it to be called with any combination of key and value types.
     *
     * @param <K>   The type of the key.
     * @param <V>   The type of the value.
     * @param key   The key to be printed.
     * @param value The value to be printed.
     */
    public static <K, V> void print(K key, V value) {
        System.out.println(key + " = " + value);
    }

    public static <K, V> void log(KeyValuePair<K, V> keyValuePair) {
        System.out.println("Logging: " + keyValuePair);
    }
}