package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        byte age = 19;
        long viewsCount = 3_000_000_000L; // add L for JVM
        float price = 13.99F; // add F for JVM
        char letter = 'M';
        boolean isEligible = false;

        System.out.println(age);
        System.out.println(viewsCount);
        System.out.println(price);
        System.out.println(letter);
        System.out.println(isEligible);

        // byte     -   1 byte      [-128, 127]
        // short    -   2 bytes     [-32k, 32k]
        // int      -   4 bytes     [-2b, 2b]
        // long     -   8 bytes     [-2b, 2b]

        // storing numbers that have a decimal point
        // float    -   4 bytes
        // double   -   8 bytes

        // storing a single character
        // char     -   2 bytes     A, B, C,...

        // storing a true or false value
        // boolean  -  1 byte       true/false
    }
}