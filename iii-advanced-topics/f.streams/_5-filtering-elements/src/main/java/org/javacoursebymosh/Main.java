package org.javacoursebymosh;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        // filter() returns Stream<Movie>, with this, we can chain
        // relevant methods such as filter() again or map().
        Predicate<Movie> isPopular = movie -> movie.getLikes() > 10;
        movies.stream()
                .filter(isPopular)
                .forEach(System.out::println);

        // the stream methods fall into 2 categories:
        // intermediate and terminal operations

        // intermediate operations return a new stream
        // e.g., map() filter()

        // terminal operations return void
        // if we don't call a terminal operation, nothing is done
        // e.g., forEach()
    }
}