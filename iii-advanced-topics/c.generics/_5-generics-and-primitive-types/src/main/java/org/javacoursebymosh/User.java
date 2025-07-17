package org.javacoursebymosh;

/**
 * A simple model class representing a user.
 * <p>
 * This class is used as an example object to store in a collection.
 */
public class User {
    // User properties would be defined here.
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}