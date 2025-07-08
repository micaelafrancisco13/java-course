package org.javacoursebymosh;

import java.util.function.IntUnaryOperator;

public class LambdasDemo {
    public static void show() {

        /*
         * STEP 1: Understand what a unary operation is
         * ---------------------------------------------
         * - A unary operation involves only **one operand**.
         * - Example: computing the square root of a number is a unary operation
         *   because it takes a single input (e.g., 2) and produces a result.
         */
        var squared = Math.sqrt(2);
        System.out.println(squared);  // Output: approx. 1.4142

        /*
         * STEP 2: Introduction to UnaryOperator<T>
         * ------------------------------------------
         * - UnaryOperator<T> is a functional interface that extends Function<T, T>
         * - It represents a function that takes one argument of type T
         *   and returns a result of the same type.
         *
         *   Signature: T apply(T t)
         *
         * - It is typically used for operations like incrementing, negating,
         *   squaring, converting strings, etc.
         *
         * - Primitive Specialization:
         *   Java also provides `IntUnaryOperator`, `DoubleUnaryOperator`, and `LongUnaryOperator`
         *   for performance optimization when dealing with primitive types.
         */

        // STEP 3: Define an IntUnaryOperator that squares its input
        IntUnaryOperator square = operand -> operand * operand;

        // STEP 4: Define another IntUnaryOperator that increments its input by 1
        IntUnaryOperator increment = operand -> ++operand;

        /*
         * STEP 5: Combine both operations using andThen()
         * -----------------------------------------------
         * - The `andThen()` method allows function composition: f(x).andThen(g(x)) == g(f(x))
         * - Here’s what happens:
         *   1. First, increment is applied to the input (3 + 1 = 4)
         *   2. Then, square is applied to the result (4 * 4 = 16)
         */
        var result = increment
                .andThen(square)
                .applyAsInt(3);
        System.out.println(result);  // Output: 16

        /*
         * STEP 6: Clarification of the term "Unary"
         * ------------------------------------------
         * - The term “unary” means that the operation takes only one argument.
         * - Whether it's computing the square root, squaring, or incrementing a number,
         *   each of these operations uses a **single input** — this is the defining feature
         *   of unary operations.
         */
    }
}
