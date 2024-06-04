package padroes_comportamentais.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CatalogTest {

    @Test
    void shouldUpdateMovieLastNotification() {
        var catalog = new Catalog();
        var movie = new Movie("Duna");
        var movie2 = new Movie("Carros");

        catalog.addObserver(movie);
        catalog.addObserver(movie2);

        movie.update("22:00");
        movie.update("23:00");

        movie2.update("00:00");

        assertNotNull(catalog);
        assertEquals(movie.show(), "Movie name Duna Notification updated: 23:00");
        assertEquals(movie2.show(), "Movie name Carros Notification updated: 00:00");
    }

}
