package org.example;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturesDemo {
    public static void show() {
        /*
         * This CompletableFuture class has a couple of asynchronous methods that we use for creating a CompletableFuture object.
         *
         * runAsync() does not return a value and is overloaded. If you don't pass an executor, this method is going to run our task
         * on a common pool.
         *
         * ForkJoinPool.commonPool() returns the pool used by the CompletableFuture class. So if you don't supply a pool, this is the
         * pool that is going to be used under the hood. This pool is well aware of the number of available threads.
         *
         * The common pool is based on the number of available threads. Now, if this doesn't fit your application, you can always create
         * a custom pool with fewer or more threads.
         * */
        System.out.println(Runtime.getRuntime().availableProcessors()); // prints 8

        // The "future1" variable is of type CompletableFuture<Void> because our async task is not returning a value.
        // Now, with this single line of code, we can execute the task in an asynchronous fashion. We didn't have to create an executor
        // and then submit a task to it and then shut it down.
        var future1 = CompletableFuture.runAsync(() -> System.out.println("A runnable object"));

        /*
         * supplyAsync() returns a value. We can pass a Supplier as its argument.
         * The "future2" variable is of type CompletableFuture<Integer>.
         * */
        var future2 = CompletableFuture.supplyAsync(() -> 13);

        try {
            System.out.println(future2.get()); // A blocking or synchronous method.
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
