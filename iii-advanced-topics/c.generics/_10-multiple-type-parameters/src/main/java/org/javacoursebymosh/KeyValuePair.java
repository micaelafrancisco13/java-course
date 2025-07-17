package org.javacoursebymosh;

/**
 * A generic class that uses multiple type parameters to represent a key-value pair.
 * <p>
 * The {@code <K, V>} declaration allows this class to be instantiated with any
 * combination of types for its key and value, making it a flexible and reusable
 * data structure. For example, {@code new KeyValuePair<String, Integer>()}.
 *
 * @param <K> The type of the key.
 * @param <V> The type of the value.
 */
public class KeyValuePair<K, V> {
    private final K key;
    private final V value;

    /**
     * Constructs a new KeyValuePair with the given key and value.
     *
     * @param key   The key.
     * @param value The value.
     */
    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "KeyValuePair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}