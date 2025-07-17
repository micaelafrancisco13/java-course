package org.javacoursebymosh;

/**
 * A user class that implements the {@code Comparable} interface to allow sorting
 * and comparison based on points.
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
        return this.points - other.points;
    }

    /**
     * Returns a string representation of the user object.
     *
     * @return A string containing the user's points.
     */
    @Override
    public String toString() {
        return "User with " + points + " points";
    }
}
