package org.example;

import java.util.ArrayList;

public class ThreadDemo {
    public static void show() {
        var threads = new ArrayList<Thread>();
        var statuses = new ArrayList<DownloadStatus>();

        for (var i = 0; i < 10; ++i) {
            /*
             * Instead of sharing a single status object across multiple threads, you're going to have each thread work with
             * its own status object.
             *
             * Go to DownloadFileTask class.
             * */
            var task = new DownloadFileTask();
            var thread = new Thread(task);
            statuses.add(task.getStatus());
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

        // combines the total bytes across the download file tasks
        var totalBytes = statuses.stream().map(DownloadStatus::getTotalBytes).reduce(0, Integer::sum);

        System.out.println(totalBytes);

        /*
         * With this, we no longer have a race condition because these threads are not modifying a shared object.
         * */
    }
}
