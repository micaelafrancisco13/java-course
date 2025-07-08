package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        /*
         * STEP 1: Understanding the Predicate interface
         * ---------------------------------------------
         * - Predicate<T> is a functional interface introduced in Java 8.
         * - It is located in the java.util.function package.
         * - It represents a condition (or predicate) that tests an object of type T and returns a boolean result.
         * - Think of it as a function that answers a YES/NO question (true/false).
         *
         * Example use cases: filtering a collection, validating input, etc.
         *
         * Signature of the abstract method in Predicate:
         *      boolean test(T t);
         */

        /*
         * STEP 2: Predicate interface specializations
         * --------------------------------------------
         * - BiPredicate<T, U>: Similar to Predicate, but accepts two input parameters instead of one.
         *      Signature: boolean test(T t, U u);
         *
         * - Useful when the condition involves comparing or combining two values.
         */

        /*
         * STEP 3: Primitive specializations for performance
         * -------------------------------------------------
         * - Java provides specialized versions of Predicate for primitive types to avoid unnecessary boxing/unboxing.
         *
         *   Some examples:
         *   - IntPredicate    -> boolean test(int value)
         *   - LongPredicate   -> boolean test(long value)
         *   - DoublePredicate -> boolean test(double value)
         *
         * - These interfaces work exactly like Predicate but operate directly on primitives.
         */

        // STEP 4: Call the demo method to see Predicate in action
        LambdasDemo.show();
    }
}