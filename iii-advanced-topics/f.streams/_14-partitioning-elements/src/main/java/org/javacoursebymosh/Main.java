package org.javacoursebymosh;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10, Genre.ACTION),
                new Movie("b", 20, Genre.COMEDY),
                new Movie("c", 30, Genre.THRILLER),
                new Movie("d", 30, Genre.ACTION)
        );

        // say that we have to partition our data based into 2
        // categories, movies that have more than 20 likes and
        // movies that have fewer than 20 likes.

        // the second argument on the partitioningBy() is called a
        // "downstream collector"

        // returns a Map<Boolean, List<Movie>>
        var result = movies.stream()
                .collect(Collectors.partitioningBy(
                        movie -> movie.getLikes() > 20,
                        Collectors.mapping(Movie::getTitle, Collectors.joining(", "))
                ));

        for (var item : result.entrySet())
            System.out.println(item.getKey() + "\n" + item.getValue() + "\n");
    }
}