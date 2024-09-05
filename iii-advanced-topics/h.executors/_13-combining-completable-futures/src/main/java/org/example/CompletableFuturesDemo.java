package org.example;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {

    public static void show() {
        /*
         * CompletableFuture can start two tasks asynchronously and then combine the results.
         *
         * For example, let's say we call a remote service, to get the price of a product, and that service returns the price in US
         * dollars. So we get twenty US dollars. Now, at the same time, in parallel, we want to call another service to get the
         * exchange rate between US dollars and Euros. So that service is going to return 0.9.
         *
         * We don't want to call the second service upon completion of the first task. We want to start this task concurrently and
         * then wait for both of them to complete to structure the result.
         *
         * */

        // with thenCombine(), we can combine the result of 2 async operations.

        /*
         * thenApply() is used in the context of CompletableFuture to process the result of a computation once it is completed. It
         * takes a function as an argument that operates on the result of the CompletableFuture, applies a transformation, and returns
         * a new result.
         * */
        var first = CompletableFuture
                .supplyAsync(() -> "20USD")
                .thenApply(price -> Integer.parseInt(price.replace("USD", "")));

        var second = CompletableFuture.supplyAsync(() -> 0.9);

        first
                .thenCombine(second, (price, exchangeRate) -> price * exchangeRate)
                .thenAccept(System.out::println);

        // All of this is happening asynchronously, so none of this code is going to block the current thread.
    }
}
