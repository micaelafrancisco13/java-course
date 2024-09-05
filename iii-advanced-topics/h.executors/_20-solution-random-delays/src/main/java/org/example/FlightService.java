package org.example;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class FlightService {
    public Stream<CompletableFuture<Quote>> getQuotesAsync(List<String> sites) {
        // For each site, we should get a Quote.

        return sites.stream().map(this::getQuoteAsync);
    }

    private CompletableFuture<Quote> getQuoteAsync(String site) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting a quote from " + site);

            var random = new Random();

            // The delay is around 1 to 3 seconds.
            LongTask.simulate(random.nextInt(2_000) + 1_000);

            // The price is around 100 to 110 USD.
            var price = random.nextInt(10) + 100;

            return new Quote(site, price);
        });
    }
}
