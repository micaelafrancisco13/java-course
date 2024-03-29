package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {

        // use the custom List class
        var list = new List();
        list.add(1);

        // what if we want to have a list of users?
        // currently, List class is only for storing integers.
        // with this approach, we'll have to create another
        // class "UserList," which isn't efficient.
    }
}