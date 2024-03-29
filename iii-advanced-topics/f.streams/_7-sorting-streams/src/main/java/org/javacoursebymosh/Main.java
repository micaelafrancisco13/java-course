package org.javacoursebymosh;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("b", 20),
                new Movie("a", 10),
                new Movie("d", 15),
                new Movie("c", 30)
        );

        // by default, the objects in a stream come in order
        // as the underlying data source

        // we can sort the order using sorted().
        // remember that we can implement sorting by implementing
        // the compareTo() from the Comparable interface or the
        // compare() from the Comparator interface.
        movies.stream()
                // .sorted((a, b) -> a.getTitle().compareTo(b.getTitle))
                // .sorted(Comparator.comparing(Movie::getTitle))
                // .sorted(Comparator.comparing(Movie::getTitle).reversed())
                .sorted()
                .map(Movie::getTitle)
                .forEach(System.out::println);

        // line 22 and 23 are identical

        // line 24 reverses the sorting of the movie objects

        // if the compareTo() is not implemented, we can directly supply
        // an implementation to the sorted() method (line 22 or 23).
    }
}