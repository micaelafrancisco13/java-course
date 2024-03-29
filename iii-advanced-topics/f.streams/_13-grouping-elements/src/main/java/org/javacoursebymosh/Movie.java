package org.javacoursebymosh;

public class Movie implements Comparable<Movie> {
    private final String title;
    private final int likes;
    private final Genre genre;

    public Movie(String title, int likes, Genre genre) {
        this.title = title;
        this.likes = likes;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getLikes() {
        return likes;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public int compareTo(Movie other) {
        return title.compareTo(other.getTitle());
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", likes=" + likes +
                ", genre=" + genre +
                '}';
    }
}
