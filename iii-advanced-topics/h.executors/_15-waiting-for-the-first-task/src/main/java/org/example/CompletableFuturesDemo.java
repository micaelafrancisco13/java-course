package org.example;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {

    public static void show() {
        /*
         * Let's say there are two ways to get the current weather in a given city. Perhaps we have two different remote services, but
         * sometimes, one of the services responds a little bit slower. We want to call these services concurrently, and as soon as we
         * get a response, we're going to display it to the user.
         * */

        var first = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 20;
        });

        var second = CompletableFuture.supplyAsync(() -> 13);

        /*
         * anyOf() returns a new CompletableFuture that will complete as soon as one of these CompletableFutures that we pass here
         * completes.
         *
         * The "fastest" variable is of type CompletableFuture<Object>.
         * */
        var fastest = CompletableFuture.anyOf(first, second);

        fastest.thenAccept(System.out::println);
    }
}
