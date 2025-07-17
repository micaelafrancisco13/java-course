package org.javacoursebymosh;

/**
 * A user class that implements the {@code Comparable} interface to allow sorting
 * and comparison based on points.
 *
 * <p>By implementing {@code Comparable<User>}, we provide a type-safe way to compare
 * {@code User} objects. If the generic type {@code <User>} were omitted, it would
 * default to {@code Comparable<Object>}, requiring an explicit cast inside the
 * {@code compareTo} method.
 */
public class User implements Comparable<User> {
    private final int points;

    /**
     * Constructs a new User with a given number of points.
     *
     * @param points The points assigned to this user.
     */
    public User(int points) {
        this.points = points;
    }

    /**
     * Compares this user to another user based on their points.
     *
     * @param other The other {@code User} object to compare against.
     * @return A negative integer, zero, or a positive integer as this user's points
     *         are less than, equal to, or greater than the other user's points.
     */
    @Override
    public int compareTo(User other) {
        // A simple and common way to implement comparison for numeric fields.
        return this.points - other.points;
    }
}
