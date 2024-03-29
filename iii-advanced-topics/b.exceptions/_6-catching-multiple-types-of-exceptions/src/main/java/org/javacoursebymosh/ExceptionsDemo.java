package org.javacoursebymosh;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() {
        try {
            // may throw FileNotFoundException
            var reader = new FileReader("file.txt");

            // may throw an IOException
            var value = reader.read();

            // may throw a ParseException
            new SimpleDateFormat().parse("");
        }
        // each catch-block targets a specific type of exception
        // only one of these will be executed
//        catch (FileNotFoundException ex) {
//            System.out.println("File does not exist");
//        }
//        catch (IOException ex) {
//            System.out.println("Could not read data");
//        }

        // if line 13 throws an exception, the control will move
        // to its catch block (second catch block is ignored)

        // we can combine multiple catch clauses using a "|"
        catch (IOException | ParseException e) {
            System.out.println("Could not read data.");
        }

        // java.io.IOException
        //     java.io.FileNotFoundException

        // sometimes, the order of the catch blocks matters.
        // if IOException is the first catch block, we don't need
        // the FileNotFoundException anymore since it has already
        // been scoped by the IOException.
        // IOException can catch any exception class that extends
        // it
    }
}
