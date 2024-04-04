package padroes_estruturais.flyweight;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatalogTest {

    @Test
    void shouldReturnMovies() {
        var catalog = new Catalog();
        catalog.addMovie("Duna", "Action", "Action movie");

        List<String> movies = Arrays.asList(
                "Movie{name='Duna', category='Action', description='Action movie'}");
        assertEquals(movies, catalog.getMovies());
    }

    @Test
    void shouldReturnQuantityMovies() {
        var catalog = new Catalog();
        catalog.addMovie("Duna", "Action", "Action movie");

        assertEquals(1, FlyweightCategoryFactory.categorySize());
    }
}