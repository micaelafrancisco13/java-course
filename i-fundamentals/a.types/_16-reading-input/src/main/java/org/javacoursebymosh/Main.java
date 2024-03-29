package org.javacoursebymosh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // inside "new Scanner()," we need to specify where
        // we're going to get the input from (e.g., from
        // the terminal window, a file)

        // System.in - get input from the terminal window
        // System.out - print something on the terminal window
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        // reads a byte input
        byte age = scanner.nextByte();

        System.out.print("Enter your first name: ");
        // reads a string
        String firstName = scanner.nextLine().trim();

        // input string words are called "tokens"
        // next() reads only 1 token/word
        // nextLine() reads all the tokens/words

        // implicit casting
        // Java will automatically convert "age" to a string,
        // so it can be concatenated
        System.out.println("Your first name is " + firstName);
        System.out.println("Your age is " + age);
    }
}