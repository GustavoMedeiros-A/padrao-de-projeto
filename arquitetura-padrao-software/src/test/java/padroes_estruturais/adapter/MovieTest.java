package padroes_estruturais.adapter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest {

    @Test
    void shouldReturnCategory() {
        Movie movie = new Movie();
        movie.setCategory("Filme longo");
        assertEquals("Filme longo", movie.getCategory());
    }

    @Test
    void shouldReturnMovieDuration() {
        Movie movie = new Movie();
        movie.setCategory("Filme longo");
        assertEquals(120.0f, movie.getDuration());
    }

    @Test
    void shouldReturnMediumCategory() {
        Movie movie = new Movie();
        movie.setCategory("Filme médio");
        assertEquals("Filme médio", movie.getCategory());
        assertEquals(90.0f, movie.getDuration());
    }

    @Test
    void shouldReturnShortCategory() {
        Movie movie = new Movie();
        movie.setCategory("Filme curto");
        assertEquals("Filme curto", movie.getCategory());
        assertEquals(30.0f, movie.getDuration());
    }

    @Test
    void shouldReturnOkCategory() {
        Movie movie = new Movie();
        movie.setCategory("Filme ok");
        assertEquals("Filme ok", movie.getCategory());
        assertEquals(60.0f, movie.getDuration());
    }
}
