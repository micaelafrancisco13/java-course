package javacoursebymosh;

/**
 * A base class representing a user, implementing {@code Comparable} to allow
 * comparison based on points.
 */
public class User implements Comparable<User> {
    private final int points;

    /**
     * Constructs a new {@code User} with a given number of points.
     *
     * @param points The number of points assigned to this user.
     */
    public User(int points) {
        this.points = points;
    }

    /**
     * Compares this user to another based on their points.
     *
     * @param other The other {@code User} to compare against.
     * @return A negative integer, zero, or a positive integer as this user's points
     *         are less than, equal to, or greater than the other user's points.
     */
    @Override
    public int compareTo(User other) {
        return this.points - other.points;
    }

    /**
     * Returns a string representation of the user.
     *
     * @return A string showing the user's point total.
     */
    @Override
    public String toString() {
        return "User with " + points + " points";
    }
}
