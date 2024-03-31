package padroes_estruturais.facede;

import java.util.ArrayList;
import java.util.List;

public abstract class MovieSector {
    private List<Movie> movieWithPendecies = new ArrayList<Movie>();

    public void addMovieWithPendecies(Movie movie) {
        this.movieWithPendecies.add(movie);
    }

    public boolean verifyMovieWithPendecies(Movie movie) {
        return this.movieWithPendecies.contains(movie);
    }

}
