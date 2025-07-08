package org.javacoursebymosh;

import java.util.function.Predicate;

public class LambdasDemo {
    public static void show() {

        /*
         * STEP 1: Create Predicate to check if a string starts with a left brace '{'
         * ----------------------------------------------------------------------------
         * - This Predicate returns true if the string starts with '{'
         * - Uses the String.startsWith() method
         */
        Predicate<String> hasLeftBrace = string -> string.startsWith("{");

        /*
         * STEP 2: Create Predicate to check if a string ends with a right brace '}'
         * ----------------------------------------------------------------------------
         * - This Predicate returns true if the string ends with '}'
         * - Uses the String.endsWith() method
         */
        Predicate<String> hasRightBrace = string -> string.endsWith("}");

        /*
         * STEP 3: Combine Predicates using AND
         * -------------------------------------
         * - hasLeftBrace.and(hasRightBrace) creates a new predicate that checks both conditions:
         *     1. The string starts with '{'
         *     2. The string ends with '}'
         * - Only returns true if BOTH predicates return true.
         */
        var result = hasLeftBrace
                .and(hasRightBrace)
                .test("{key:value}");
        // Expected output: true, since the string starts with '{' and ends with '}'
        System.out.println(result);  // true

        /*
         * STEP 4: Combine Predicates using OR
         * ------------------------------------
         * - hasLeftBrace.or(hasRightBrace) creates a new predicate that checks:
         *     1. If the string starts with '{' OR
         *     2. If the string ends with '}'
         * - Returns true if at least one condition is true.
         */
        result = hasLeftBrace
                .or(hasRightBrace)
                .test("key:value}");
        // Expected output: true, since the string ends with '}'
        System.out.println(result);  // true

        /*
         * STEP 5: Use negate() to reverse the logic
         * ------------------------------------------
         * - hasLeftBrace.negate() creates a new predicate that returns the opposite of hasLeftBrace.
         * - It returns true if the string does NOT start with '{'
         */
        result = hasLeftBrace
                .negate()
                .test("key:value}");
        // Expected output: true, since the string does NOT start with '{'
        System.out.println(result);  // true
    }
}
