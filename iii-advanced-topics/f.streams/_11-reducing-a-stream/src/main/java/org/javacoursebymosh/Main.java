package org.javacoursebymosh;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        // say that we want to add up all the likes of the Movies
        // collection.
        var sum = movies.stream()
                .map(Movie::getLikes)
                .reduce(0, Integer::sum);
        System.out.println(sum);

        // behind the scenes of reduce()
        // [10, 20, 30]
        // 10 + 20 -> [30, 30]
        // 30 + 30 -> [60]
    }
}