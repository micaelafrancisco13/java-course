package org.javacoursebymosh;

import java.util.function.Function;

public class LambdasDemo {
    public static void show() {
        // takes a string and returns an integer
        Function<String, Integer> map = String::length;
        var result = map.apply("step on no pets");
        System.out.println(result);
    }
}
