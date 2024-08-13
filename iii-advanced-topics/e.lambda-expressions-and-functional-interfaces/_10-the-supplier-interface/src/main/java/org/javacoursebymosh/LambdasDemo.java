package org.javacoursebymosh;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class LambdasDemo {
    public static void show() {
        DoubleSupplier doubleSupplier = Math::random; // () -> Math.random()
        System.out.println(doubleSupplier.getAsDouble());

        // line 8 can also be written as
        Supplier<Double> supplier = Math::random;
        System.out.println(supplier.get());
    }
}
