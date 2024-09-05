package org.example;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {

    public static void show() {
        /*
         * CompletableFuture can start two tasks asynchronously and then combine the results.
         *
         * For example, we query the Notes API and the NoteCategories API. When both async operations are completed, we combine
         * the results to a JSON type like this:
         *
         * Note categories:
         * {
         *   "id": 1,
         *   "name": "Work"
         * }
         *
         * Notes:
         * {
         *   "name": "Note 1",
         *   "category": "Work",
         *   "description": "My work notes..."
         * }
         *
         * We don't want to call the second service upon completion of the first task. We want to start this task concurrently and
         * then wait for both of them to complete to structure the result.
         *
         * */
        var first1 = CompletableFuture.supplyAsync(() -> "Note category");
        var second1 = CompletableFuture.supplyAsync(() -> "Note");

        // with thenCombine(), we can combine the result of 2 async operations.
        first1
                .thenCombine(second1, (noteCategory, note) -> {
                    System.out.println(noteCategory);
                    System.out.println(note);
                    return "Note with category";
                })
                .thenAccept(System.out::println);

        /*
         * thenApply() is used in the context of CompletableFuture to process the result of a computation once it is completed. It
         * takes a function as an argument that operates on the result of the CompletableFuture, applies a transformation, and returns
         * a new result.
         * */
        var first2 = CompletableFuture
                .supplyAsync(() -> "20USD")
                .thenApply(price -> Integer.parseInt(price.replace("USD", "")));

        var second2 = CompletableFuture.supplyAsync(() -> 0.9);

        first2
                .thenCombine(second2, (price, exchangeRate) -> price * exchangeRate)
                .thenAccept(System.out::println);

        // All of this is happening asynchronously, so none of this code is going to block the current thread.
    }
}
