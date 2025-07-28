package org.javacoursebymosh;

/**
 * A customer class that implements the {@code Comparable} interface to define a
 * natural sort order based on the customer's first name.
 */
public class Customer implements Comparable<Customer> {
    private final String firstName;
    private final String lastName;

    /**
     * Constructs a {@code Customer} object with the specified first and last names.
     *
     * @param firstName The customer's first name.
     * @param lastName The customer's last name.
     */
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Compares this customer to another customer for ordering.
     *
     * <p>This implementation defines the "natural ordering" of customers to be
     * alphabetical by their first name. It delegates the comparison logic to the
     * {@code String.compareTo()} method.</p>
     *
     * @param other The other {@code Customer} object to compare against.
     * @return a negative integer if this customer's name comes before the other,
     *         zero if they are the same, or a positive integer if it comes after.
     */
    @Override
    public int compareTo(Customer other) {
        return this.firstName.compareTo(other.firstName);
    }

    /**
     * Returns a string representation of the customer, showing only the first name.
     *
     * @return A string in the format {@code firstName=F1}.
     */
    @Override
    public String toString() {
        return "firstName=" + firstName;
    }
}
