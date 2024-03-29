package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        var point1 = new Point(3, 4);
        var point2 = new Point(1, 2);

        System.out.println(point1.equals(point2));
        System.out.println(point2.equals(point1));
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());

        // the following compare their hash codes
        // 1. point1 == point2
        // 2. point1.equals(point2)
        // 3. point1.hashCode() == point2.hashCode()

        // how to compare point1 and point2 based on their
        // coordinates? go to Point class
    }
}