package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // Comparable is a generic interface that has a
        // single method compareTo(T o)

        // Go to User class

        // let's compare 2 user objects
        var user1 = new User(10);
        var user2 = new User(20);
        System.out.println(user1.compareTo(user2));
    }
}