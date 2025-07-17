package org.javacoursebymosh;

/**
 * Demonstrates the benefits of using a custom generic collection class.
 */
public class Main {

    /**
     * The main entry point showcasing the advantages of {@code GenericList}.
     *
     * <p>
     * Using a generic class like {@code GenericList<User>} provides two major benefits
     * over a non-generic list that uses {@code Object}.
     * </p>
     *
     * <h2>1. Compile-Time Type Safety</h2>
     * The compiler enforces that only objects of the specified type ({@code User} in this case)
     * can be added to the list. Any attempt to add an incompatible type will result in a
     * compile-time error, preventing bugs before the program even runs.
     *
     * <pre>{@code
     * var list = new GenericList<User>();
     * list.add(new User()); // OK
     * // list.add(1);       // Compile-time error!
     * }</pre>
     *
     * <h2>2. Elimination of Manual Casting</h2>
     * Because the compiler knows the exact type of the elements in the list, there is no
     * need to manually cast an item when you retrieve it.
     *
     * <p>
     * This makes the code cleaner, safer, and easier to read.
     * </p>
     */
    public static void main(String[] args) {
        // We specify that this list will only hold User objects.
        var list = new GenericList<User>();
        list.add(new User("Ela"));

        // No cast is needed because the compiler knows get(0) returns a User.
        User user = list.get(0);
        System.out.println(user);

        var list2 = new GenericList<Integer>();
        list2.add(1);
        int number = list2.get(0);
        System.out.println(number);
    }
}
