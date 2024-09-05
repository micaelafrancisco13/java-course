package org.example;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class FlightService {
    public CompletableFuture<Quote> getQuoteAsync(String site) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting a quote from " + site);

            LongTask.simulate();

            // The price is around 100 to 110 USD.
            var price = new Random().nextInt(10) + 100;

            return new Quote(site, price);
        });
    }
}
