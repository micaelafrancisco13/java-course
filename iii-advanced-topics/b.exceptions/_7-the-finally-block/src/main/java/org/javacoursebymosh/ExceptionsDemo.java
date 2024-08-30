package org.javacoursebymosh;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {
        FileReader reader = null;
        try {
            // the problem with "reader" is that we opened a
            // file for reading, but nowhere in this code we've
            // closed it
            // these are OS resources, so we should release them
            reader = new FileReader("file.txt");
            var value = reader.read();

            // the problem with reader.close() is somewhere before
            // this line of code, an exception might be thrown,
            // resulting to this line of code not executed
            // reader.close();

            // the correct way to handle this case is by using the
            // block 'finally'
        } catch (IOException ex) {
            System.out.println("Could not read data");
        }
        // in this block, we can release resources such as file handlers,
        // database connections, network resources, and so on.
        // the finally blocks always get executed whether we have an
        // exception or not
        finally {
            // before we can access an object, we should always initialize
            // it
            // the close() may throw an IOException
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
