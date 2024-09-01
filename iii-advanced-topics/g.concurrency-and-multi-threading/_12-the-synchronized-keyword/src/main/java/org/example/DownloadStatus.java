package org.example;

public class DownloadStatus {
    /*
     * In larger applications with more concurrency requirements, you should use dedicated monitor objects.
     * Why new Object()? It's just a common convention. Technically, we could use any type here, but it's more
     * conventional to use the Object class because we are not looking for any specific behaviors.
     * */
    private final Object totalBytesLock = new Object();
    private final Object totalFilesLock = new Object();
    private int totalBytes;
    private int totalFiles;

    public int getTotalBytes() {
        return totalBytes;
    }

    /*
     * We want to make sure that only one thread at a time can execute this piece of code.
     * synchronized(monitor)
     * To do that, we wrap this inside a synchronized block like this. Now, here in parentheses, we should pass an object.
     * This is what we call a monitor object.
     *
     * Java is going to get the built-in lock from that monitor object and use it under the hood.
     *
     * Why is passing "this" as a monitor object a bad practice?
     * With this implementation, if one thread is calling the incrementTotalFiles(), another thread cannot call the
     * incrementTotalBytes() because both these methods are using the same monitor objects. So only one thread at a time can
     * call into a synchronous method of a particular object.
     *
     * ChatGPT:
     * When a thread enters a synchronized method, it acquires the lock for the object on which the method is being called.
     * While the thread holds the lock, no other thread can enter any synchronized method on the same object instance.
     * Once the thread exits the synchronized method (either by completing the method or by throwing an exception), it releases
     * the lock, allowing other threads to enter synchronized methods of the same object.
     *
     * */
    public void incrementTotalBytes() {
//        BAD PRACTICE:
//        synchronized(this) {
//            ++totalBytes;
//        }
//        BETTER WAY:
        synchronized (totalBytesLock) {
            ++totalBytes;
        }
    }

    /*
     * We want to make this new method thread-safe as well, because it is possible that two download threads finish concurrently.
     * So we don't want them to update the total files field at the same time.
     * */
    public void incrementTotalFiles() {
//        BAD PRACTICE:
//        synchronized(this) {
//            ++totalFiles;
//        }
//        BETTER WAY:
        synchronized (totalFilesLock) {
            ++totalFiles;
        }
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    /*
     * All that aside, synchronization is bad. Your code runs sequentially, and you lose concurrency. Also, it may cause deadlocks
     * and all sorts of crazy bugs that are hard to reproduce and fix. So as a best practice, don't use it in new code.
     * */
}
