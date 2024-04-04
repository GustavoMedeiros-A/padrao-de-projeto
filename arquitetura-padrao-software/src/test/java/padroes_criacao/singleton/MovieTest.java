package padroes_criacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest {
    @Test
    public void shouldReturnMovieName() {
        System.out.println(Movie.getInstance().getNameMovie());
        assertEquals("Carros", Movie.getInstance().getNameMovie());
    }

    @Test
    public void shouldReturnMovieDuration() {

        assertEquals(116, Movie.getInstance().getDuration());
    }
}
