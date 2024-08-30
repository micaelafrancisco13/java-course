package org.example;

public class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Downloading a file... " + Thread.currentThread().getName());

        // pauses the execution of a thread for 5 seconds

//        try {
//            Thread.sleep(5_000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        /*
        * Instead of pausing this thread to simulate a long-running task, let's add a for loop that continuously prints a
        * message on the terminal.
        *
        * With this, we can easily verify if our download actually gets canceled.
        *
        * */

        for (var i = 0; i < Integer.MAX_VALUE; ++i) {
            /*
            * Here, we should continuously check for an interrupt request. If we get that request, then we'll have to stop
            * the download process, otherwise, we're going to download the byte.
            *
            * Now, if a thread is sleeping, and we send an interrupt request to it, it throws an exception. That is why you
            * have to handle this interrupted exception when pausing a thread.
            * */
            if (Thread.currentThread().isInterrupted()) return;
            System.out.println("Downloading bytes... " + i);
        }

        // after 5 seconds, this will be printed
        System.out.println("Download complete... " + Thread.currentThread().getName());
    }
}
