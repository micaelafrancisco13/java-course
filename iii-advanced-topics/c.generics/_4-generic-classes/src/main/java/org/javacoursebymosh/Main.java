package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // type of object we want to store in this list
        // <User>
        // <String>
        // <Integer>
        // and so on...
        var list = new GenericList<User>();
        list.add(new User());

        // first benefit of using generics:
        // if the argument passed is anything but User, we
        // get compile-time error
        // list.add(1);
        // list.add("Not a user object");

        // second benefit of using generics:
        // we don't need an explicit cast because we're not
        // using the Object as type parameter
        var user = list.get(0);

        // we want the List class to be generic
        // create a new class called GenericList
    }
}