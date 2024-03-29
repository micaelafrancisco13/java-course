package org.javacoursebymosh;

public class ExceptionsDemo {
    public static void show() {
        // JVM knows that the constructor of FileReader will
        // throw an exception if the file doesn't exist.
        // "FileNotFoundException" is an example of a checked
        // exception
        // var reader = new FileReader("file.txt");

        // we shouldn't have passed null here
        // an example of unchecked exception
        sayHello(null);
    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
