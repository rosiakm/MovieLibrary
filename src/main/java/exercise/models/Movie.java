package exercise.models;

import java.io.IOException;
import java.util.*;

import static exercise.helpers.JsonHandler.deserializeJson;
import static exercise.models.Actor.convertActorsListToString;

public class Movie {
    private String title;
    private Director director;
    private String genre;
    private int date;
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

    public void getMoviesFromDateRange() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower date range");
        int lowerDate = scanner.nextInt();
        System.out.println("Enter the higher range");
        int higherDate = scanner.nextInt();
        for (Movie temporaryMovie : deserializeJson()) {
            if (temporaryMovie.getDate() >= lowerDate && temporaryMovie.getDate() <= higherDate) {
                System.out.println(temporaryMovie.getTitle());
            }
        }
    }

    public void getAllInformationAboutRandomMovie() throws IOException {
        Random random = new Random();
        System.out.println(deserializeJson().get(random.nextInt(deserializeJson().size())).toString());
    }

    public void getFilmographyOfSpecificActor() throws IOException {
        List<String> filmography = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name of an actor/actress");
        String actorsFirstName = scanner.nextLine();
        System.out.println("Enter last name of an actor/actress");
        String actorsLastName = scanner.nextLine();
        for (Movie tempMovie : deserializeJson()) {
            List<Actor> tempMovieActors = tempMovie.getActors();
            for (Actor tempActor : tempMovieActors) {
                if (tempActor.getFirstName().equals(actorsFirstName) && tempActor.getLastName().equals(actorsLastName)) {
                    filmography.add(tempMovie.getTitle());
                }
            }
        }
        String actorsFilmography = filmography.toString();
        System.out.println(actorsFilmography.substring(1, actorsFilmography.length() - 1));
    }

    @Override
    public String toString() {
        return "title: " + getTitle() + "\r\n" +
                "director: " + director.getFirstName() + " " + director.getLastName() + "\r\n" +
                "genre: " + getGenre() + "\r\n" +
                "date: " + getDate() + "\r\n" +
                "actors: " + convertActorsListToString(actors) + "\r\n";
    }
}
