package org.example;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {
    public static void show() {
        var sites = new ArrayList<>(Arrays.asList("site1", "site2", "site3"));
        var service = new FlightService();
        var quoteFutures = service
                .getQuotesAsync(sites)
                .map(quoteFuture -> quoteFuture.thenAccept(System.out::println))
                .toList();

        var start = LocalTime.now();

        // Wait for all the quoteFutures to be completed.
        CompletableFuture.allOf(quoteFutures.toArray(new CompletableFuture[0]))
                .thenRun(() -> {
                    var end = LocalTime.now();
                    var duration = Duration.between(start, end);
                    System.out.println("Retrieved all quotes in " + duration.toSeconds() + " seconds.");
                });

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
