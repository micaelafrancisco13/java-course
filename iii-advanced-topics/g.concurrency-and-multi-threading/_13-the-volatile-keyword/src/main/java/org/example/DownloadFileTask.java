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

        System.out.println("Download complete... " + Thread.currentThread().getName());
    }
}
