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

    public static void printUsers(GenericList<User> user) {
        System.out.println(user);
    }
}
