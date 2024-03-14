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

}
