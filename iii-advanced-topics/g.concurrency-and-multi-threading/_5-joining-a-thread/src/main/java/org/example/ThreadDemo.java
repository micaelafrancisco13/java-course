package org.example;

public class ThreadDemo {
    public static void show() {
        System.out.println("ThreadDemo class thread name: " + Thread.currentThread().getName());

        var thread = new Thread(new DownloadFileTask());
        thread.start();

        /*
         * Let's say once we download the file, we want to kick off another thread to scan the downloaded file for viruses.
         * Now, scanning a file is a time-consuming task. It's not going to happen immediately, unlike incrementing an integer.
         * It may take a few seconds. So we should run it in a separate thread, but we should do that only after we have downloaded
         * a file.
         * */

        // How can we know if the download thread has finished?

        /*
         * This will make the current thread that is the main thread that is executing this code wait for the completion of the
         * download thread. So this call is going to block the current thread until the download thread has finished.
         * */
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("File is ready to be scanned...");

        /*
         * With the join method, we tell the current thread to wait for the completion of another thread and that means, while this
         * thread is waiting, it cannot do other things. For example, in the case of a desktop or a mobile app, this main thread is
         * responsible for handling UI events like mouse clicks and keystrokes. So if you make the main thread wait for another thread,
         * it cannot respond to these UI events while it's waiting. So the UI will freeze and the user will not be able to resize or
         * move the application window.
         * */
    }
}
