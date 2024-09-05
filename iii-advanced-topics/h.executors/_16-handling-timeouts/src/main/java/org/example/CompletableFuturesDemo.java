package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFuturesDemo {
    private static final Logger logger = LoggerFactory.getLogger(CompletableFuturesDemo.class);

    public static void show() {
        /*
         * When calling on remote service, you want to have a limit in terms of howling we're willing to wait to get a response.
         * We don't want to wait forever.
         *
         * orTimeout() enforces a timeout limit.
         * completeOnTimeout() is similar to the orTimeout(), only it has an additional parameter that is the default value that
         * we're going to return if this task times out.
         * */
        CompletableFuture
                .supplyAsync(() -> {
                    LongTask.simulate();
                    return 1;
                })
//                .orTimeout(1, TimeUnit.SECONDS)
//                .exceptionally(exception -> {
//                    logger.error(exception.toString());
//                    return null;
//                })
                .completeOnTimeout(13, 1, TimeUnit.SECONDS)
                .thenAccept(System.out::println);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
