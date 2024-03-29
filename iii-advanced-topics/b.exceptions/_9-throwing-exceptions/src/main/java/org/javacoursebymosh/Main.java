package org.javacoursebymosh;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // How to throw an exception?
        var account = new Account();

        // this will result to an unchecked exception
        // indicates a programming error (we shouldn't have
        // passed -1)
        // shouldn't be handled using try-catch block, rather, we
        // should fix the source of the problem (by passing a
        // value > 0)
        try {
            account.deposit(-1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}