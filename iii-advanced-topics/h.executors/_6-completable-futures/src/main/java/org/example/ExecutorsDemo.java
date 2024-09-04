package org.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void show() {
        /*
         * Throughout the rest of this section, we're going to talk about a very important type called CompletableFuture. This class
         * implements the Future interface. So every CompletableFuture is a Future object. Now, the reason this is called CompletableFuture
         * is that with this, we can explicitly complete a Future object. This is not something that we can do with the Future interface.
         *
         * This class also implements another interface called CompletionStage. If you look at the documentation, it says that this
         * interface represents a stage of a possibly asynchronous operation. What does this mean? Well, in the real world, quite often an
         * asynchronous operation involves many steps. For example, we may call a remote API to get some data. That is one step. Then
         * perhaps we want to transform that data into a different structure. That's another step. And finally, we want to write that data
         * into a database. That's another step. This CompletionStage interface represents a step or a stage of an asynchronous operation,
         * and it gives us a bunch of methods for combining and composing the steps in a declarative way. Kinda like how we use the streams
         * API to build a complex query declaratively.
         *
         * */

        try (var executor = Executors.newFixedThreadPool(2)) {
            var future = executor.submit(() -> {
                LongTask.simulate();
                System.out.println("Thread name async: " + Thread.currentThread().getName());
                return 1;
            });

            System.out.println("Do more work...");

            try {
                System.out.println("Thread name: " + Thread.currentThread().getName());
                var result = future.get();
                System.out.println("Result " + result);
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
