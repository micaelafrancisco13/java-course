package org.javacoursebymosh;

public class Customer implements Comparable<Customer> {
    private final String firstName;
    private final String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Customer other) {
        // if current < other -> -1
        // if current > other -> 1
        // if current == other -> 0

        // remember that comparison operators '>' and '<' can only be
        // applied to characters and numbers
        return firstName.compareTo(other.firstName);
    }

    @Override
    public String toString() {
        return "firstName = " + firstName;
    }
}
