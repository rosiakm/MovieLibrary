package exercise.runner;

import exercise.models.Movie;
import java.io.IOException;
import java.util.Scanner;

import static exercise.helpers.Menu.printMenu;

public class Main {
    public static void main(String[] args) throws IOException {
        Movie movie = new Movie();
        Scanner scanner = new Scanner(System.in);

        while (true){
            printMenu();
            int option = scanner.nextInt();
            switch (option){
                case 1 -> movie.getMoviesFromDateRange();
                case 2 -> movie.getAllInformationAboutRandomMovie();
                case 3 -> System.out.println(movie.getFilmographyOfSpecificActor());
                case 4 -> System.exit(0);
                default -> System.out.println("Please choose one of the options 1-4");
            }
        }
    }
}
