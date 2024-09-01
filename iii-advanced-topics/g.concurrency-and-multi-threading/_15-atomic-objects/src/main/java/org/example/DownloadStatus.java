package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {
    // Now, multiple threads can modify this field concurrently without waiting for each other.
    private final AtomicInteger totalBytes = new AtomicInteger();

    public int getTotalBytes() {
        return totalBytes.get();
    }

    /*
     * Earlier, you learned that incrementing a variable in Java is not atomic because it involves three instructions. Get, increment,
     * and write. With these atomic classes, we can increment or decrement a value in an atomic way.
     * */
    public void incrementTotalBytes() {
        totalBytes.incrementAndGet();
        // incrementAndGet is ++totalBytes
        // getAndIncrement is totalBytes++
    }

    /*
     * If you're curious how atomic types work, they actually use a technique called "compare and swap" which is supported by most CPUs.
     * So most CPUs can execute this operation as a single, uninterruptible operation. So when we call the incrementAndGet(), this atomic
     * type is going to compare the current value with the expected value, if they're not equal, it's going to swap them.
     *
     * Example:
     * Current is 0, then it's incremented, the updated/expected value is now 1. (0 - 1)
     * This atomic type is going to compare these values and because they're different, it's going to swap them. (1- 0)
     *
     * This entire operation is natively supported by most CPUs as an atomic operation.
     *
     * */
}
