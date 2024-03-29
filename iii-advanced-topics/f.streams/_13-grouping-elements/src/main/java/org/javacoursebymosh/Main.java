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

        // say that we have to classify our movies by their genre.
        // the classifier is a function that takes an object and
        // determines how we're going to group our data.
        var result = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.toSet()));

        // the second argument on the groupingBy() is called a
        // "downstream collector"

        // maps to Map<Genre, Set<Movie>>
        // .collect(Collectors.groupingBy(Movie::getGenre, Collectors.toSet()));

        // counts the number of movies in each genre
        // .collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));

        // joins the movie titles by using a comma
        // .collect(Collectors.groupingBy(Movie::getGenre,
        //         Collectors.mapping(Movie::getTitle, Collectors.joining(", "))));

        for (var item : result.entrySet())
            System.out.println(item.getKey() + "\n" + item.getValue() + "\n");
    }
}