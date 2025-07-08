package org.javacoursebymosh;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // --- 3. The Function Interface ---

        // The Function interface is part of the java.util.function package.
        // It represents a mapping operation — a function that takes an input
        // of type T and returns a result of type R.
        //
        // Functional method:
        //     R apply(T t);
        //
        // Example: A function that takes a String and returns its length
        Function<String, Integer> stringLength = str -> str.length();
        stringLength.apply("hello"); // returns 5

        // --- BiFunction Interface ---

        // The BiFunction interface is similar to Function, but it takes *two* input arguments.
        // Useful for operations like combining two values or computing something from a pair.
        //
        // Functional method:
        //     R apply(T t, U u);
        //
        // Example:
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        add.apply(2, 3); // returns 5

        // --- Primitive Specializations for Performance ---

        // Java provides specialized versions of the Function interface for primitives.
        // These help avoid the performance overhead of autoboxing (converting between
        // primitives and wrapper classes like int <-> Integer).

        // a. IntFunction<R>
        // - Accepts a primitive int as input and returns a value of generic type R.
        // - Signature: R apply(int value);
        // - Avoids boxing the int argument.
        //
        // Example:
        IntFunction<String> formatter = i -> "Value: " + i;
        formatter.apply(5); // returns "Value: 5"
        //
        // Other similar variants: LongFunction<R>, DoubleFunction<R>, etc.

        // b. ToIntFunction<T>
        // - Accepts an object of type T and returns a primitive int.
        // - Signature: int applyAsInt(T value);
        // - Avoids boxing the return value.
        //
        // Example:
        ToIntFunction<String> lengthFunction = s -> s.length();
        lengthFunction.applyAsInt("hello"); // returns 5
        //
        // Other similar variants: ToLongFunction<T>, ToDoubleFunction<T>

        // c. IntToLongFunction
        // - Accepts a primitive int and returns a primitive long.
        // - Signature: long applyAsLong(int value);
        // - Avoids boxing both the input and output.
        //
        // Example:
        IntToLongFunction multiplier = i -> (long) i * 1000;
        multiplier.applyAsLong(3); // returns 3000L
        //
        // Other similar variants:
        //     IntToDoubleFunction, LongToIntFunction, DoubleToIntFunction, etc.

        // --- Summary ---
        // Use Function and BiFunction for general-purpose functional transformations.
        // Use primitive specializations like IntFunction or ToIntFunction to write
        // performance-efficient code that avoids unnecessary object creation.

        // View practical examples in the LambdasDemo class
        LambdasDemo.show();
    }
}
