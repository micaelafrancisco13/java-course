package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // what if we want to have a list of users?
        // currently, List class is only for storing integers.
        // with this approach, we'll have to create another
        // class "UserList," which isn't efficient.

        // another approach is by using the Object data type in
        // the List class

        var list = new List();
        list.add(1);
        list.add("String");
        list.add(new User());

        // line 14 is a primitive value, how can we store it on
        // the List class?
        // when we compile this code, JVM will convert it to
        // something like this:
        list.add(Integer.valueOf(1));

        // Integer class is a reference type.
        // This is the reason why we can pass a primitive value
        // to this method.
        // By the same token, we have a wrapper class for every
        // primitive type in Java.

        // what are the problems with this implementation?
        // 1. getting of item has to be cast to its appropriate
        //    data type. this makes our code verbose.
        // 2. if we use a wrong type for casting, we'll run into
        //    ClassCastException. the problem with this is that
        //    we're not aware of bugs like this until we run our
        //    app and test all the functions. we can only identify
        //    these problems at runtime
        int number = (int) list.get(0);

        // it would be a lot better if we could catch errors like
        // these at compile-time, and that's what generics are for
    }
}