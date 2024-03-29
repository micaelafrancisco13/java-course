package org.javacoursebymosh;

import java.util.function.Function;

public class LambdasDemo {
    public static void show() {
        // let's say we have a string in this format:
        // key:value

        // and we want to first convert it to:
        // key=value

        // and then convert it to:
        // {key=value}

        Function<String, String> replaceColon = string -> string.replace(":", "=");
        Function<String, String> addBraces = string -> '{' + string + '}';

        // there are 2 ways to compose functions:
        var result = replaceColon.andThen(addBraces).apply("key:value");

        // another way
        // it chains functions in the reverse order
        result = addBraces.compose(replaceColon).apply("ela:13");

        System.out.println(result);
    }
}
