package org.javacoursebymosh;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // let's take a break from Java and let's talk about
        // one of the essential data structures in computer
        // science.

        List<Customer> customers = new ArrayList<>();
        // let's say we have to find a customer with a given email

        // we can do it like this:
        for (var customer : customers)
            if (customer.getEmail().equals("e1"))
                System.out.println("Customer with the email e1 is present");

        // the algorithm above isn't scalable, because the more items
        // we have in this list, the longer this loop is going to take.
        // we're going to need more comparisons.

        // time complexity
        // O(n)
        // - big O notation, where n is the number of items in our list

        // worst case scenario
        // O(10)
        // - where 10 is the 10th and last element in the list
        // - we need 10 comparisons

        // the cost of the for-each algorithm above increases linearly and in
        // direct proportion with the list's size.

        // how a hash table stores items differs from how a list or an array
        // stores items.
        // no matter how many items we have in a hash table, we can find it
        // by only using 1 comparison.
        // represented by O(1).

        // In Java, we have hash maps
        // In C# and Python, we have dictionaries
        // In JavaScript, we have objects
    }
}