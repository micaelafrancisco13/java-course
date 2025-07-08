package org.javacoursebymosh;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Main {
    public static void main(String[] args) {
        // 1. The Consumer Interface
        // - Part of java.util.function package, introduced in Java 8.
        // - Represents an operation that takes a single input argument and returns no result.
        // - Used for side-effect operations like printing, updating values, or logging.
        // - It’s a functional interface with one abstract method:
        //     void accept(T t);

        // --- Example 1: Using Consumer with forEach ---
        List<String> names = List.of("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println(name)); // Lambda as Consumer

        // --- Example 2: Declaring a Consumer explicitly ---
        Consumer<String> greeter = name -> System.out.println("Hello, " + name);
        greeter.accept("Micaela"); // Output: Hello, Micaela

        // --- Example 3: Consumer in Streams ---
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        numbers.stream()
                .peek(n -> System.out.println("Processing: " + n)) // Consumer used here
                .map(n -> n * 2)
                .forEach(n -> System.out.println("Result: " + n)); // Another Consumer

        // 2. Variants of the Consumer Interface

        // a. BiConsumer<T, U>
        // - Represents an operation that takes two input arguments and returns no result.
        // - Functional method: void accept(T t, U u)
        BiConsumer<String, Integer> printer = (name, age) ->
                System.out.println(name + " is " + age + " years old");
        printer.accept("Micaela", 25);

        // b. Primitive Specializations: IntConsumer, DoubleConsumer, LongConsumer, etc.
        // - These are specialized versions of Consumer for primitive types to avoid autoboxing.
        // - Autoboxing is when a primitive like `int` is automatically converted to an object like `Integer`.

        // --- Why avoid autoboxing? ---
        // When you use a generic Consumer<Integer>, Java wraps the primitive `int` into an Integer object.
        // This wrapping (autoboxing):
        //   1. Adds memory overhead (extra objects on the heap)
        //   2. Slows down performance due to object creation and garbage collection
        // This may be negligible in small code, but can be costly in performance-critical applications
        // (e.g., processing millions of elements in a loop).

        // --- Example: Consumer<Integer> with autoboxing ---
        Consumer<Integer> boxedConsumer = (Integer value) -> {
            System.out.println("Boxed value (as Integer): " + value);
        };
        int num = 10;
        boxedConsumer.accept(num); // Autoboxes int → Integer

        // --- Example: IntConsumer without autoboxing ---
        IntConsumer primitiveConsumer = (int value) -> {
            System.out.println("Primitive value: " + value);
        };
        primitiveConsumer.accept(num); // No boxing, better performance

        // --- Loop example with IntConsumer ---
        for (int i = 0; i < 5; i++) {
            primitiveConsumer.accept(i); // No object creation
        }

        // Summary:
        // - Use Consumer<T> when dealing with objects.
        // - Prefer IntConsumer, DoubleConsumer, etc., when working with primitives to avoid unnecessary overhead.
        // - Helps write cleaner, functional-style code, especially with lambda expressions and method references.

        // 3. Many Java APIs expect Consumers:
        // - List.forEach(), Stream.forEach(), Stream.peek(), etc.

        // 4. See more usage in the LambdasDemo class
        LambdasDemo.show();
    }
}
