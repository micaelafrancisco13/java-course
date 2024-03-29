package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        String msg1 = "I really love the \'RED\' album!";
        String msg2 = "c: \\Windows\\";
        String msg3 = "New\nline";
        String msg4 = "Tabbed\tstring";

        // prints "I really love the 'RED' album!"
        System.out.println(msg1);

        // prints "c: \Windows\"
        System.out.println(msg2);

        // prints
        // "New
        //  line"
        System.out.println(msg3);

        // prints "Tabbed	string"
        System.out.println(msg4);
    }
}