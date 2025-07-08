package org.javacoursebymosh;

import java.util.function.Function;

public class LambdasDemo {
    public static void show() {
        // --- Problem Statement ---
        // Imagine we are working with strings in the format: "key:value"
        // Our goal is to transform this string in two steps:
        //
        // 1. Replace the colon (:) with an equals sign (=), so:
        //      "key:value" → "key=value"
        //
        // 2. Wrap the result in curly braces, so:
        //      "key=value" → "{key=value}"
        //
        // Final output: "{key=value}"

        // --- Step 1: Define transformation functions ---

        // Function 1: Replace ":" with "="
        // - Takes a string input and returns a modified string
        // - Matches Function<String, String>'s apply(T t) method signature
        Function<String, String> replaceColon = string -> string.replace(":", "=");

        // Function 2: Wrap the string in curly braces
        // - Adds "{" at the beginning and "}" at the end
        Function<String, String> addBraces = string -> '{' + string + '}';

        // --- Step 2: Compose the transformations ---

        // There are two ways to combine functions in Java:
        // 1. Using andThen()
        // 2. Using compose()

        // --- Method 1: andThen() ---
        // - Syntax: f1.andThen(f2).apply(value)
        // - Meaning: first apply f1, then apply f2 on the result
        // - Order of execution: left to right
        //
        // Here, it means:
        // 1. replaceColon is applied first → "key:value" → "key=value"
        // 2. addBraces is applied next     → "key=value" → "{key=value}"
        //
        // Final result: "{key=value}"
        var result = replaceColon
                .andThen(addBraces)
                .apply("key:value");

        // --- Method 2: compose() ---
        // - Syntax: f2.compose(f1).apply(value)
        // - Meaning: first apply f1, then apply f2 on the result
        // - Order of execution: right to left (i.e., like f2(f1(x)))
        //
        // This is logically equivalent to andThen(), just written differently
        //
        // Here, it means:
        // 1. replaceColon is applied first → "ela:13" → "ela=13"
        // 2. addBraces is applied next     → "ela=13" → "{ela=13}"
        //
        // Final result: "{ela=13}"
        result = addBraces
                .compose(replaceColon)
                .apply("ela:13");

        // --- Step 3: Print the result ---
        System.out.println(result); // Output: {ela=13}

        // --- Summary ---
        // Function<T, R> is a functional interface that represents a function taking one input of type T
        // and producing a result of type R.
        //
        // - You can combine functions using:
        //   - andThen(): f1.andThen(f2) → applies f1 first, then f2
        //   - compose(): f2.compose(f1) → also applies f1 first, then f2
        //
        // - Both approaches are useful for building data transformation pipelines.
        // - Choosing between them is mostly a matter of readability and preference.
    }
}

