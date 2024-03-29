package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // we can declare a generic method inside a non-generic
        // class.
        // create Utils class

        var result1 = Utils.max(1, 2);
        System.out.println(result1);
        var result2 = Utils.max(new User(10), new User(20));
        System.out.println(result2);
    }
}