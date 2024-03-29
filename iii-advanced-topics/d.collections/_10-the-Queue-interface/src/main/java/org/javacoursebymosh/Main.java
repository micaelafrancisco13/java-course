package org.javacoursebymosh;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // the following are interfaces with inheritance applied:
        //          Iterable
        //         Collection
        //      List   Queue   Set

        // we use Queue when we want to process jobs based on the
        // order we received them.
        // ArrayDeque and PriorityQueue are implementations.

        // the "Dequeue" in ArrayDequeue, means "double-ended queue"
        // items can enter from either end.

        // PriorityQueue is a queue where each item gets a priority,
        // and this priority determines the item's position.
        // items with high priority move to the beginning of the queue.
        // e.g., operating system processes

        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");
        // c is at the front of the queue, followed by a & b

        // adds item at the end of the queue
        queue.offer("d");
        System.out.println(queue);

        // add() vs offer()
        // in some implementations, a queue might have a size limitation.
        // in those cases, if the queue gets full, add() throws an exception,
        // whereas, the offer() returns false.

        // returns the item at the beginning of the queue
        // returns null if queue is empty
        System.out.println(queue.peek());

        // similar to peek() but this throws an exception if the queue is empty
        System.out.println(queue.element());

        // removes the item at the beginning of the queue
        // returns null if queue is empty
        var removed1 = queue.poll();
        System.out.println(removed1);
        System.out.println(queue);

        // similar to poll() but this throws an exception if the queue is empty
        var removed2 = queue.remove();
        System.out.println(removed2);
        System.out.println(queue);
    }
}