package javacoursebymosh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 3.1));
        List<Double> doubles = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3));

        printNumberList(numbers);
        addNumberList(numbers);

        printDoubleList(doubles);
        addDoubleList(doubles);
    }

    private static void printNumberList(List<? extends Number> numbers) {
        // The type of "item" is of Number.
        // It cannot be an Integer because it could be a Double and vice versa.
        // Needs explicit casting.
        var item = numbers.getFirst();
        System.out.println(item);
        Number num = 13;

        // You can't add any object to List<? extends T> because you can't guarantee
        // what kind of List it is really pointing to, so you can't guarantee that the
        // object is allowed in that List. The only guarantee is that you can only read
        // from it, and you'll get a T or subclass of T.
        // numbers.add(1);
    }

    private static void addNumberList(List<? super Number> numbers) {
        // The type of "item" is of Object and its subclass, but JVM doesn't know the
        // subclass, so it cannot be Double or Number.
        var item = numbers.getFirst();
//        Number item2 = numbers.getFirst();

        // You can add a Number or its subtypes.
        Object object = 1;
        Number num1 = 2;
        double num2 = 1.3;
        int num3 = 13;

        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
    }

    private static void printDoubleList(List<? extends Double> doubles) {
        var item = doubles.getFirst();
        Object object = doubles.getFirst();

        // doubles.add(1.2);
    }

    private static void addDoubleList(List<? super Double> doubles) {
        var item = doubles.getFirst();
        doubles.add(1.1);
    }
}