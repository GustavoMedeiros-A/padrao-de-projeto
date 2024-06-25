package padroes_criacao.factory_method;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DocumentaryTest {
    @Test
    void shouldStartDocumentary() {
        IMovieContent documentary = MovieContentFactory.getContent("Documentary");
        assertEquals("Start documentary", documentary.start());
    }

    @Test
    void shouldPauseDocumentary() {
        IMovieContent documentary = MovieContentFactory.getContent("Documentary");
        assertEquals("Pause documentary", documentary.pause());
    }
}
