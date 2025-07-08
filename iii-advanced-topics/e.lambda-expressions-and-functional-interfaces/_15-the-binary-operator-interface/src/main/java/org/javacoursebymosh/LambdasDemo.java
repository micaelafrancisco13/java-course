package org.javacoursebymosh;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;

public class LambdasDemo {
    public static void show() {

        /*
         * STEP 1: Basic binary operation using primitive types
         * ----------------------------------------------------
         * - A binary operation involves two operands and produces a result.
         * - In this example, the sum of 1 and 2 is calculated.
         */
        var sum = 1 + 2;
        System.out.println(sum);  // Output: 3

        /*
         * STEP 2: Representing binary operations using BinaryOperator<T>
         * ---------------------------------------------------------------
         * - BinaryOperator<T> is a functional interface in java.util.function.
         * - It extends BiFunction<T, T, T>, meaning:
         *     - Takes two inputs of type T
         *     - Returns a result of type T
         *
         * - This is useful when the operation involves two operands of the same type
         *   and the result is also of the same type.
         *
         * Example: addition, multiplication, max, min, etc.
         */

        // Create a BinaryOperator that adds two Integers
        BinaryOperator<Integer> add = Integer::sum;

        /*
         * STEP 3: Using Function<T, R> to transform the result
         * -----------------------------------------------------
         * - Function<T, R> represents a function that takes a value of type T and returns a value of type R.
         * - In this case, we want to square the result of the addition.
         */
        Function<Integer, Integer> square = a -> a * a;

        /*
         * STEP 4: Combining BinaryOperator and Function using andThen()
         * --------------------------------------------------------------
         * - The andThen() method allows you to chain operations.
         * - It first applies the BinaryOperator (add), then passes the result to the Function (square).
         *
         *   add.andThen(square).apply(1, 3)
         *   = square(add(1, 3)) = square(4) = 16
         */
        var result = add.andThen(square).apply(1, 3);
        System.out.println(result);  // Output: 16

        /*
         * STEP 5: Using primitive specializations for performance
         * --------------------------------------------------------
         * - Java provides specialized versions of functional interfaces for primitives
         *   to avoid boxing/unboxing overhead.
         *
         * - IntBinaryOperator: takes two int values and returns an int
         *     Signature: int applyAsInt(int left, int right)
         *
         * - IntFunction<R>: takes an int and returns a value of type R
         */
        IntBinaryOperator summarize = Integer::sum;          // Adds two primitive ints
        IntFunction<Integer> raiseToTwo = a -> a * a;        // Squares the given int

        /*
         * STEP 6: Applying the primitive operators
         * -----------------------------------------
         * - First, apply summarize to 5 and 5 -> 10
         * - Then, apply raiseToTwo to 10 -> 100
         */
        var squared = raiseToTwo.apply(summarize.applyAsInt(5, 5));
        System.out.println(squared);  // Output: 100
    }
}
