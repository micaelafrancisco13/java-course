package org.javacoursebymosh;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 3 rows and 2 columns
        int[][] arrayInt = {
                { 2, 4 },
                { 1, 3 },
                { 0, -1 }
        };
        // assignment initialization:
        // arrayInt[0][0] = 2;  arrayInt[0][1] = 4;
        // arrayInt[1][0] = 1;  arrayInt[1][1] = 3;
        // arrayInt[2][0] = 0;  arrayInt[2][1] = -1;

        // to print a multi-dimensional array:
        System.out.println(Arrays.deepToString(arrayInt));
    }
}