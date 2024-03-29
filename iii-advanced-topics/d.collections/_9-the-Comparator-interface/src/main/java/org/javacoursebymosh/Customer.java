package org.javacoursebymosh;

public class Customer implements Comparable<Customer> {
    private final String firstName;
    private final String lastName;
    private final String email;

    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // compareTo() method's implementation isn't very flexible
    // because it always compares customers by their first name.
    // what if we want to sort customers by their email?
    // the Comparator interface solves this issue.
    // we can create a class called "EmailComparator"
    @Override
    public int compareTo(Customer other) {
        // if current < other -> -1
        // if current > other -> 1
        // if current == other -> 0

        return firstName.compareTo(other.firstName);
    }

    @Override
    public String toString() {
        return "email = " + email;
    }

    public String getEmail() {
        return email;
    }
}
