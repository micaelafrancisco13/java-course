package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // 1. the consumer interface
        // - it represents an operation that takes a single argument
        //   and returns no result
        // - has a default method andThen(Consumer<? super T> after)
        // - with this method, we can chain consumers which basically
        //   means we can run many operations in sequence

        LambdasDemo.show();
    }
}