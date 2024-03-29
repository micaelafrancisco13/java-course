package org.javacoursebymosh;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // the following are interfaces with inheritance applied:
        //          Iterable
        //         Collection
        //      List   Queue   Set

        // the Map interface is part of the Collections framework
        // but isn't part of the hierarchy above.
        // it's neither a collection nor iterable.

        // with a map, you're mapping a key to a value.
        // the key could be a customer's email, and the value could
        // be the customer itself.

        var customer1 = new Customer("F1", "L1", "e1");
        var customer2 = new Customer("F2", "L2", "e2");
        var customer3 = new Customer("F3", "L3", "e3");

        // stores the customers in a hash map
        Map<String, Customer> map = new HashMap<>();
        map.put(customer1.getEmail(), customer1);
        map.put(customer2.getEmail(), customer2);
        map.put(customer3.getEmail(), customer3);

        // let's say we want to find a customer by their email
        // returns null if the customer isn't found
        var customerFound = map.get("e2");
        System.out.println(customerFound);

        var unknown = new Customer("unknown", "customer", "");

        // if a customer with the email of "e10" isn't found, the unknown customer
        // is returned.
        var defaultCustomer = map.getOrDefault("e10", unknown);
        System.out.println(defaultCustomer);

        // checks if there exists a customer with the email of "e10"
        System.out.println(map.containsKey("e1"));
        System.out.println(map.containsKey("e10"));

        // replaces a customer with the email of "e1"
        // this method is mutable
        map.replace("e1", new Customer("F1 Updated", "L1 updated", "e1"));
        System.out.println(map);

        // how to iterate through a map object?

        // keySet() returns list of keys in the map
        for (var key : map.keySet()) System.out.println(key);

        // entrySet() returns the key-value pair in the map
        // key=value
        // where value is the toString()'s implementation
        for (var entry : map.entrySet()) {
            System.out.println(entry);

            // entry.getKey() returns the key
            // entry.getValue() returns the value
        }

        // map.values() returns a collection of customers which is the value
        // on the key-value pair
        for (var customer : map.values()) System.out.println(customer);

        // the order in which the map returns the customers isn't
        // guaranteed
    }
}