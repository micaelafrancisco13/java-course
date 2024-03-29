package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // 4. the predicate interface
        // - it represents an operation that takes an object and
        //   checks to see if that object satisfies some criteria
        // - used in filtering data
        // - has an abstract method boolean test(T t);

        // - has specializations
        // the BiPredicate<T, U> interface
        // - has an abstract method boolean test(T t, U u);

        // - has primitive specializations
        // the IntPredicate interface takes a primitive integer and
        // returns a boolean
        // DoublePredicate, LongPredicate, and so on...

        LambdasDemo.show();
    }
}