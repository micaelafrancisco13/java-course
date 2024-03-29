package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // inside <>, we can only use reference types as
        // the generic type argument.

        // every primitive type in Java has a wrapper class.
        // int -> Integer
        // double -> Double
        // float -> Float
        // and so on...
        // 1 -> Integer.valueOf(1) - this is called boxing
        // Integer.getInteger() -> int - this is called unboxing

        var list = new GenericList<User>();
        GenericList<User> userList = new GenericList<>();
        list.add(new User());

        var user = list.get(0);

        // lines 14 & 15 are identical
    }
}