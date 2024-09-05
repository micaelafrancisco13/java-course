package org.example;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturesDemo {

    public static void show() {
        /*
         * Sometime, we need to wait for the completion of many tasks before doing something else.
         * */
        var first = CompletableFuture.supplyAsync(() -> 1);
        var second = CompletableFuture.supplyAsync(() -> 2);
        var third = CompletableFuture.supplyAsync(() -> 3);

        /*
         * This will return a new CompletableFuture that will complete when all of these CompletableFutures complete.
         * The type of "all" is CompletableFuture<Void>. Why is it void? Because each completable future may return a different data type.
         *
         * allOf() accepts any number of arguments.
         * */
        var all = CompletableFuture.allOf(first, second, third);
        all.thenRun(() -> {
            /*
             * What if you want to get the result of each of these completable future objects?
             *
             * In this case, get() is not going to block the current thread because this task is going to get executed asynchronously when
             * all these tasks are complete. So at this point, when we call get() on any of this completable futures, we get the result
             * immediately because the result is ready.
             * */
            try {
                var firstResult = first.get();
                System.out.println(firstResult);
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
