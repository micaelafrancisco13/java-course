package org.javacoursebymosh;

/**
 * Demonstrates key concepts of Java generics, including wrapper classes and instantiation.
 */
public class Main {

    /**
     * The main entry point showcasing generic type arguments and instantiation.
     *
     * <h2>Generics Require Reference Types</h2>
     * A key rule of generics in Java is that the type argument provided inside the angle
     * brackets ({@code <>}) must be a <b>reference type</b> (e.g., a class or interface).
     * You cannot use primitive types like {@code int}, {@code double}, etc.
     *
     * <hr>
     *
     * <h2>Wrapper Classes, Boxing, and Unboxing 🥊</h2>
     * To use primitive values with generics, Java provides a <b>wrapper class</b> for each
     * primitive type:
     * <ul>
     *   <li>{@code int} → {@code Integer}</li>
     *   <li>{@code double} → {@code Double}</li>
     *   <li>{@code boolean} → {@code Boolean}</li>
     * </ul>
     *
     * The conversion between primitives and their wrapper types is often automatic:
     * <ul>
     *   <li><b>Boxing:</b> Converting a primitive to its wrapper object.
     *     <br>Example: {@code Integer number = 1;} (autoboxing)</li>
     *   <li><b>Unboxing:</b> Converting a wrapper object back to its primitive value.
     *     <br>Example: {@code int value = number;} (auto-unboxing)</li>
     * </ul>
     */
    public static void main(String[] args) {
        // The type argument <User> is a reference type.
        var list = new GenericList<User>();
        list.add(new User("Ela"));

        User user = list.get(0);
        System.out.println(user);
    }
}
