package padroes_estruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private List<Movie> movies = new ArrayList<>();

    public void addMovie(String nameMovie, String nameCategory, String descriptionCategory) {
        var catalog = FlyweightCategoryFactory.getCategory(nameCategory, descriptionCategory);
        var movie = new Movie(nameMovie, catalog);
        movies.add(movie);
    }

    public List<String> getMovies() {
        List<String> movie_return = new ArrayList<String>();
        for (Movie movie : this.movies) {
            movie_return.add(movie.getMovie());
        }

        return movie_return;

    }

}
