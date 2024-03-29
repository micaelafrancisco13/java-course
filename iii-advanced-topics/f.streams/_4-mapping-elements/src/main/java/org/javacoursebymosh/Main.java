package org.javacoursebymosh;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // quite often, we need to transform the values in a stream.
        // to do that, we use map() or flatMap()
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        // we're only interested on the movie names.
        // instead of having a stream of movie objects, we're going to
        // have a stream of strings where the strings are the movie
        // titles.

        // maps/transforms each movie object to a different type
        // mapToInt(), mapToDouble(), and so on...
        movies.stream()
                // .mapToInt(Movie::getLikes)
                .map(Movie::getTitle)
                .forEach(System.out::println);

        // flatMap() usage
        // every object in this stream is a list of integers
        Stream.of(List.of(1, 2, 3), List.of(4, 5, 6))
                .forEach(System.out::println);

        // line 31 prints:
        // [1, 2, 3]
        // [4, 5, 6]

        Stream.of(List.of(1, 2, 3), List.of(4, 5, 6))
                .flatMap(Collection::stream)// we convert each list to a stream
                // .flatMap(list -> list.stream()) same as the line above
                .forEach(System.out::println);

        // the type passed on the forEach() above is now an integer, as
        // opposed to a list

        // Stream<List<X>> to Stream<X>

        // line 41 prints:
        // 1
        // 2
        // 3
        // 4
        // 5
        // 6
    }
}