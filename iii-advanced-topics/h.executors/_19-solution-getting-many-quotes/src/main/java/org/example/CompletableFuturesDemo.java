package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class CompletableFuturesDemo {
    public static void show() {
        var sites = new ArrayList<>(Arrays.asList("site1", "site2", "site3"));
        var service = new FlightService();
        service
                .getQuotesAsync(sites)
                .map(quoteFuture -> quoteFuture.thenAccept(System.out::println))
                .toList();

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
