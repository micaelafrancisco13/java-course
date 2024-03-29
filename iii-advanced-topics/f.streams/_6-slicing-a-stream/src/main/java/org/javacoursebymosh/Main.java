package org.javacoursebymosh;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30),
                new Movie("d", 15)
        );

        // we have 4 methods for getting a slice of a stream

        // limit(n)
        // - only retrieves an arbitrary number of objects
        System.out.println("limit(n)");
        movies.stream()
                .limit(2)
                .map(Movie::getTitle)
                .forEach(System.out::println);

        // skip(n)
        // - skips an arbitrary number of objects
        System.out.println("skip(n)");
        movies.stream()
                .skip(2)
                .map(Movie::getTitle)
                .forEach(System.out::println);

        // with limit() and skip(), we can implement a pagination
        // skip((page - 1) * pageSize)
        // limit(pageSize)

        // takeWhile(predicate)
        // - as long as this condition is true, keep getting an object
        //   from the stream, otherwise, return
        // - the difference between takeWhile() and filter() is the
        //   filter() iterates the entire data source to find objects
        //   that match our criteria.
        //   whereas, the takeWhile() method stops the moment the condition
        //   returns false.
        System.out.println("takeWhile(predicate)");
        movies.stream()
                .takeWhile(movie -> movie.getLikes() < 30)
                .map(Movie::getTitle)
                .forEach(System.out::println);

        // dropWhile(predicate)
        // - skips all the objects in the stream that match the condition,
        //   then takes the rest
        System.out.println("dropWhile(predicate)");
        movies.stream()
                .dropWhile(movie -> movie.getLikes() < 30)
                .map(Movie::getTitle)
                .forEach(System.out::println);
    }
}