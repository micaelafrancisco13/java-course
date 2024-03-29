package org.javacoursebymosh;

import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        try {
            ExceptionsDemo.show();
        } catch (IOException e) {
            System.out.println("An unexpected error occurred");
        }
    }
}