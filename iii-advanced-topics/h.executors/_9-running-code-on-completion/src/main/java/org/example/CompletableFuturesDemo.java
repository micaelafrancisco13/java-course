package org.example;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {
    public static void show() {
        // Quite often, we need to execute some code when an asynchronous operation completes. For example, you may want to display
        // the result or store it in the database.
        var future = CompletableFuture.supplyAsync(() -> 13);

        // thenRun() is one of the methods that are provided by the CompletionStage interface. A lot of those methods start with "then."
        // That means, when this task is finished, then do something else.
        future.thenRun(() -> System.out.println("Done"));

        // The lambda below is going to be submitted to the underlying executor and execute it asynchronously. It's going to be executed
        // on another thread.
        future.thenRunAsync(() -> System.out.println("Done async"));

        // thenAccept() has a Consumer type parameter.
        future.thenAccept((result) -> System.out.println("Result from thenAccept: " + result));

        // thenAcceptAsync() will submit a task to be executed asynchronously. The task is going to be executed on another thread.
        future.thenAcceptAsync((result) -> {
            // We don't see the result because our main thread finished earlier than this other thread. We need to put a delay in our
            // main thread to see the result.
            System.out.println("Thread name: " + Thread.currentThread().getName());
            System.out.println("Result " + result);
        });

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
