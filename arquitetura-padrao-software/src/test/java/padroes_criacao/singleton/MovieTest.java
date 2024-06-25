package padroes_criacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest {

    @Test
    public void shouldReturnSameInstance() {
        Movie instance1 = Movie.getInstance();
        Movie instance2 = Movie.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    public void shouldReturnMovieName() {
        assertEquals("Carros", Movie.getInstance().getNameMovie());
    }

    @Test
    public void shouldReturnMovieDuration() {
        assertEquals(116, Movie.getInstance().getDuration());
    }

    @Test
    public void shouldSetAndReturnMovieName() {
        Movie.getInstance().setNameMovie("Toy Story");
        assertEquals("Toy Story", Movie.getInstance().getNameMovie());

        // Resetting the name to the original for other tests
        Movie.getInstance().setNameMovie("Carros");
    }

    @Test
    public void shouldSetAndReturnMovieDuration() {
        Movie.getInstance().setDuration(90);
        assertEquals(90, Movie.getInstance().getDuration());

        // Resetting the duration to the original for other tests
        Movie.getInstance().setDuration(116);
    }
}
