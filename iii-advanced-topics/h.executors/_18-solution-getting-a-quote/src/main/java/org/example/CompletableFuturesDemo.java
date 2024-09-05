package org.example;

public class CompletableFuturesDemo {
    public static void show() {
        var service = new FlightService();
        service
                .getQuoteAsync("site1")
                .thenAccept(System.out::println);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
