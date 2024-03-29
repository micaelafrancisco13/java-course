package org.javacoursebymosh;

// say that in this class, we have the typical
// User properties

// if we omit "<User>", the generic type Object
// will be used
public class User implements Comparable<User> {
    private final int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User other) {
        return points - other.points;
    }
}
