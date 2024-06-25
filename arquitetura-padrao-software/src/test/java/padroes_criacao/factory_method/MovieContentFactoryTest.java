package padroes_criacao.factory_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

public class MovieContentFactoryTest {

    @Test
    void shouldReturnMovieInstance() {
        var test = new MovieContentFactory();
        IMovieContent content = MovieContentFactory.getContent("Movie");
        assertEquals("Start movie", content.start());
        assertEquals("Pause movie", content.pause());
    }

    @Test
    void shouldReturnDocumentaryInstance() {
        IMovieContent content = MovieContentFactory.getContent("Documentary");
        assertEquals("Start documentary", content.start());
        assertEquals("Pause documentary", content.pause());
    }

    @Test
    void shouldReturnExceptionToNonexistentContent() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MovieContentFactory.getContent("IsNotAContent");
        });
        assertEquals("nonexistent content", exception.getMessage());
    }

}
