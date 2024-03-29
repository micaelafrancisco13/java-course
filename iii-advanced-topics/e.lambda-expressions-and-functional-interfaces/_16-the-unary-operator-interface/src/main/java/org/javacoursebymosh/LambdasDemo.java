package org.javacoursebymosh;

import java.util.function.IntUnaryOperator;

public class LambdasDemo {
    public static void show() {
        // this operation is unary because it has 1 operand
        var squared = Math.sqrt(2);

        // the UnaryOperator<T> extends the Function<T, T> interface

        IntUnaryOperator square = operand -> operand * operand;
        IntUnaryOperator increment = operand -> ++operand;

        var result = increment.andThen(square).applyAsInt(3);
        System.out.println(result);
    }
}
