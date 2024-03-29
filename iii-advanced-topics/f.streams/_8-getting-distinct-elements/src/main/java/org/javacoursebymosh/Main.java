package org.javacoursebymosh;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 10),
                new Movie("c", 30)
        );

        // retrieves movies without duplicated likes
        movies.stream()
                .map(Movie::getLikes)
                .distinct()
                .forEach(System.out::println);

        // line 17 prints
        // 10
        // 30
    }
}