package org.javacoursebymosh;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class LambdasDemo {
    public static void show() {
        // Math::random is a method reference to Math.random(), which returns a double value.
        // So this method reference is compatible with DoubleSupplier.
        DoubleSupplier doubleSupplier = Math::random;

        // When we call getAsDouble(), it invokes Math.random() internally.
        // This will print a random number between 0.0 (inclusive) and 1.0 (exclusive).
        System.out.println("Using DoubleSupplier:");
        System.out.println(doubleSupplier.getAsDouble());

        // --- Supplier<Double> ---
        // - This is a more general functional interface.
        // - It also takes no arguments, but returns a generic type (in this case, Double object).
        // - Functional method: T get();

        // Math.random() still works here because it returns a double,
        // and Java will automatically autobox it into a Double object.
        Supplier<Double> supplier = Math::random;

        // When we call get(), the primitive double result is autoboxed into a Double object.
        System.out.println("Using Supplier<Double>:");
        System.out.println(supplier.get());

        // --- Key Difference ---
        // DoubleSupplier   → returns a primitive double (faster, no boxing)
        // Supplier<Double> → returns a boxed Double object (slightly slower, uses more memory)
        //
        // Use DoubleSupplier when working with primitive double to avoid autoboxing overhead,
        // especially in performance-sensitive or high-volume numeric processing.
        //
        // Both are used in contexts where you want to *generate* values on demand,
        // such as producing random numbers, timestamps, UUIDs, or reading sensor values.

        // --- Equivalent Lambda Forms ---
        // These lines do exactly the same thing as the method references above,
        // but use lambda expressions instead:
        //
        // DoubleSupplier ds = () -> Math.random();
        // Supplier<Double> s = () -> Math.random();
    }
}
