package org.example;

import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {
    /*
     * Atomic objects are great for implementing counters, but if you have multiple threads updating a value frequently, it's better
     * to use one of the Adder classes in Java (e.g., LongAdder, DoubleAdder). They're faster than atomic types.
     *
     * Internally, this LongAdder object keeps an array of counters that can grow on demand. So we don't have a single place in memory
     * where our value is stored. You have a bunch of array cells each holding a counter-value. So different threads can modify these
     * counter-variables concurrently. That's why these Adder classes are faster than atomic types because they allow more throughput.
     * Link: https://chatgpt.com/share/935102cb-cab0-4fbb-bdd6-aa464ac390b3
     *
     * */
    private final LongAdder totalBytes = new LongAdder();

    // intValue() returns result as an integer.
    // Internally, this method is going to call another method called sum, which is going to add up all these counter-values and return
    // the result.
    public int getTotalBytes() {
        return totalBytes.intValue();
    }

    public void incrementTotalBytes() {
        totalBytes.increment();
    }
}
