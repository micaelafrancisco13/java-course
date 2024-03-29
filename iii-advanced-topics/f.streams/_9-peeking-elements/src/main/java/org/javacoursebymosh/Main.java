package org.javacoursebymosh;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        // for troubleshooting, we can utilize the peek().
        // we can use peek() to get the output of each operation.
        // peek() is an intermediate method.
        movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .peek(movie -> System.out.println("filtered " + movie.getTitle()))
                .map(Movie::getTitle)
                .peek(title -> System.out.println("mapped " + title))
                .forEach(System.out::println);

        // prints:
//        filtered b
//        mapped b
//        b
//        filtered c
//        mapped c
//        c
    }
}