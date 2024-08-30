package org.example;

public class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Downloading a file... " + Thread.currentThread().getName());

        // pauses the execution of a thread for 5 seconds
        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // after 5 seconds, this will be printed
        System.out.println("Download complete... " + Thread.currentThread().getName());
    }
}
