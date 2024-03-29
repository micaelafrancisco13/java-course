package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // general rounding
        System.out.println(Math.round(13.1313)); // prints 13

        // always rounds up
        System.out.println(Math.ceil(13.1111)); // prints 14.0

        // always rounds down
        System.out.println(Math.floor(13.9999)); // prints 13.0

        // returns the larger number
        System.out.println(Math.max(13, 17)); // prints 17

        // returns the smaller number
        System.out.println(Math.min(13, 17)); // prints 13

        // returns a random value between 0 and 1
        // result changes each time the program is run
        System.out.println(Math.random());

        // returns a random value between 0 and 100
        System.out.println((Math.random() * 100));

        // if you want a whole number as a result:
        System.out.println(Math.round(Math.random() * 100));
    }
}