package org.example;

public class ThreadDemo {
    public static void show() {
        // prints the name of the current thread
        System.out.println("ThreadDemo class thread name: " + Thread.currentThread().getName());

        /*
         * The constructor of this class is overloaded. The version that we use most often is the one that takes a
         * runnable object. That is an object that implements the Runnable interface. This interface represents a
         * task to be run on a thread. It's a very simple interface with a single method called "run." So it has no
         * parameters and returns void.
         *
         * var thread1 = new Thread(new DownloadFileTask());
         * */

        /*
         * When this program is run, the code for downloading a file will be executed in a separate thread.
         * thread1.start();
         * */

        System.out.println("---Loop---");

        // simulates downloading ten files concurrently
        for (int i = 0; i < 10; ++i) {
            var thread = new Thread(new DownloadFileTask());
            thread.start();
        }

        /*
         * Even though these messages are appearing sequentially on the terminal, these threads start and run-in parallel.
         * */
    }
}
