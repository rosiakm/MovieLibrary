package exercise.runner;

import exercise.helpers.JsonHandler;
import exercise.models.Actor;
import exercise.models.Movie;
import exercise.models.MovieLibrary;

import java.io.IOException;
import java.util.Scanner;

import static exercise.helpers.InputHandler.*;
import static exercise.helpers.Menu.printMenu;

public class Main {
    private static final String jsonPath = "src/main/resources/movies.json";
    public static void main(String[] args) throws IOException {
        MovieLibrary library = JsonHandler.deserializeJson(jsonPath);
        Scanner scanner = new Scanner(System.in);

        while (true){
            printMenu();
            int option = scanner.nextInt();
            switch (option){
                case 1 -> library.getMoviesFromDateRange(getLowerDate(),getHigherDate());
                case 2 -> library.getAllInformationAboutRandomMovie();
                case 3 -> library.getFilmographyOfSpecificActor(new Actor(getFirstName(),getLastName()));
                case 4 -> System.exit(0);
                default -> System.out.println("Please choose one of the options 1-4");
            }
        }
    }
}
