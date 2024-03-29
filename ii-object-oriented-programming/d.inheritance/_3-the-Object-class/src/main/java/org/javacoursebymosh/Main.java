package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // every class that we declare inherits from the Object
        // class

        var box1 = new TextBox();
        var box2 = box1;
        var box3 = new TextBox();

        // returns a class' metadata in an object
        System.out.println(box1.getClass());

        // returns the name of the class
        System.out.println(box1.getClass().getName());

        // returns "true" because both the variables are
        // referencing the same object in memory or have the
        // same hash code
        System.out.println(box1.equals(box2));

        // returns "false"
        System.out.println(box1.equals(box3));

        // returns an integer based on the address of this object
        // in memory
        System.out.println(box1.hashCode());
        System.out.println(box2.hashCode());

        // returns the string representation of the object
        // has 2 parts:
        // 1. fully-qualified name of the class
        // 2. hash code represented as hexadecimal
        System.out.println(box1);
    }
}