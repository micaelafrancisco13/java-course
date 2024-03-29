package org.javacoursebymosh;

public class ExceptionsDemo {
    public static void show() {
        var account = new Account();

        try {
            account.withdraw(100_000);
        } catch (AccountException e) {
            // returns a throwable
            // if you want to get the cause of the exception
            var cause = e.getCause();
            System.out.println(cause.getMessage());
        }
    }
}
