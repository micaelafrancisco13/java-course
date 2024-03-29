package org.javacoursebymosh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // how to sort data using the Comparable interface?
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("F2", "L2", "email2"));
        customers.add(new Customer("F1", "L1", "email1"));
        customers.add(new Customer("F3", "L3", "email3"));

        // The Customers class must implement the Comparable interface
        // sort() has 2 overloads, the other one takes a comparator
        Collections.sort(customers, new EmailComparator());
        System.out.println(customers);
    }
}