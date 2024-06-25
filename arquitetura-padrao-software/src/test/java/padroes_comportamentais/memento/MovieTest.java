package padroes_comportamentais.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
        Movie movie = new Movie();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            movie.restoreStatus(0);
        });
        assertEquals("Invalid index", exception.getMessage());
    }

    @Test
    void shouldReturnExceptionWhenPassInvalidNegativeIndex() {
        Movie movie = new Movie();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            movie.restoreStatus(-1);
        });
        assertEquals("Invalid index", exception.getMessage());
    }

    @Test
    void shouldReturnExceptionWhenPassInvalidIndex() {
        Movie movie = new Movie();
        movie.setStatus(MovieStatusOscar.getInstance());
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            movie.restoreStatus(2);
        });
        assertEquals("Invalid index", exception.getMessage());
    }

    @Test
    void shouldReturnAllStatus() {
        Movie movie = new Movie();
        movie.setStatus(MovieStatusOscar.getInstance());
        movie.setStatus(MovieStatusReleased.getInstance());
        assertEquals(2, movie.getAllStatus().size());
        assertEquals(MovieStatusOscar.getInstance(), movie.getAllStatus().get(0));
        assertEquals(MovieStatusReleased.getInstance(), movie.getAllStatus().get(1));
    }

    @Test
    void shouldReturnReleasedStatusName() {
        MovieStatus status = MovieStatusReleased.getInstance();
        assertEquals("Released", status.getStatusName());
    }
}
