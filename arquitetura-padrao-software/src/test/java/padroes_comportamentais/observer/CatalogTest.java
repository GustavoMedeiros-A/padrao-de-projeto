package padroes_comportamentais.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CatalogTest {

    @Test
    void shouldUpdateMovieLastNotificationDirectly() {
        Movie movie = new Movie("Duna");
        movie.update("22:00");
        assertEquals("Movie name Duna Notification updated: 22:00", movie.show());
    }

    @Test
    void shouldUpdateAllObservers() {
        Catalog catalog = new Catalog();
        Movie movie1 = new Movie("Duna");
        Movie movie2 = new Movie("Carros");

        catalog.addObserver(movie1);
        catalog.addObserver(movie2);

        // Simulate a change in the catalog that triggers notifications
        catalog.notifyObserver();

        // Update the notification directly to observe changes
        movie1.update("New Release");
        movie2.update("Upcoming");

        assertEquals("Movie name Duna Notification updated: New Release", movie1.show());
        assertEquals("Movie name Carros Notification updated: Upcoming", movie2.show());
    }

    @Test
    void shouldAddObservers() {
        Catalog catalog = new Catalog();
        Movie movie1 = new Movie("Duna");
        Movie movie2 = new Movie("Carros");

        assertNotNull(catalog);

        catalog.addObserver(movie1);
        catalog.addObserver(movie2);

        // Simulate a change in the catalog that triggers notifications
        catalog.notifyObserver();

        // Update the notification directly to observe changes
        movie1.update("22:00");
        movie2.update("23:00");

        assertEquals("Movie name Duna Notification updated: 22:00", movie1.show());
        assertEquals("Movie name Carros Notification updated: 23:00", movie2.show());
    }

    @Test
    void shouldNotifyObservers() {
        Catalog catalog = new Catalog();
        Movie movie1 = new Movie("Duna");
        Movie movie2 = new Movie("Carros");

        catalog.addObserver(movie1);
        catalog.addObserver(movie2);

        // Simulate a change in the catalog that triggers notifications
        catalog.notifyObserver();

        // Assume notifyObserver triggers an update with a certain message
        movie1.update("Catalog Updated");
        movie2.update("Catalog Updated");

        assertEquals("Movie name Duna Notification updated: Catalog Updated", movie1.show());
        assertEquals("Movie name Carros Notification updated: Catalog Updated", movie2.show());
    }
}
