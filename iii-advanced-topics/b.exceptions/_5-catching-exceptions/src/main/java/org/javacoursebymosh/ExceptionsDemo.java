package org.javacoursebymosh;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {
    public static void show() {
        // to handle the exception, we should wrap line 14
        // inside a try block
        try {
            // when a line throws an exception, the control
            // moves to the catch block
            // lines after the offending lines aren't executed
            var reader = new FileReader("file.txt");
            System.out.println("File opened");
        } catch (FileNotFoundException ex) {
            // "ex" is an instance of "FileNotFoundException"
            // it contains info about this exception
            System.out.println(ex.getMessage());

            // we can also print/log the stack trace
            ex.printStackTrace();
        }
    }
}
