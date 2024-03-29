package org.javacoursebymosh;

import java.util.List;

public class LambdasDemo {
    public static void show() {
        List<Integer> list = List.of(1, 2, 3);

        // there are various ways to iterate through this list

        // 1. using imperative programming
        //  - implementing logic using instructions
        for (var item : list)
            System.out.println(item);

        // 2. using declarative programming
        //  - instead of using instructions to specify how something
        //    should be done, we specify what needs to be done
        // forEach() expects a Consumer<? super Integer>

        // since this interface only has a single abstract method,
        // we can represent this a lambda expression

        list.forEach(item -> System.out.println(item));

        // remember that lambda expressions and anonymous inner classes
        // are the implementations of a single abstract method from an
        // interface
    }
}
