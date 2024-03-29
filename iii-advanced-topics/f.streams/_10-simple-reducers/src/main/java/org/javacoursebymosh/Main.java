package org.javacoursebymosh;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        // intermediate operations we've talked about so far:
        // map() / flatMap()
        // filter()
        // limit() / skip()
        // sorted()
        // distinct()
        // peek()

        // reducers reduce stream of objects to a single object.
        // reducers are terminal operations, they produce a result.
        // the following are examples:
        // count()
        // anyMatch(predicate)
        // allMatch(predicate)
        // noneMatch(predicate)
        // findFirst() / findAny()
        // max(comparator) / min(comparator)

        // returns true if one of the stream objects satisfies the condition
        var hasMoreThan20Likes = movies.stream()
                .anyMatch(movie -> movie.getLikes() > 20);
        System.out.println("has more than 20 likes " + hasMoreThan20Likes);

        // returns true if all the stream objects satisfy the condition
        var allMoreThan20Likes = movies.stream()
                .allMatch(movie -> movie.getLikes() > 20);
        System.out.println("all more than 20 likes " + allMoreThan20Likes);

        // returns true if none of the stream objects satisfy the condition
        var noMoreThan20Likes = movies.stream()
                .noneMatch(movie -> movie.getLikes() > 30);
        System.out.println("no more than 20 likes " + noMoreThan20Likes);

        // returns the first stream object
        var first = movies.stream()
                .findFirst()
                .get();
        System.out.println("first stream object " + first.getTitle());

        // returns any stream object
        var any = movies.stream()
                .findAny()
                .get();
        System.out.println("any stream object " + any.getTitle());

        // max() or min() returns the max or min object based on a comparator
        var result = movies.stream()
                .max(Comparator.comparing(Movie::getLikes))
                .get();
        System.out.println("movie with the maximum number of likes " + result.getTitle());
    }
}