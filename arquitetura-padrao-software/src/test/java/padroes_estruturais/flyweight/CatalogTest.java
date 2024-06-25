package padroes_estruturais.flyweight;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CatalogTest {

    private Catalog catalog;

    @BeforeEach
    void setUp() {
        catalog = new Catalog();
    }

    @Test
    void shouldAddMoviesAndVerifyFlyweightPattern() {
        catalog.addMovie("Movie 1", "Action", "Action-packed movie");
        catalog.addMovie("Movie 2", "Action", "Action-packed movie");
        catalog.addMovie("Movie 3", "Drama", "Dramatic storyline");

        List<String> movies = catalog.getMovies();

        assertEquals(3, movies.size());
        assertTrue(movies.contains("Movie{name='Movie 1', category='Action', description='Action-packed movie'}"));
        assertTrue(movies.contains("Movie{name='Movie 2', category='Action', description='Action-packed movie'}"));
        assertTrue(movies.contains("Movie{name='Movie 3', category='Drama', description='Dramatic storyline'}"));

        // Verify that only 2 categories were created due to flyweight pattern
        assertEquals(2, FlyweightCategoryFactory.categorySize());
    }

    @Test
    void shouldReuseExistingCategory() {
        catalog.addMovie("Movie 1", "Action", "Action-packed movie");
        catalog.addMovie("Movie 2", "Action", "Action-packed movie");

        List<String> movies = catalog.getMovies();

        assertEquals(2, movies.size());
        assertTrue(movies.contains("Movie{name='Movie 1', category='Action', description='Action-packed movie'}"));
        assertTrue(movies.contains("Movie{name='Movie 2', category='Action', description='Action-packed movie'}"));

        var test = new FlyweightCategoryFactory();
        assertEquals(2, FlyweightCategoryFactory.categorySize());
    }
}