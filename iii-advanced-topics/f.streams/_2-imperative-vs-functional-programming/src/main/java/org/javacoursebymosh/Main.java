package org.javacoursebymosh;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // let's say we have a list of movies, and we want to count
        // the number of movies that have more than 10 likes
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        // this style of code is called "imperative programming."
        // in imperative programming, we have statements that specify
        // HOW something should be done.
        // how we should count the number of movies that have more than
        // 10 likes.
        int count1 = 0;
        for (var movie : movies)
            if (movie.getLikes() > 10)
                ++count1;
        System.out.println(count1);

        // in contrast to imperative programming, we have declarative
        // programming where we express logic in terms of WHAT needs to
        // be done.

        // SQL is an example of a declarative language. we write a query to
        // express what we need to get from the database, but we don't
        // write the actual logic for pulling out data & filtering it.

        // streams we're introduced in Java to allow us to process a
        // collection of data in a declarative, or more accurately, in a
        // functional way.

        // functional programming is a special type of declarative
        // programming, but it brings some additional concepts.

        // some of the programming paradigms:
        // declarative, functional, object-oriented, event-driven,
        // and so on...

        // --

        // rewriting the code above in a functional style:

        // every collection in java has a stream() method.
        // stream is just a way to get data out from a collection.

        // analogy:
        // water tank
        // water === data
        // tank === collection/data structure
        // pipes === streams

        // we can build a pipeline to transform data and get it out from
        // a collection.

        // this right here is an example of functional programming because
        // we have a bunch of functions chained one after another to express
        // WHAT needs to be done.
        var count2 = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .count();

        System.out.println(count2);

        // the expressions inside every method after stream() are applied
        // to every object in the collection
    }
}