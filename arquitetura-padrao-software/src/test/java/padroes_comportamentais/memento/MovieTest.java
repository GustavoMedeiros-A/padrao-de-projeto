package padroes_comportamentais.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class MovieTest {

    @Test
    void shouldReturnMovieStatus() {
        Movie movie = new Movie();
        movie.setStatus(MovieStatusOscar.getInstance());
        assertEquals("Oscar", movie.getStatus().getStatusName());
    }

    @Test
    void shouldReturnInitialStatus() {
        Movie movie = new Movie();
        movie.setStatus(MovieStatusOscar.getInstance());
        movie.setStatus(MovieStatusReleased.getInstance());
        movie.restoreStatus(0);
        assertEquals(MovieStatusOscar.getInstance(), movie.getStatus());
    }

    @Test
    void shouldReturnBeforeStatus() {
        Movie movie = new Movie();
        movie.setStatus(MovieStatusOscar.getInstance());
        movie.setStatus(MovieStatusReleased.getInstance());
        movie.setStatus(MovieStatusOscar.getInstance());
        movie.restoreStatus(1);
        assertEquals(MovieStatusReleased.getInstance(), movie.getStatus());
    }

    @Test
    void shouldReturnExceptionWhenPassInvalidStatus() {
        try {
            Movie movie = new Movie();
            movie.restoreStatus(0);
            fail();
        } catch (Exception e) {
            assertEquals("Invalid index", e.getMessage());
        }
    }

}
