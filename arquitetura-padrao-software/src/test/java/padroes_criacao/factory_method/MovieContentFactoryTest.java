package padroes_criacao.factory_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class MovieContentFactoryTest {

    @Test
    void shouldReturnExceptionToNonexistentContent() {
        try {
            IMovieContent content = MovieContentFactory.getContent("IsNotAContent");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("nonexistent content", e.getMessage());
        }
    }

    @Test
    void shouldReturnExceptionToInvalidContent() {
        try {
            IMovieContent content = MovieContentFactory.getContent("Video");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("invalid content", e.getMessage());
        }
    }

}
