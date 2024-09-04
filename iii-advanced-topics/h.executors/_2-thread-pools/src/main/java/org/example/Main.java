package org.example;

public class Main {
    public static void main(String[] args) {
        /*
         * Threads are the fundamental building blocks of concurrent applications, but working directly with threads has a
         * couple of problems.
         *
         * The first problem is that we have a limited number of threads available to us. So if you're
         * not careful, you may end up creating too many threads and get out of memory exceptions. So our application will
         * crash.
         *
         * The other issue is that creating and destroying threads is costly. If you have a thousand tasks to execute, like
         * a thousand images to download, and only ten threads available, we have to download ten images using these threads.
         * Then, once these threads are complete, we have to create another set of ten threads, and we have to repeat this
         * several times to execute all our tasks.
         *
         * Creating and destroying threads is expensive. So Java 5 came up with a solution called a thread pool. A thread pool
         * is essentially a pool of threads called worker threads, and this thread can be reused to execute several tasks. When
         * a worker thread finishes, it is returned to the pool, so it can be reused to execute another task. So these threads
         * are not destroyed and recreated. They're always available and are reused to execute many tasks.
         *
         * Also, because the thread pool has a fixed number of threads, we don't have to worry about creating too many threads
         * and running out of memory. For example, we can create a thread pool with ten threads and submit a thousand tasks to it.
         * The thread pool would take care of assigning our tasks to these threads. If all threads are busy, the new tasks will
         * wait in a queue. As soon as a thread becomes available, it will pick up a task from the queue and execute it. So with
         * this model, we don't have to think about creating threads directly. Instead, we submit our tasks to a thread pool and
         * let the thread pool take care of thread manipulation.
         * */
    }
}