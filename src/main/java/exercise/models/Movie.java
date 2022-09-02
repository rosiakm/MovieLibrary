package exercise.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

public class Movie {
    @JsonProperty("title")
    private String title;
    @JsonProperty("director")
    private Director director;
    @JsonProperty("genre")
    private String genre;
    @JsonProperty("date")
    private int date;
    @JsonProperty("actors")
    private List<Actor> actors;

    public Movie() {
    }

    public Movie(String title, Director director, String genre, int date, List<Actor> actors) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.date = date;
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public String convertActorsListToString(List<Actor> actors){
        String s = this.actors.toString();
        return s.substring(1,s.length()-1);
    }
    @Override
    public String toString() {
        return "title: " + getTitle() + "\r\n" +
                "director: " + director.toString() + "\r\n" +
                "genre: " + getGenre() + "\r\n" +
                "date: " + getDate() + "\r\n" +
                "actors: " + convertActorsListToString(actors) + "\r\n";
    }
}
