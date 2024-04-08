package padroes_criacao.factory_method;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContentTvShow {
    @Test
    void shouldStartTvShow() {
        IMovieContent tvShow = MovieContentFactory.getContent("TVShow");
        assertEquals("Start TVShow", tvShow.start());
    }

    @Test
    void shouldPauseTvShow() {
        IMovieContent tvShow = MovieContentFactory.getContent("TVShow");
        assertEquals("Pause TVShow", tvShow.pause());
    }
}
