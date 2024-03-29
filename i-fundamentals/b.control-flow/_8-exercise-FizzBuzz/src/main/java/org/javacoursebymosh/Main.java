package org.javacoursebymosh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // divisible by 5 - Fizz
        // divisible by 3 - Buzz
        // divisible by both 5 & 3 - FizzBuzz
        // divisible by neither 5 & 3 - print the number

        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else System.out.println(number);
    }
}