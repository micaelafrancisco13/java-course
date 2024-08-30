package org.javacoursebymosh;

public class Main {
    public static void main(String[] args) {
        // for-each loops are used to iterate over arrays
        // or collections

        String[] fruits = {"mango", "lychee", "grape"};

        System.out.println("For loop:");
        for (int i = 0; i < fruits.length; ++i)
            System.out.println(fruits[i]);

        // for-each loop
        // cannot iterate from the end
        // cannot access the index
        System.out.println("For-each loop:");
        for (String element : fruits)
            System.out.println(element);
    }
}