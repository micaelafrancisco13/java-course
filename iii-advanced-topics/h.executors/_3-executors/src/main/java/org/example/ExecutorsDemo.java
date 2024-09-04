package org.example;

import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void show() {
        /*
         * In Java, the concept of a thread pool is represented using the ExecutorService interface and its implementations.
         *
         * Implementing classes of ExecutorService interface:
         * a) ThreadPoolExecutor - This is the one that we use most of the time.
         *
         * b) ScheduledThreadPoolExecutor - With this, we can schedule tasks to run after a delay or periodically. For example,
         * we can schedule a task to run five hours from now or every two hours.
         *
         * c) ForkJointPool - This is a special type of pool that is designed to recursively split the task into smaller tasks
         * and then combine the results of each subtask to produce the overall result. It's like a divide and conquer algorithm.
         *
         * */

        /*
         * This Executors class has a bunch of static factory methods for creating an executor service. So with these methods, we
         * can create an instance of these implementations. Now, why shouldn't we create a new instance of thread pool executor
         * directly? We can definitely do that, but it's a little bit challenging.
         *
         * Type "Executors."
         *
         * Take a look. This constructor has a bunch of parameters like CorePoolSize, MaximumPoolSize, KeepAliveTime and so on. So
         * creating an executor explicitly is a little bit challenging. That is why we use the factory methods on the executor's
         * class.
         *
         * */

        /*
         * At compile-time, the variable "executor" is of type ExecutorService interface. At runtime, the type of this object is going
         * to be ThreadPoolExecutor.
         *
         * */
        try (var executor = Executors.newFixedThreadPool(2)) {

            /*
             * submit() is overloaded. We can pass a Runnable object or a Callable (a task that returns the results) object.
             * */
            executor.submit(() -> {
                // This Runnable object that we passed to submit() was executed on this thread.
                System.out.println("Thread.currentThread().getName() " + Thread.currentThread().getName());

                // We don't have to explicitly create a thread to execute a Runnable object.
            });

            /*
             * Now, if you have a thousand tasks, we don't have to worry about creating too many threads and running out of memory. We simply
             * submit those tasks to this executor, to this thread pool, and this pool will assign our tasks to worker threads.
             * */
            for (var i = 0; i < 9; ++i) {
                var counter = i + 1;
                executor.submit(() -> {
                    System.out.println(counter + (" out of 9 tasks submitted."));
                    System.out.println("Thread name: " + Thread.currentThread().getName());
                });
                // Some tasks are being executed on pool-1-thread-2, other tasks are being executed on pool-1-thread-1.
                // So internally, this executor maintains a queue. Every task that we submit goes in this queue and waits for an available
                // thread.
            }

            /*
             * When we start executing and submit a task, the executor thinks there might be more tasks coming in the future. So it's not
             * going to terminate. It's going to stay in the memory waiting for new tasks. So we have to explicitly shut down an executor
             * to terminate our program.
             *
             * shutDown() doesn't stop the current tasks, so it will wait for the completion of those tasks, but it's not going to accept
             * any new tasks.
             *
             * shutDownNow() will force the existing tasks to stop.
             * */
            executor.shutdown();
        }
        /*
         * But you have to remember; even when using the executor framework, we still have to worry about the concurrency problems. So if
         * two tasks modify an object concurrently, we're going to run into issues. So the executor framework does not protect us from the
         * concurrency problems we talked about in the last section. It just simplifies thread-manipulation.
         *
         * */
    }
}
