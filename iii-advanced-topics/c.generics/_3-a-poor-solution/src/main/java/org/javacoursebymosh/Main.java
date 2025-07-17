package org.javacoursebymosh;

/**
 * Demonstrates the problems of using the {@code Object} class for creating
 * a general-purpose collection, highlighting the need for generics.
 *
 * <p>
 * This example uses a {@code List} that stores {@code Object} instances.
 * While this makes the list versatile, it introduces significant issues
 * with type safety and code verbosity.
 * </p>
 *
 * <h2>Autoboxing</h2>
 * Java automatically converts a primitive type (like {@code int}) into its
 * corresponding wrapper class object ({@code Integer}) when an object is required.
 *
 * <p>
 * This process is called <b>autoboxing</b>. It's why we can call {@code list.add(1)}
 * even though the {@code add} method expects an {@code Object}. The compiler
 * effectively transforms the call to {@code list.add(Integer.valueOf(1))}.
 * </p>
 *
 * <hr>
 *
 * <h2>Problems with Using {@code Object}</h2>
 * <ol>
 *   <li><b>Verbose Type Casting:</b> When retrieving an item, you must explicitly
 *   cast it back to its original type (e.g., {@code (int) list.get(0)}).
 *   This makes the code noisy and harder to read.</li>
 *
 *   <li><b>Lack of Type Safety:</b> The biggest issue is the risk of a
 *   {@code ClassCastException} at runtime. The compiler cannot verify if a cast
 *   is valid. If you mistakenly cast an object to the wrong type, the error will
 *   only surface when the program is running, making the code brittle.</li>
 * </ol>
 *
 * <p>
 * These problems are precisely what <b>Generics</b> were introduced to solve,
 * by providing compile-time type safety. ✅
 * </p>
 */
public class Main {
    public static void main(String[] args) {
        // This list can now store any type of object.
        var list = new List();
        list.add(1);         // Autoboxed to Integer
        list.add("Hello");
        list.add(new User());

        // We must cast the object back to its original type.
        int number = (int) list.get(0);
    }
}
