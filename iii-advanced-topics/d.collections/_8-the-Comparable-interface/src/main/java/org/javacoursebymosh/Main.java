package org.javacoursebymosh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // how to sort data using the Comparable interface?
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("F2", "L2"));
        customers.add(new Customer("F1", "L1"));
        customers.add(new Customer("F3", "L3"));

        // The Customers class must implement the Comparable interface
        // sorts customers by their first name
        Collections.sort(customers);
        System.out.println(customers);
    }
}