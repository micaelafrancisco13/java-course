package org.javacoursebymosh;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        // quite often, we want to collect the result of a stream
        // into a data structure such as list.
        // toList(), toArray()
        var result1 = movies.stream()
                .collect(Collectors.toMap(Movie::getTitle, Movie::getLikes));

        // line 19 converts the stream into key-value pairs, where the key
        // is the movie title and the value is the movie likes.

        // prints "{a=10, b=20, c=30}"
        System.out.println("result1 " + result1);

        var result2 = movies.stream()
                // .collect(Collectors.toMap(Movie::getTitle, movie -> movie));
                .collect(Collectors.toMap(Movie::getTitle, Function.identity()));
        System.out.println("result2 " + result2);

        // lines 28 and 29 are identical

        // adds up all the movie likes
        // summingDouble(), summingLong(), and so on...
        var result3 = movies.stream()
                .collect(Collectors.summingInt(Movie::getLikes));
        System.out.println("result3 " + result3);

        // prints
        // "IntSummaryStatistics{count=3, sum=60, min=10, average=20.000000, max=30}"
        // summarizingInt() gives us statistics about the values in our stream.
        // summarizingDouble(), summarizingLong(), and so on...
        var result4 = movies.stream()
                .collect(Collectors.summarizingInt(Movie::getLikes));
        System.out.println("result4 " + result4);

        // we also have delimiter to join/concatenate values
        // prints "a, b, c"
        var result5 = movies.stream()
                .map(Movie::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println("result5 " + result5);

        var result6 = movies.stream().toList();
        System.out.println("result6");
        for (var r : result6)
            System.out.println(r.getTitle() + " " + r.getLikes());

        var result7 = result6.toArray(new Movie[0]);
        System.out.println("result7");
        for (var r : result7)
            System.out.println(r.getTitle() + " " + r.getLikes());
    }
}