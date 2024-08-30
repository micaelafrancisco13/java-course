package org.example;

public class DownloadStatus {
    private int totalBytes;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        /*
         * This operation involves three steps. So even though we have only one line of code, there will be three steps happening
         * under the hood.
         *
         * First, the value of this field has to be read from the main memory and stored in the CPU.
         *
         * Next, the CPU is going to increment this value and then the updated value is going to be stored in the memory.
         *
         * So we have three steps, and we call this a nonatomic operation because it involves multiple steps. In contrast, an atomic
         * operation is like an atom. We cannot break it down into many steps.
         * */
        ++totalBytes;

        /*
         * Imagine two threads trying to call into this method at the same time. Let's say the value of this field is zero. Both these
         * threads will READ this value concurrently. They both INCREMENT it and WRITE it to the memory. So the result would be one instead
         * of two. This is how we lose an update.
         * */
    }

    // Now, we want all our download threads to report to a single download status object.
    // Go back to ThreadDemo class.
}
