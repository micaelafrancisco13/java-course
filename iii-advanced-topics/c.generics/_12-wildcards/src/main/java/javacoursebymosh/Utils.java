package javacoursebymosh;

public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second) {
        return first.compareTo(second) < 0 ? second : first;
    }

    public static <K, V> void print(K key, V value) {
        System.out.println(key + " = " + value);
    }

    // since we get a User here, we can pass an instance of the User class
    // or any of its derivatives
    public static void printUser(User user) {
        System.out.println(user);
    }

    // '?' represents an unknown type
    public static void printUsers(GenericList<? super User> users) {
        // users.get(0) returns "capture of ?"

        // when we use a wildcard, the JVM will create an anonymous type
        // under the hood. so, it's going to create a class:
        // class CaptureOne {} - regular Java class
        // if we have multiple wildcards then the classnames would be like
        // CaptureOne, CaptureTwo, and so on...

        // users.get(0) returns an instance of this CaptureOne class, and
        // that means, we can only store the result on a variable of type
        // CaptureOne or Object
        Object user1 = users.get(0);

        // how to restrict the list that we pass in this method? such that
        // we can only pass User or its subtypes
        // "GenericList<? extends User>" - our CaptureOne class will extend
        // the User class just like how the Instructor class extends the
        // User class.
        // since the CaptureOne class is a subtype of User, we can store the
        // result of get() to a User object but not to an Instructor object.
        User user2 = users.get(0);

        // what if we want to add the users argument of this method?
        // users.add() - returns "capture of ? extends User item"
        // we can pass an instance of CaptureOne or any of its subtypes to
        // the add(), unfortunately, we don't have access to CaptureOne class,
        // so we can't instantiate it.

        // with the "extends" keyword, we can only read from User's list, we
        // can't add to it. if we want to add a user to User's list, we should
        // use the "super" keyword instead of "extends" keyword.

        // when JVM sees the expression "GenericList<? super User>" it's going
        // to treat the unknown type like the User class' parent which is the
        // Object class.
        // GenericList<Object> temp = new GenericList<>();
        // JVM will treat the "users" parameter like the "temp" variable.

        // https://stackoverflow.com/questions/4343202/difference-between-super-t-and-extends-t-in-java

        // we can add an instance of User class or any of its subtype
        users.add(new User(1));
        users.add(new Instructor(2));
        User user3 = users.get(0);

        System.out.println(users);
    }
}
