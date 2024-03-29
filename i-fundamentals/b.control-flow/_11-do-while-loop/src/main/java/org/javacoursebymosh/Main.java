package org.javacoursebymosh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // NOTE: do-while loops are rarely used,
        // to avoid bugs, use a while-loop instead

        Scanner input = new Scanner(System.in);
        int limitCount = 3;
        int counter = 0;

        System.out.println("Welcome to the administrator's account!");
        System.out.println("To access the profile, please fill-out the following: ");

        System.out.print("Enter your username: ");
        String username = input.next();

        System.out.print("Enter your password: ");
        String password = input.next();
        if((password.equals("ela13")))
            System.out.println("Access granted.");

        else {
            do {
                System.out.print("Incorrect password! ");
                System.out.print("Try again: ");
                password = input.next();
                ++counter;
            } while (!(password.equals("ela13")) && (counter != limitCount));

            if ((counter == limitCount) && (!(password.equals("ela13"))))
                System.out.println("Access denied.");
            else
                System.out.println("Access granted.");
        }
    }
}