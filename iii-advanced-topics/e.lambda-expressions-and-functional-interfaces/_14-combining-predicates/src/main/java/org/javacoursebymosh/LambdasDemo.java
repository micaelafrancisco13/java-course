package org.javacoursebymosh;

import java.util.function.Predicate;

public class LambdasDemo {
    public static void show() {
        Predicate<String> hasLeftBrace = string -> string.startsWith("{");
        Predicate<String> hasRightBrace = string -> string.endsWith("}");

        // checks if the string has left AND right brace
        var result = hasLeftBrace.and(hasRightBrace).test("{key:value}");
        System.out.println(result);

        // checks if the string has a left OR right brace
        result = hasLeftBrace.or(hasRightBrace).test("key:value}");
        System.out.println(result);

        // checks if the string has NO left brace
        result = hasLeftBrace.negate().test("key:value}");
        System.out.println(result);
    }
}
