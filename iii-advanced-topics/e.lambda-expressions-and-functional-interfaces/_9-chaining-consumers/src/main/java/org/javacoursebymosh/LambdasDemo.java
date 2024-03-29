package org.javacoursebymosh;

import java.util.List;
import java.util.function.Consumer;

public class LambdasDemo {
    private static void printNormally(String string) {
        System.out.println(string);
    }

    private static void printToUpperCase(String string) {
        System.out.println(string.toUpperCase());
    }

    public static void show() {
        List<String> list = List.of("a", "b", "c");

        // the lambda expression below should match the
        // signature of the Consumer interface's
        // void accept(T t)
        Consumer<String> print = LambdasDemo::printNormally;
        Consumer<String> printUpperCase = LambdasDemo::printToUpperCase;

        // we want to iterate through the list, and for each item, we
        // want to execute the 2 operations above in sequence
        list.forEach(print.andThen(printUpperCase).andThen(print));

        // see andThen()'s declaration for more info
    }
}
