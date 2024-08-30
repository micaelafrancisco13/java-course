package org.javacoursebymosh;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // arrays have a fixed length

        // "numbers" has 5 elements in it
        int[] numbers = new int[5];

        int[] arrayInt = {3, 1, 4, 5, 2};
        // assignment initialization
        // arrayInt[0] = 3;
        // arrayInt[1] = 1;
        // arrayInt[2] = 4;
        // arrayInt[3] = 5;
        // arrayInt[4] = 2;
        // array[5] = 13; // exception thrown

        // prints "[I@6acbcfc0" - this is calculated
        // based on the address of this object in
        // memory
        System.out.println(arrayInt);

        // prints array's size
        System.out.println(arrayInt.length);

        // to print an array:
        System.out.println("Original array is: " + Arrays.toString(arrayInt));

        // to sort the array in ascending order:
        Arrays.sort(arrayInt);
        System.out.println("Sorted array is now: " + Arrays.toString(arrayInt));
    }
}