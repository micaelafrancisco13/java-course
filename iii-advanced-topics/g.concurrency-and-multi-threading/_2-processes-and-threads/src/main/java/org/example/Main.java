package org.example;

public class Main {
    public static void main(String[] args) {
        /*
         * Let's start this section with a quick overview of the key terms and ideas in concurrent systems.
         * The one key term to understand is "process." A process is an instance of a program or an application.
         * When you launch an application, such as your code editor or music player, your operating system loads
         * that application inside a process.
         *
         * Your operating system can execute many processes at the same time. For example, it can run an antivirus
         * while playing music. So that's concurrency at the process level.
         *
         * But we can also have concurrency within the process or within an application using threads. Technically
         * speaking, a thread is a sequence of instructions.That's why it's called a thread. It's like a thread of
         * instructions. Now practically speaking, a thread is actually that "thing" that executes your code. Each
         * process has at least one thread called the "main thread," but we can create additional threads to run
         * many tasks concurrently.
         *
         * For example, we can build a web server that can serve many clients at the same time.We'll serve each client
         * using a separate thread. Or we can build an application that downloads multiple images concurrently. We do
         * this by starting multiple threads and have each thread download a separate image.
         *
         * This is what we call multithreading. Applications that use multiple threads are called multithreaded applications.
         * Now these days, most processors have multiple cores, and these cores can be used for running many processors or
         * threads. If your application doesn't use threads, it's essentially using only one of the processor cores. So it's
         * not using the full power of your CPU.
         */

        // returns the number of active threads in the current process
        System.out.println(Thread.activeCount()); // prints 2

        // gets the total number of available threads
        System.out.println(Runtime.getRuntime().availableProcessors()); // prints 8

        /*
         * This program is using two threads. One of them is the main thread running our main method. The other is a background
         * thread that runs the garbage collector. This garbage collector removes unused objects from memory. So our program is
         * using two threads, but we have eight threads available.
         *
         * Now, this number may be different on your machine. My machine has four cores, and each core has two threads. So I have
         * eight threads available that I can use to run things in parallel.
         * */
    }
}