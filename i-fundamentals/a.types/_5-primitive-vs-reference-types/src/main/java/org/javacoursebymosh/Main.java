package org.javacoursebymosh;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // primitive type
        int x = 2;
        int y = x;

        System.out.println("y = " + y); // prints 2
        y = 3;
        System.out.println("y = " + y); // prints 3
        System.out.println("x = " + x); // prints 2 (x is still 2, NOT affected)

        // reference type
        Point point1 = new Point(13, 17);
        Point point2 = point1;

        System.out.println(point2); // prints [x = 13, y = 17]
        point2.x = 9;
        System.out.println(point1); // prints [x = 9, y = 17]
        // note that x IS affected
    }
}