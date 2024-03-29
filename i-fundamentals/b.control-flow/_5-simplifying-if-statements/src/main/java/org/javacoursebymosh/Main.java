package org.javacoursebymosh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your income: ");
        int income = input.nextInt();

        /*
        boolean hasHighIncome = false;
        if (income > 100_000)
            hasHighIncome = true;
        else
            hasHighIncome = false;
         */

        // line 13 to 17 can be written this way:
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);
    }
}