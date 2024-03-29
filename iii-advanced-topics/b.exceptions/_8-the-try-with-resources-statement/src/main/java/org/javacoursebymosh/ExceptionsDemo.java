package org.javacoursebymosh;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {
        // in Java, we can declare & initialize our external
        // resources as part of the "try" statement.
        // this is what we call a "try-with-resources" statement.
        // it's a "try" statement that has one or more resources.
        // we don't need the "finally" block to close the
        // resources because JVM will do that for us.
        // reader.close() is unnecessary as it's already handled
        // by the "try" statement.
        // close() comes from AutoCloseable interface implemented
        // by the FileReader class
        try (
                var reader = new FileReader("file.txt");
                var writer = new FileWriter("file2.txt");
        ) {
            var value = reader.read();
        }
        catch (IOException ex) {
            System.out.println("Could not read data");
        }
    }
}
