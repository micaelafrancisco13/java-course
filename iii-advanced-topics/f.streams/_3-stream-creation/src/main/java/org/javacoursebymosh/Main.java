package org.javacoursebymosh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // every class that implements the Collection interface can
        // return a stream.

        // we have different ways to create a stream:
        // a) from a collection
        System.out.println("from a collection");
        var list = new ArrayList<>();
        list.add("ela");
        list.add("kerwin");
        list.add("maeve");
        list.forEach(System.out::println);

        // b) from arrays
        // - arrays don't have the stream() method, but in the Arrays
        //   class, we have a static stream() method.
        System.out.println("from arrays");
        int[] numbers = {1, 2, 3, 4, 5};
        Arrays.stream(numbers)
                .forEach(System.out::println);

        // c) from an arbitrary number of objects
        System.out.println("from an arbitrary number of objects");
        Stream.of(1, 2, 3, 4, 5, 6, 7)
                .forEach(System.out::println);

        // d) generate infinite streams
        // generates infinite stream of random numbers.
        // this is something we can't do in a collection because if we
        // want to store an infinite object in it, we're going to run
        // out of memory.
        // but with stream, the Math.random() is only going to be called if
        // and only if we read a number from the stream, it's not generated
        // ahead of time. this is what we call "lazy evaluation."
        System.out.println("generate infinite streams");
        Stream.generate(Math::random)
                .limit(10) // only prints 10 random numbers
                .forEach(System.out::println);

        // e) generate finite streams
        // - we start with 1, and every time we generate a value, we
        // increment by 1 on the previous value
        System.out.println("generate finite streams");
        Stream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(System.out::println);
    }
}