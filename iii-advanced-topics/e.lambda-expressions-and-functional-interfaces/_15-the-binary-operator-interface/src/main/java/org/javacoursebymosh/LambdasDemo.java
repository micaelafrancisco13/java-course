package org.javacoursebymosh;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;

public class LambdasDemo {
    public static void show() {
        // this is a binary operation because it has 2 operands (1 & 2)
        var sum = 1 + 2;

        // we can represent this operation using the BinaryOperator<T>
        // interface. it extends the BiFunction<T, T, T> interface

        // there are also primitive specializations of this interface
        // IntBinaryOperator, LongBinaryOperator, and so on...

        // we want to add a & b then square their sum
        BinaryOperator<Integer> add = Integer::sum;
        Function<Integer, Integer> square = a -> a * a;

        var result = add.andThen(square).apply(1, 3);
        System.out.println(result);

        // using the primitive specializations
        IntBinaryOperator summarize = Integer::sum;
        IntFunction<Integer> raiseToTwo = a -> a * a;

        var squared = raiseToTwo.apply(summarize.applyAsInt(5, 5));
        System.out.println(squared);
    }
}
