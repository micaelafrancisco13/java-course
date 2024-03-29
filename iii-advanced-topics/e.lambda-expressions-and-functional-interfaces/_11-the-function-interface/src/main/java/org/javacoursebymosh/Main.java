package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // 3. the function interface
        // - it represents a function that can map a value to a
        //   different value
        // - has an abstract method R apply();

        // BiFunction interface takes 2 arguments and returns a
        // result

        // we also have 3 primitive specializations categories
        // a. the IntFunction<R> interface
        // - arguments have a specific type but the return value
        //   is parameterized
        // - has a default method R apply(int value);
        // - LongFunction, DoubleFunction, and so on...

        // b. the ToIntFunction<T> interface
        // - the argument is parameterized
        // - has a default method int applyAsInt(T value);
        // - ToLongFunction, ToDoubleFunction, and so on...

        // c. the IntToLongFunction interface
        // - both the argument and the return type have specific
        //   type
        // - has a default method long applyAsLong(int value);

        LambdasDemo.show();
    }
}