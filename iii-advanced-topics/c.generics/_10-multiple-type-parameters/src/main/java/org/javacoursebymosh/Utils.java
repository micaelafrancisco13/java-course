package org.javacoursebymosh;

public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second) {
        return first.compareTo(second) < 0 ? second : first;
    }

    // what if we want the key & value to also accept strings?
    // we need to declare a second type parameter
    public static <K, V> void print(K key, V value) {
        System.out.println(key + " = " + value);
    }
}
