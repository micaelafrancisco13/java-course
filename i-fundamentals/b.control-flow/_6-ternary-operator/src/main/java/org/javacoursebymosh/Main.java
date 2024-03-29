package org.javacoursebymosh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your income: ");
        int income = input.nextInt();

        /*
        if (income > 100_000)
            System.out.println("First");
        else
            System.out.println("Economy");
        */

        // line 13 to 16 can be written this way using the ternary
        // operator
        String classLevel = (income > 100_00) ? "First" : "Economy";
        System.out.println(classLevel);
    }
}