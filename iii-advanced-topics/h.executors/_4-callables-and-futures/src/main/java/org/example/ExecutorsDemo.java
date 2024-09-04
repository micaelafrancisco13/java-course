package org.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void show() {
        /*
         * Callable is an interface, very similar to the runnable interface, but this interface represents a task that returns a value.
         * It has a single abstract method called "call" and returns a generic type value.
         *
         * */
        try (var executor = Executors.newFixedThreadPool(2)) {
            // The "future" variable is of type Future<Integer>.
            var future = executor.submit(() -> {
                // This lambda represents a Callable object.
                // Let's say we're going to call the Twitter API to get the latest tweets for a user. Now, eventually, this task is going
                // to return a value, in this case, 1.
                LongTask.simulate();
                System.out.println("Thread name async: " + Thread.currentThread().getName());
                return 1;
            });
            /*
            * This Future is an interface that represents the future result of an operation, an operation that will complete in the future.
            * It may complete in five hundred milliseconds or two seconds or five seconds, sometime in the future. So the result of this
            * operation is not going to be calculated immediately using the CPU. So with this Future object, we can get the future result
            * of an operation.
            *
            * When we call this submit method, the submit method is going to return immediately. So it's not going to wait for three
            * seconds. It's going to immediately return a future object. With this future object, we can get the result of this operation.
            *
            * */

            System.out.println("Do more work...");

            /*
            * Now, this method is going to block the current thread and have it wait until the result of this operation is ready.
            * Eventually, it's going to return a value. In this case, it's going to return an integer because our task returns an integer.
            * */
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
