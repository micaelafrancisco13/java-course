package org.javacoursebymosh;

/**
 * Provides a comprehensive overview of the core interfaces in the Java Collections Framework.
 *
 * The framework offers a hierarchy of interfaces and classes to represent and manage groups
 * of objects. At its core is a well-structured set of interfaces.
 *
 * <h3>Collection Hierarchy</h3>
 * <pre>{@code
 *        Iterable<E>
 *              |
 *       Collection<E>
 *       /     |     \
 * List<E> Queue<E> Set<E>
 * }</pre>
 *
 * <hr>
 *
 * <h2>🚶 {@code Iterable<E>}</h2>
 * The root interface of the Collections Framework. A class that implements {@code Iterable}
 * can be used in a for-each loop. It defines:
 * <ul>
 *   <li>{@code Iterator<E> iterator()} — returns an iterator over elements of type {@code E}</li>
 * </ul>
 *
 * <hr>
 *
 * <h2>📦 {@code Collection<E>}</h2>
 * Extends {@code Iterable}. Represents a group of elements. Declares common collection operations:
 * <ul>
 *   <li>{@code boolean add(E e)}</li>
 *   <li>{@code boolean remove(Object o)}</li>
 *   <li>{@code int size()}</li>
 *   <li>{@code boolean isEmpty()}</li>
 *   <li>{@code boolean contains(Object o)}</li>
 *   <li>{@code void clear()}</li>
 * </ul>
 *
 * <hr>
 *
 * <h2>The Three Main Subinterfaces</h2>
 *
 * <h3>1. {@code List<E>}</h3>
 * Represents an ordered sequence. Allows duplicates. Indexable.
 * <ul>
 *   <li><strong>Common Implementations:</strong> {@code ArrayList}, {@code LinkedList}</li>
 * </ul>
 *
 * <h3>2. {@code Queue<E>}</h3>
 * Designed for holding elements prior to processing. Usually FIFO.
 * <ul>
 *   <li><strong>Common Implementations:</strong> {@code PriorityQueue}, {@code ArrayDeque}</li>
 * </ul>
 *
 * <h3>3. {@code Set<E>}</h3>
 * No duplicates allowed. Models a mathematical set.
 * <ul>
 *   <li><strong>Common Implementations:</strong> {@code HashSet}, {@code TreeSet}</li>
 * </ul>
 */
public class Main {
    /**
     * The main method is intentionally left empty.
     * <p>
     * This class is used only as a container for educational documentation
     * on the Collections Framework interfaces.
     *
     * @param args Command-line arguments (unused)
     */
    public static void main(String[] args) {
        // No implementation needed.
    }
}
