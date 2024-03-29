package org.javacoursebymosh;

import java.util.function.Predicate;

public class LambdasDemo {
    public static void show() {
        // checks if the string has more than 5 characters
        Predicate<String> isLongerThan5 = string -> string.length() > 5;
        var result = isLongerThan5.test("sky");
        System.out.println(result);
    }
}
