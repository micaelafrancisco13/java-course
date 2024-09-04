package org.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void show() {
        try (var executor = Executors.newFixedThreadPool(2)) {
            var future = executor.submit(() -> {
                LongTask.simulate();
                System.out.println("Thread name async: " + Thread.currentThread().getName());
                return 1;
            });

            System.out.println("Do more work...");

            try {
                System.out.println("Thread name: " + Thread.currentThread().getName());

                /*
                 * In the last video, I told you that this get method is a blocking method. When we call it, the current thread has to
                 * wait until the result of this task is ready. So even though you're executing this task in a separate thread, we're
                 * making the current thread wait for the completion of that thread. We are not using our threads properly. We are
                 * wasting our threads.
                 *
                 * So to get the most out of our threads, we should write code in a non-blocking way, and that is what we call
                 * asynchronous programming.
                 *
                 * We don't want to make our main thread or another thread, wait for the completion of another thread as much as possible.
                 * So we want to orchestrate our tasks such that when a task completes, another task can get executed asynchronously. In
                 * 2014, Java gave us a new tool for implementing this kind of applications, asynchronous applications. We're going to
                 * look at that next.
                 *
                 * */
                var result = future.get();

                System.out.println("Result " + result);
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
