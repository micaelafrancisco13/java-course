package org.javacoursebymosh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value from 1 to 3: ");
        int value = input.nextInt();

        switch (value) {
            case 1: {
                System.out.println("You entered number 1");
                // curly braces can be removed
            }
            break;
            case 2: {
                System.out.println("You entered number 2");
            }
            break;
            case 3: {
                System.out.println("You entered number 3");
            }
            break;
            default: {
                System.out.println("You entered an out-of-range number!");
            }
        }
    }
}