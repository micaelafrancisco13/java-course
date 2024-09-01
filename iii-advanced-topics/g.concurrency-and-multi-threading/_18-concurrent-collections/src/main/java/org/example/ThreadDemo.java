package org.example;

import java.util.concurrent.ConcurrentHashMap;

public class ThreadDemo {
    public static void show() {
        // Synchronized collections achieve thread safety by using locks. So when a thread gets access to a synchronized collection,
        // the entire collection gets locked and other threads have to wait. This works well for most cases, but it can have a
        // negative impact on the performance and scalability as the number of threads and concurrent operations increase. In those
        // situations, we can use concurrent collections in Java.

        // These classes use the partitioning technique to allow concurrency. So they divide their data into segments, and different
        // threads can concurrently work with different segments, but only one thread at a time can access a given segment. So
        // concurrent collections are faster than synchronous collections because they don't use synchronization.

        // This is a regular hash map implementation that is not thread safe. So if it's going to get access only by a single thread,
        // it's perfectly fine. But if you want to share this across many different threads, we're going to have problems. Now, to solve
        // this, all we have to do is to replace the hash map with the concurrent hash map.

        // var map = new HashMap<Integer, String>();
        var map = new ConcurrentHashMap<Integer, String>();
        map.put(1, "a");
        map.get(1);
        map.remove(1);

        System.out.println(map);

        // This Map is an interface and HashMap and ConcurrentHashMap are two different implementations of this interface.
    }
}
