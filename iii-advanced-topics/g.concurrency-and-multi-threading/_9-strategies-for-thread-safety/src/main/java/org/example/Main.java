package org.example;

public class Main {
    public static void main(String[] args) {
        /*
        * We have a few strategies for writing thread safe code. That is code that can be safely executed across multiple threads.
        *
        * The simplest solution is not to share data across threads in the first place. This is called "confinement" because we
        * want to define or restrict each thread to have its own data. For example, instead of sharing a download status object
        * across many download tasks, you could have each download task have its own download status object. When all these tasks
        * are complete, we can combine the result.
        *
        * Another strategy is using immutable or unchangeable objects. If an object is immutable, the thread can only read from it
        * and cannot modify its state. This immutability ensures that the object's state is fixed after it is created, which is a
        * key aspect of thread safety.
        *
        * Another strategy is to prevent multiple threads from accessing the same object concurrently. This is called "synchronization"
        * because we synchronize or coordinate the access to an object across different threads. We do that by using locks. So we put a
        * lock on certain parts of our code, and only one thread at a time can execute that part. Other threads have to wait. So
        * synchronization forces the code to run sequentially, which is against the idea of concurrency. Plus, implementing synchronization
        * is challenging and error-prone. One of the problems we may run into is a deadlock that happens when two threads wait for each
        * other indefinitely. So thread one waits for thread two, and at the same time, thread two waits for thread one. That's a deadlock
        * and can cause our application to crash. So generally speaking, synchronization is bad, and you should avoid it as much as possible.
        *
        * Another strategy is to use atomic classes in Java, like atomic integer. These classes allow us to achieve threat safety without
        * using locks. So if you increment an atomic integer, the JVM will execute the increment operation as one single atomic operation.
        *
        * Finally, another strategy is partitioning data into segments that can be accessed concurrently. Java provides a number of collection
        * classes that support concurrency using partitioning. Multiple threads can access a collection object, but only one thread at a time
        * can access a segment in that collection.
        *
         * */
    }
}