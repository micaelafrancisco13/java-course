package org.example;

public class ThreadDemo {
    public static void show() {
        var status = new DownloadStatus();
        var thread1 = new Thread(new DownloadFileTask(status));
        var thread2 = new Thread(() -> {
            /*
             * Sometimes, we want one thread to wait until some condition becomes true. For example, over here, the second thread
             * has to wait until the "isDownloadFileFinished" field becomes true. Now, we're implementing this using a while loop
             * with an empty body. The problem with this implementation is that it wastes CPU cycles because this while loop is
             * continuously running until the isDownloadFileFinished field becomes true. It may run millions or even trillions of
             * times. So it wastes CPU cycles.
             *
             * Now, we can solve this problem by using the wait and notify methods. So every object in Java has this "weight" and
             * "notify" method.
             *
             * */
            while (!status.isDownloadFileFinished()) {
                /*
                 * So when we call the wait(), this while loop is not going to run a million times. In the first iteration, this
                 * wait() is going to put this thread into sleep until another thread wakes it up.
                 *
                 * Now, the JVM expects us to call the wait method inside a synchronized block. So we need to wrap this inside the
                 * synchronized block, and we're going to use the status object as our monitor.
                 *
                 * Go to DownloadFileTask class.
                 *
                 * */
                synchronized (status) {
                    try {
                        status.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            /*
            * With this implementation, the moment the second thread gets started, the while loop above is going to start. And in the
            * first iteration, the wait() is going to put this thread into sleep. Hence, the while loop above is not going to get
            * executed a million times. Now, the moment the first thread finishes its job, it is going to notify the second thread. So
            * the second thread is going to wake up, and then it's going to print the total bytes.
            *
            * So this is a more efficient implementation than a while loop with an empty body that runs a million times. Having said that,
            * wait and notify can get pretty tricky in complex applications. If you don't use them properly, you're going to run into all
            * sorts of weird issues. So I would say don't use them in new code. These days, we have better tools for implementing this kind
            * of communication between threads, we'll look at them in the next section.
            * 
            * */
            System.out.println(status.getTotalBytes());
        });

        thread1.start();
        thread2.start();
    }
}
