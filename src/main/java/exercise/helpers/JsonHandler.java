package exercise.helpers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import exercise.models.MovieLibrary;

import java.io.File;
import java.io.IOException;

public class JsonHandler {
    public static MovieLibrary deserializeJson(String jsonPath) throws IOException {
        return new ObjectMapper().readValue(new File(jsonPath), new TypeReference<>() {
        });
    }
}
