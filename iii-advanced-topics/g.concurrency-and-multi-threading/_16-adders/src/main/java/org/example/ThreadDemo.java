package org.example;

import java.util.ArrayList;

public class ThreadDemo {
    public static void show() {
        // Go to DownloadStatus class.

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
