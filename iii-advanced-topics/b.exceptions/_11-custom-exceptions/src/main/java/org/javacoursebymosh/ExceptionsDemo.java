package org.javacoursebymosh;

public class ExceptionsDemo {
    public static void show() {
        var account = new Account();

        // catch the exception that withdraw() threw
        try {
            account.withdraw(100_000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
