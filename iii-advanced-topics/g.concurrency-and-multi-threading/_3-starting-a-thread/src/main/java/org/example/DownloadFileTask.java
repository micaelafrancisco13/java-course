package org.example;

public class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        /*
        * So we have two threads. One is the main thread that executed our main method, and here's another thread that
        * we explicitly created for downloading a file. Each thread starts, executes a task, and then dies. So we don't
        * have to explicitly kill it.
        * */

        // prints the name of the current thread
        System.out.println("DownloadFileTask class thread name: " + Thread.currentThread().getName());


        System.out.println("Downloading a file...");
    }
}
