package org.example;

public class DownloadFileTask implements Runnable {
    private final DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file... " + Thread.currentThread().getName());

        for (var i = 0; i < 1_000_000; ++i) {
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }

        status.setDownloadFileFinished();
        /*
         * After we call the line above, we need to notify the other thread that the state of this object is changed.
         *
         * Just like the wait(), we need to wrap this line inside a synchronized block. Otherwise, the JVM is going to throw a runtime
         * exception.
         * */
        synchronized (status) {
            status.notify();
        }
        /*
         * We also have notifyAll(). This is useful if you have multiple threads waiting for a change on this object. With this, we can
         * notify them all.
         * */

        System.out.println("Download complete... " + Thread.currentThread().getName());
    }
}
