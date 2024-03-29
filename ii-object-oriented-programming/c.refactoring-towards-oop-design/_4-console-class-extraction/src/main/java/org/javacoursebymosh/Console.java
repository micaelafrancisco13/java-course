package org.javacoursebymosh;

import java.util.Scanner;

public class Console {
    // put readNumber() to a class Console
    // Refactor > Refactor This > Move Members
    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);

        double value;

        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();

            if (value >= min && value <= max)
                break;

            System.out.println("Enter a value between " + min + " and " + max);
        }

        return value;
    }
}
