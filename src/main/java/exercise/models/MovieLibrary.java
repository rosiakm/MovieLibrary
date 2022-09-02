package exercise.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MovieLibrary {
    @JsonProperty("movies")
    private List<Movie> movies;

    public MovieLibrary(){

    }
    public void getAllInformationAboutRandomMovie(){
        Random random = new Random();
        System.out.println(movies.get(random.nextInt(movies.size())).toString());
    }
    public void getMoviesFromDateRange(int lowerDate, int higherDate){
        for (Movie temporaryMovie : movies) {
            if (temporaryMovie.getDate() >= lowerDate && temporaryMovie.getDate() <= higherDate) {
                System.out.println(temporaryMovie.getTitle());
            }
        }
    }
    public void getFilmographyOfSpecificActor(Actor actor){
        List<String> filmography = new ArrayList<>();
        for (Movie tempMovie : movies) {
            List<Actor> tempMovieActors = tempMovie.getActors();
            for (Actor tempActor : tempMovieActors) {
                if (tempActor.getFirstName().equals(actor.getFirstName()) && tempActor.getLastName().equals(actor.getLastName())) {
                    filmography.add(tempMovie.getTitle());
                }
            }
        }
        String actorsFilmography = filmography.toString();
        System.out.println(actorsFilmography.substring(1, actorsFilmography.length() - 1));
    }
}
