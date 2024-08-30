package org.example;

public class ThreadDemo {
    public static void show() {
        System.out.println("ThreadDemo class thread name: " + Thread.currentThread().getName());

        /*
         * Quite often when dealing with long-lived tasks, we want to allow our users to cancel. So here we are starting a
         * download task. I want to cancel this after one second.
         * */

        var thread = new Thread(new DownloadFileTask());
        thread.start();

        // First, we go back to our download file task.

        // Next, let's cancel the "thread.start()" after 3 seconds.
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        /*
         * So we're starting a separate thread to download a file and then have the current thread that is the main thread that
         * is executing this code wait for 3 seconds.
         * */

        // cancels the download thread
        thread.interrupt();

        /*
         * "interrupt()" doesn't force a thread to stop what it's doing. It simply sends an interrupt request. To support interruption,
         * we should constantly check for the interrupted request and act accordingly.
         *
         * Go back to DownloadFileTask class.
         * */
    }
}
