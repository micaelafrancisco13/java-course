package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // 1. the consumer interface
        // - it represents an operation that takes a single argument
        //   and returns no result

        // a lot of methods in Java expect an object that implements
        // the Consumer interface

        // has a single abstract method
        // void accept(T t);

        // variations of this interface
        // 1. BiConsumer
        // void accept(T t, U u);

        // 2. IntConsumer, DoubleConsumer, etc...
        // void accept(int value);
        // - it's more efficient to use this interface if you're
        //   dealing with numerical values because you don't pay
        //   the cause of autoboxing

        // how to use this interface?
        // go to LambdasDemo
        LambdasDemo.show();
    }
}