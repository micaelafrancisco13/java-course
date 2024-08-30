package org.example;

public class DownloadFileTask implements Runnable {
    private final DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file... " + Thread.currentThread().getName());

        // Instead of "Integer.MAX_VALUE," we want to simulate a scenario where each file is 10,000 bytes.
        for (var i = 0; i < 10_000; ++i) {
            if (Thread.currentThread().isInterrupted()) return;
            System.out.println("Downloading bytes... " + i);
            status.incrementTotalBytes();
        }

        System.out.println("Download complete... " + Thread.currentThread().getName());
    }
}
