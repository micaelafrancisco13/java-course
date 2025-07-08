package org.javacoursebymosh;

import java.util.function.Predicate;

public class LambdasDemo {
    public static void show() {
        /*
         * STEP 1: Define a Predicate to test a condition on a String
         * ----------------------------------------------------------
         * - This lambda expression takes a String and checks whether its length is greater than 5.
         * - The lambda implements Predicate<String>'s test() method.
         * - Equivalent to writing:
         *      Predicate<String> isLongerThan5 = new Predicate<String>() {
         *          public boolean test(String string) {
         *              return string.length() > 5;
         *          }
         *      };
         */
        Predicate<String> isLongerThan5 = string -> string.length() > 5;

        /*
         * STEP 2: Apply the Predicate using the test() method
         * ---------------------------------------------------
         * - Here, we apply the predicate to the string "sky"
         * - Since "sky" has only 3 characters, the result will be false.
         */
        var result = isLongerThan5.test("sky");

        /*
         * STEP 3: Output the result to the console
         * -----------------------------------------
         * - This will print 'false' to the console, because "sky" is not longer than 5 characters.
         */
        System.out.println(result);
    }
}
