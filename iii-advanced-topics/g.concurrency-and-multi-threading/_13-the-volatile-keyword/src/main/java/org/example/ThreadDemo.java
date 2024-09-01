package org.example;

public class ThreadDemo {
    public static void show() {
        /*
         * In Java, we have another tool for writing thread-safe code, but without the overhead of synchronization, it's the
         * "volatile" keyword. It solves the visibility problem, but not the race condition. So it doesn't prevent two threads
         * simultaneously modifying some data. Instead, it ensures that if one thread changes some data, other threads can see
         * the changes.
         *
         * Go to DownloadStatus class.
         *
         * */

        /*
         * We want to create two threads. One thread simulates downloading a file, and the other checks to see if the download is
         * finished. When the download is finished, we want to report something to the user.
         * */

        var status = new DownloadStatus();
        var thread1 = new Thread(new DownloadFileTask(status));
        var thread2 = new Thread(() -> {
            // This loop runs infinitely. Why? In this particular case, we want to make sure that only one thread at a time can update
            // this field. But here, we're dealing with another field "isDownloadFileFinished." These are two separate fields. Now, if
            // you want to solve the problem in this demo, you should prefer to use the synchronized block.

            // Even though the synchronized keyword solved this problem, it can cause a lot of overhead because in this while loop,
            // we're constantly calling the is isDownloadFileFinished(). While we're calling this method, no other threads can do anything
            // else with this "status" object. They cannot call any other methods in this object. So all these method calls will run in
            // sequence.

            /*
             * When we run this program, the thread2 waits indefinitely because it doesn't see the change to the "isDownloadFileFinished"
             * field. This is the visibility problem. So one thread changes some data, and the other thread cannot see the change.
             *
             * But why does this happen? Well, the JVM makes some optimizations under the hood to make our code run faster. One of these
             * optimizations is caching values. So let's say we have an integer field with the value "1." This value is stored in the main
             * memory or RAM. Now, we have two threads running by two different CPU cores. Each CPU has a cache, which is a small amount of
             * memory available locally in that CPU. Reading the data from the cache is faster because the data is closer to the CPU. So it
             * doesn't have to travel far. It doesn't have to travel between the CPU and the main memory.
             *
             * Now, this is what happens. Two threads read the value of a field from RAM and store it locally in the CPU cache. Now, the
             * first thread changes its value, but this change is only local to this thread. So the second threat doesn't see the change.
             * Even if it writes the change back in the memory, the second threat doesn't see the change because it already has the value of
             * this field in its cache. This is a visibility problem.
             *
             * To solve this problem without the overhead of synchronization, we can declare this field as "volatile."
             *
             * Go to DownloadStatus class.
             *
             * */
            while (true) {
                if (status.isDownloadFileFinished())
                    break;
            }
            System.out.println(status.getTotalBytes());
        });

        thread1.start();
        thread2.start();
    }
}
