package org.javacoursebymosh;

// we are importing the Date class from the java.util package
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        primitive types:
//      - numbers, characters, booleans
//      - memories are allocated and released by the Java
//        runtime environment

//        reference types:
//      - date, mail messages
//      - "new" allocates memory for a new Date object
//      - we should always allocate memory, releasing of the
//      - memory is taken care by the Java runtime env

        Date today = new Date();
//        "today" is an instance of the Date class
//        today. -> shows the members defined in this object
        System.out.println(today);
    }
}