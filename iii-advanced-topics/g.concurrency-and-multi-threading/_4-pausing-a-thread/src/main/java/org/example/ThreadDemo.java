package org.example;

public class ThreadDemo {
    public static void show() {
        System.out.println("ThreadDemo class thread name: " + Thread.currentThread().getName());

        /*
        * If this program is run, you will see that these ten threads will start at the same time and after five seconds,
        * they all complete.
        * */
        for (int i = 0; i < 10; ++i) {
            var thread = new Thread(new DownloadFileTask());
            thread.start();
        }

        /*
        * If you had a single threaded application, downloading these ten files would take fifty seconds instead of five
        * seconds. Because each download would start once another download finished.
        * */

        /*
        * Now, what if you train to download, let's say one hundred or one thousand files concurrently? My machine has four
        * cores and eight threads available. So how's that going to work? Well, the job of virtual machine has what we call
        * a thread scheduler. The job of this scheduler is to decide what threads to run for how long. So if you have more
        * tasks than the available threads, the scheduler switches between these tasks, giving each a slice of the CPU time.
        * This happens so fast that it gives us the illusion that these tasks are being executed in parallel. But that's
        * parallelism at software level.
        * */
    }
}
