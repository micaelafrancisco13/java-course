package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ThreadDemo {
    public static void show() {
        // The code on line 12 may not consistently print "[1, 2, 3, 4, 5, 6]." The reason is that ArrayList is not thread-safe,
        // meaning that concurrent modifications by multiple threads can lead to unpredictable behavior, including race conditions.

        // var collection = new ArrayList<>();

        // A synchronized collection essentially wraps a regular collection, like an array list, but it makes it synchronize.
        var collection = Collections.synchronizedCollection(new ArrayList<>());

        var thread1 = new Thread(() -> {
            collection.addAll(Arrays.asList(1, 2, 3));
        });
        var thread2 = new Thread(() -> {
            collection.addAll(Arrays.asList(4, 5, 6));
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(collection);
    }
}
