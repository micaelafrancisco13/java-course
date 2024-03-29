package org.javacoursebymosh;

import java.io.IOException;

public class Account {
    // may throw an IOException
    // "throws IOException"
    // back to the Main class, that is where we wrap our code
    // using the try-catch block
    public void deposit(float value) throws IOException {
        // this is called "defensive programming"
        // only perform this validation whenever you receive
        // input from the user or external system (at the boundary
        // of the app
        // if (value <= 0) throw new IllegalArgumentException();

        // if you throw a checked exception, it's always paired
        // with an exception handler

        // what if we want to throw a checked exception? use the
        // IOException.
        // have the caller of this method handle the IOException.
        // just like the FileReader class, it throws an exception.
        // that we have to explicitly handle.
        if (value <= 0) throw new IOException();
    }
}
