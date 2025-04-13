package org.javacoursebymosh;

import java.util.Comparator;

public class EmailComparator implements Comparator<Customer> {
    // String.compareTo(String anotherString)
    // Returns:
    // A negative number if o1.getEmail() comes before o2.getEmail() lexicographically.
    // 0 if they're equal.
    // A positive number if o1.getEmail() comes after o2.getEmail().
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getEmail().compareTo(o2.getEmail());
    }
}
