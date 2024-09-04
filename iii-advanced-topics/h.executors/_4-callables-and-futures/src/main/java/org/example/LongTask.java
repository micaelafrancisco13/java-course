package org.example;

public class LongTask {
    public static void simulate() {
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
