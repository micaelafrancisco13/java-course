package org.javacoursebymosh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a value from 5 to 10: ");
            int value = input.nextByte();

            if (value >= 5 && value <= 10) {
                System.out.println("You have entered the number " + value);
                break;
            }
        }
    }
}