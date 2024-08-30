package org.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalBytes;
    private Lock lock = new ReentrantLock();

    public int getTotalBytes() {
        return totalBytes;
    }

    /*
     * We want to ensure that only one thread at a time can increment this field.
     * */
    public void incrementTotalBytes() {
        // Before we increment this field, we call lock.lock()
        // When a thread enters this method, it will lock this lock object.
        lock.lock();
        try {
            ++totalBytes;
        } finally {
            /*
             * Now, as a best practice, we should execute this line in a finally block because if an exception is thrown, we don't
             * want to keep this lock object locked forever. Otherwise, no other threads can execute this code, and this may cause
             * a deadlock and our application will crash.
             * */
            lock.unlock();
        }
    }
}
