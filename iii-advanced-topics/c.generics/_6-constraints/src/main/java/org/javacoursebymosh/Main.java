package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // go to GenericList
        // we can only pass the Number class or any of
        // its derivatives
        // <Number>
        // <Integer>
        // and so on...
        var list = new GenericList<Short>();

        // we can also extend interfaces
        // go to GenericListComparable

        // if we want to pass User to
        // new GenericListComparable<>(),
        // we must implement the Comparable interface on
        // the User class
    }
}