package org.example;

public class ThreadDemo {
    public static void show() {
        System.out.println("ThreadDemo class thread name: " + Thread.currentThread().getName());

        /*
        * In all the examples I've shown you so far, our download threads have been isolated from each other. But in a real-world
        * scenario, sometimes, our threads may need to access and modify shared resources. For example, when downloading files, each
        * thread may report the number of bytes it has downloaded to a shared object (e.g., totalBytes). With this object, we can keep
        * track of the entire download progress and report it to the user. Now, if multiple threads access the same object, and at least
        * one of them changes this object, we're going to run into a couple of issues.
        *
        * The first issue happens when multiple threads try to modify the same data at the same time (e.g., totalBytes).
        *
        * When this happens, we say we have a "race condition" which means multiple threads are racing or competing to modify some data.
        *
        * Another issue happens when one thread changes the shared data, but the changes are not visible to other threads. So different
        * threads will have different views of the shared data. This is what we call a "visibility problem."
        *
        * These problems are not specific to Java. These are properties of concurrent systems. We have the same problem in databases because
        * multiple users can modify the same data at the same time.
        *
        * So if you want to build a multithreaded application, you need to have a proper understanding of these problems and know how to
        * prevent them. You should write code that can be safely executed by many threads in parallel. This is what we call "thread safe
        * code."
        *
        * */
    }
}
