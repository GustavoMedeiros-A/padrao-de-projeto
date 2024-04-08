package padroes_criacao.factory_method;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContentMovieTest {

    @Test
    void shouldStartMovie() {
        IMovieContent movie = MovieContentFactory.getContent("Movie");
        assertEquals("Start movie", movie.start());
    }

    @Test
    void shouldPauseMovie() {
        IMovieContent movie = MovieContentFactory.getContent("Movie");
        assertEquals("Pause movie", movie.pause());
    }
}
