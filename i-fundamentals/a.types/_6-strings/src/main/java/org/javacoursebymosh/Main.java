package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // original initialization of a string:
        String string = new String("Naruto");
        // strings are reference types
        // strings are immutable

        String string1 = "Naruto Uzumaki has yellow hair.";
        String string2 = "Sasuke Uchiha has onyx eyes.";
        String string3 = "Taylor";
        String string4 = "Demi";
        String string5 = "     I have added whitespaces here.     ";
        System.out.println("string1: " + string1);
        System.out.println("string2: " + string2);
        System.out.println("string3: " + string3);
        System.out.println("string4: " + string4);
        System.out.println("string5: " + string5);
        System.out.println(' ');

        // prints the calling string's length (whitespaces, characters)
        System.out.println("string1.length(): " + string1.length()); // prints string1's length

        // prints a Boolean value if the calling string is the same as the specified argument
        // alternative of == operator for strings
        System.out.println("string3.equals(string4): " + string3.equals(string4)); // prints false
        System.out.println("string4.equalsIgnoreCase(\"demi\"): " + string4.equalsIgnoreCase("demi")); // prints true

        // converts the calling string into a specified case
        System.out.println("string1.toLowerCase(): " + string1.toLowerCase()); // converts all letters to lower case
        System.out.println("string2.toUpperCase(): " + string2.toUpperCase()); // converts all letters to lower case

        // gets rid of the calling string's leading and trailing whitespaces
        System.out.println("string5.trim(): " + string5.trim());  // prints "I have added whitespaces here"

        // prints the calling string's character at a specified position
        System.out.println("string3.charAt(0): " + string3.charAt(0)); // prints the character at position 0
        // compile-error if the specified position is out-of-bound
        // EXCEPTION THROWN: System.out.println(string4.charAt(10));

        // starts printing the calling string at a specified position
        System.out.println("string2.substring(7): " + string2.substring(7)); // starts printing at position 7
        // starts printing at position 0 and ends printing at position 13
        System.out.println("string1.substring(0, 14): " + string1.substring(0, 14));
        // compile-error if the specified position is out-of-bound
        // EXCEPTION THROWN: System.out.println(string3.substring(20));

        // prints the index of the specified argument's first occurrence in the calling string
        // PRINTS -1 if the specified argument does not exist
        System.out.println("string3.indexOf(\"y\"): " + string3.indexOf('y')); // prints the position of first 'y', 2
        System.out.println("string2.indexOf('a', 2): " + string2.indexOf('a', 2)); // starts searching at position 2
        System.out.println("string3.indexOf('X'): " + string3.indexOf('X')); // prints -1

        // prints the index of the specified argument's last occurrence in the calling string
        // PRINTS -1 if the specified argument does not exist
        System.out.println("string1.lastIndexOf('i'): " + string1.lastIndexOf('i')); // prints the position of the last 'i', 28

        // prints a negative number when the calling string comes first in lexical order, otherwise, it prints a positive number
        // prints 0 when the calling string is equivalent to the specified argument
        System.out.println("string4.compareTo(string3): " + string4.compareTo(string3)); // prints a positive number
        System.out.println("string3.compareTo(string3): " + string3.compareTo(string3)); // prints 0
        System.out.println("string4.compareToIgnoreCase(\"DEMI\"): " + string4.compareToIgnoreCase("DEMI")); // prints 0

        // replaces the calling string with the specified argument
        System.out.println("string3.replace(\"Taylor\", \"Taylor Swift\"): " + string3.replace("Taylor", "Taylor Swift")); // prints Taylor Swift
        // PRINTS THE CALLING STRING if and only if the specified target char/string is not present
        System.out.println("string4.replace(\"Z\", \"z\"): " + string4.replace("Z", "z"));

        // prints a Boolean value if the calling string starts/ends with the specified argument
        System.out.println("string1.endsWith(\"!\"): " + string1.endsWith("!")); // prints false
        System.out.println("string2.startsWith(\"S\"): " + string2.startsWith("S")); // prints true

        // prints a Boolean value if the calling string starts/ends with the specified argument at a specified starting position
        System.out.println("string2.startsWith(\"onyx\", 18): " + string2.startsWith("onyx eyes", 18)); // prints true
        System.out.println("string2.startsWith(\"eyes\", 7): " + string2.startsWith("eyes", 7)); // prints false
        System.out.println("string2.startsWith(\"eyes\", 50): " + string2.startsWith("eyes", 50)); // prints false
    }
}