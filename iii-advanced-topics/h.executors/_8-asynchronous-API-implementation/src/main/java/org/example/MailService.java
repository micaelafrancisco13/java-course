package org.example;

import java.util.concurrent.CompletableFuture;

public class MailService {
    /*
     * Sending an email is a long-running operation because we have to go over the network. Basically, anytime we have to touch the file
     * system or the network, we're dealing with a long-running operation, and we shouldn't run these operations on the main thread. We
     * should run them on a separate thread.
     * */
    public void send() {
        System.out.println("Sending mail...");
        LongTask.simulate();
        System.out.println("Mail was sent...");
    }

    // By convention, we add the "async" suffix to asynchronous method.
    public void sendAsync() {
        // runAsync() does not return a value.
        // supplyAsync() returns a value.
        CompletableFuture.runAsync(this::send);

        /*
         * Now, with this single line of code (line 21), we can execute send() in an asynchronous fashion. When we call the runAsync(), the
         * task that we pass here is going to be executed on a separate thread on the common thread pool. So if you have an existing
         * synchronous method, you can convert it to an asynchronous method by wrapping it inside a CompletableFuture object.
         * */
    }
}
