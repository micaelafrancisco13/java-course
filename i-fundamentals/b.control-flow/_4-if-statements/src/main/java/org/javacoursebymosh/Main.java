package org.javacoursebymosh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        byte temperature = input.nextByte();

        if (temperature > 30) {
            System.out.println("It is a hot day");
            System.out.println("Drink plenty of water");
        } else if ((temperature > 20) && (temperature <= 30))
            System.out.println("It is a nice day");
        else
            System.out.println("It is so fucking cold");
    }
}