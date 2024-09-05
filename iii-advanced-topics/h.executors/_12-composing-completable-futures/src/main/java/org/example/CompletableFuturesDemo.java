package org.example;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {

    public static void show() {
        /*
         * Quite often, we want to start a task upon completion of another task.
         *
         * For example, get the user's playlist by their email. We can their email by their ID.
         *
         * First, we're going to create a CompletableFuture for getting the email of a user.
         * We want to start the second task upon completion of the first task.
         *
         * */
        CompletableFuture
//                .supplyAsync(() -> "myemail@gmail.com") // returns a String
                .supplyAsync(CompletableFuturesDemo::getUserEmailAsync) // getUserEmailAsync() returns a CompletableFuture object
                .thenCompose(emailFuture -> emailFuture)
                .thenCompose(CompletableFuturesDemo::getUserPlaylistAsync)
                .thenAccept(System.out::println);
    }

    private static CompletableFuture<String> getUserEmailAsync() {
        return CompletableFuture.supplyAsync(() -> "myemail@gmail.com");
    }

    private static CompletableFuture<String> getUserPlaylistAsync(String email) {
        System.out.println("User email " + email);
        return CompletableFuture.supplyAsync(() -> "My Playlist");
    }
}
