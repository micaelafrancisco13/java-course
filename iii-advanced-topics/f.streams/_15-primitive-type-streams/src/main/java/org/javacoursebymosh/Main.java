package org.javacoursebymosh;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // if you want to work with primitive values, it's more efficient
        // to use the specialized types:
        // IntStream, LongStream, and DoubleStream

        // generates numbers from 1 to 5
        IntStream.rangeClosed(1, 5)
                .forEach(System.out::println);

        System.out.println("---------------");

        // generates numbers from 1 to 4
        IntStream.range(1, 5)
                .forEach(System.out::println);
    }
}