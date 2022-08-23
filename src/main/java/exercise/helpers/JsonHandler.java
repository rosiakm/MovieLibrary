package exercise.helpers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import exercise.models.Movie;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonHandler {

    private static final String jsonPath = "src/main/resources/movies.json";

    public static List<Movie> deserializeJson() throws IOException {
        return new ObjectMapper().readValue(new File(jsonPath), new TypeReference<>() {
        });
    }
}
