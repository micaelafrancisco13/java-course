package org.javacoursebymosh;

public class Movie implements Comparable<Movie> {
    private final String title;
    private final int likes;

    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public int getLikes() {
        return likes;
    }

    @Override
    public int compareTo(Movie other) {
        return title.compareTo(other.getTitle());
    }
}
