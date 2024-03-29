package org.javacoursebymosh;

public interface Printer {
    // in one implementation, we might want to print to a terminal,
    // in another implementation, we might want to talk to an actual
    // printer

    // this is a single abstract method
    void print(String message);
}
