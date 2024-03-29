package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        int sum = 10 + 3;
        int difference = 20 - 5;
        int product = 13 * 7;
        int quotient = 200 / 10;
        double remainder = 18.0 / 4.0;

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);

        int x = 12;

        // x++: x = 12 then x += 1 which is 13
        System.out.println("x++ is " + (x++));

        // ++x: x += 1 which is 14 then x = 14
        System.out.println("++x is " + (++x));

        int a = 1;
        int b = a++; // a++ -> a = 1

        int c = 1;
        int d = ++c;

        // prints "a is 2"
        System.out.println("a is " + a);

        // prints "b is 1"
        System.out.println("b is " + b);

        System.out.println("d is " + d);

        // the augmented assignment operator
//        a +=2; // same as "a = a + 2"
    }
}