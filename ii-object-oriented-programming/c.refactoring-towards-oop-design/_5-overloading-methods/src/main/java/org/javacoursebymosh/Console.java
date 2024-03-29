package org.javacoursebymosh;

import java.util.Scanner;

public class Console {
    private static final Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt, double min, double max) {
        // Scanner scanner = new Scanner(System.in);
        double value;

        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;

            System.out.println("Enter a value between " + min + " and " + max + ".");
        }

        return value;
    }

    // what if we want to ask a question, but we don't want to
    // enforce a valid range of values?

    // note that we have 2 lines of the scanner object, this is
    // an opportunity for us to refactor this (line 4)
    public static double readNumber(String prompt) {
        // Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
