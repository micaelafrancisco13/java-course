package org.javacoursebymosh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrates how to sort a list of custom objects using the {@code Comparable} interface.
 */
public class Main {

    /**
     * The main entry point for the application.
     *
     * <h2>Sorting with {@code Comparable} and {@code Collections.sort()}</h2>
     * <p>The {@code Collections.sort(List<T> list)} method provides an easy way to sort a list.
     * For this method to work on a list of custom objects, the object's class must
     * implement the {@code Comparable<T>} interface.</p>
     *
     * <p>Implementing the {@code compareTo} method in the class defines its
     * <strong>natural ordering</strong>. The {@code Collections.sort()} method then uses this
     * natural ordering to sort the elements in place.</p>
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("F2", "L2"));
        customers.add(new Customer("F1", "L1"));
        customers.add(new Customer("F3", "L3"));

        // This sorts the list based on the natural order defined in Customer.compareTo().
        Collections.sort(customers);

        // Display sorted list
        System.out.println(customers);
    }
}
