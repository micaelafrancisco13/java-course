package org.example;

import java.util.ArrayList;

public class ThreadDemo {
    public static void show() {
        /*
        * Let's say as part of downloading multiple files, we want to show the total number of bytes we have downloaded so
        * far. So we need to store the total value somewhere and have multiple threads increment it as they are downloading
        * files. This is going to cause a race condition, which means multiple threads are racing or competing to modify a
        * shared resource.
        *
        * */

        var status = new DownloadStatus();

        var threads = new ArrayList<Thread>();
        // Now, we start 10 download threads.
        for (var i = 0; i < 10; ++i) {
            // DownloadFileTask needs a DownloadStatus object.
            // We are starting ten download threads and sharing a single status object across these threads.
            // Once all these threads are complete, we should print the total number of bytes we have downloaded.
            var thread = new Thread(new DownloadFileTask(status));
            thread.start();
            threads.add(thread);
        }

        // We should start all these threads simultaneously and then join with all of them.
        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        // Prints the total number of bytes we have downloaded.
        // We expect to see one hundred thousand bytes, but that's not going to happen.
        // Go back to DownloadStatus class.
        System.out.println(status.getTotalBytes());
    }
}
