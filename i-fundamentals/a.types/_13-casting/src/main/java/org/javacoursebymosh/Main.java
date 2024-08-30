package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        short x = 1;

        // we're adding a short to an integer
        int y = x + 2;

        // x is implicitly converted/cast from short
        // data type into integer data type.
        // e.g. byte to short, short to int, int to long

        // a data type must be converted to another data type
        // based on more precise data type
        // e.g. whole numbers to float or double
        double a = 1.1;

        // explicit conversion is based on less precise data type
        // e.g. double to int
        int b = (int) a + 2;

        // note that casting is for compatible data types.

        // String to an integer
        String number = "13";
        System.out.println(Byte.parseByte(number));
//        Integer.parseInt(number);
    }
}