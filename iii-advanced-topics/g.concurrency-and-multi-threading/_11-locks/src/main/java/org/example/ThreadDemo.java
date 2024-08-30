package org.example;

import java.util.ArrayList;

public class ThreadDemo {
    public static void show() {
        /*
        * Another strategy for preventing race conditions and visibility problems is to prevent multiple threads from accessing
        * an object at the same time. This is called "synchronization." So, we have to synchronize or coordinate multiple threads
        * trying to access an object. We do that using locks.
        *
        * We put a lock on a block of our code, and the JVM will ensure that only one thread at a time can execute that block of code,
        * which is called the "critical section." Our code is also going to get executed sequentially. So we lose concurrency.
        *
        * Go back to DownloadStatus class.
         *
        * */

        var status = new DownloadStatus();
        var threads = new ArrayList<Thread>();

        for (var i = 0; i < 10; ++i) {
            var thread = new Thread(new DownloadFileTask(status));
            thread.start();
            threads.add(thread);
        }

        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(status.getTotalBytes());
    }
}
