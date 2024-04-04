package padroes_estruturais.proxy;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private static Map<Integer, Movie> movies = new HashMap<>();

    public static Movie getMovie(Integer id) {
        return movies.get(id);
    }

    public static void addMovie(Movie movie) {
        movies.put(movie.getId(), movie);
    }

}
