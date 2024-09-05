package org.example;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {

    public static void show() {
        // Imagine the weather service returns to temperature in Celsius, but you want to print it in Fahrenheit.

        // thenApply() maps the result to a different result.

        CompletableFuture
                .supplyAsync(() -> 20)
                .thenApply(CompletableFuturesDemo::toFahrenheit)
                .thenAccept(System.out::println);
    }

    private static double toFahrenheit(int celsius) {
        return (celsius * 1.8) + 32;
    }
}
