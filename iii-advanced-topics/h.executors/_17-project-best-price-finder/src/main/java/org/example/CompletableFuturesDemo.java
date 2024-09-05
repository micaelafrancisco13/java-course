package org.example;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {
    public static void show() {
        int[] prices = {100, 105, 108};
        var futures = new ArrayList<CompletableFuture<Quote>>();
        for (int i = 0; i < 3; ++i) {
            var count = i + 1;
            var quote = new Quote(("site" + count), prices[i]);
            futures.add(CompletableFuture
                    .supplyAsync(() -> {
//                        var randomNumber = new Random().nextInt(3) + 1;
//                        if (count == randomNumber) {
//                            LongTask.simulate();
//                        }
                        System.out.println("Getting a quote from site" + count);
                        return quote;
                    }));
        }

        for (var future : futures)
            future.thenAccept(System.out::println);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
