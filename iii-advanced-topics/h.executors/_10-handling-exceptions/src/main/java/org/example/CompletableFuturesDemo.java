package org.example;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturesDemo {
    public static void show() {
        // You learned how to consume the result of an asynchronous task, but what if this task throws an exception?

        var future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting the current weather...");

            // This exception is thrown on a different thread. To get this exception, we have to use the get().
            // If an exception is thrown on the thread executing our task, the get() is able to propagate that exception and bring
            // it into our main thread.
            throw new IllegalStateException();
//            return "Current weather";
        });

        // How to handle exceptions and recover by transforming an exception into a value?

        try {
            // exceptionally() allows you to handle exceptions and provide a fallback result. It is only called if an exception
            // occurred and was not handled before this point in the chain. It returns a new CompletableFuture object. A lot of
            // methods in the CompletableFuture class return a new CompletableFuture object.
            var result = future.exceptionally(_ -> "Last checked weather").get();
            System.out.println("Result from get(): " + result);
        } catch (InterruptedException | ExecutionException e) {
            // The exception that we threw in our Lambda is wrapped inside an ExecutionException.
            throw new RuntimeException(e);
        }

        // handle() is always called, regardless of whether the CompletableFuture completed normally or exceptionally.
        future
//                .handle((response, exception) -> {
//                    if (exception != null)
//                        System.out.println("Handled exception from thenAccept()");
//                    return response;
//                })
                .exceptionally(_ -> "Last checked weather")
                .thenAccept((result) -> System.out.println("Result from thenAccept(): " + result));
    }
}
