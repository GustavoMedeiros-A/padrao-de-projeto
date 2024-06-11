package padroes_comportamentais.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class StreamingVisitorTest {

    @Test
    void shouldShowMovie() {
        var movie = new Movie("Duna", "Is a movie");
        var streamingVisitor = new StreamingVisitor();

        assertEquals("Movie: Duna Description: Is a movie", streamingVisitor.showMovie(movie));
    }

    @Test
    void shouldShowDocumentary() {
        var documentary = new Documentary("AnimalsPlanet", 40.0);
        var streamingVisitor = new StreamingVisitor();

        assertEquals("Documentary: AnimalsPlanet Duration: 40.0", streamingVisitor.showDocumentary(documentary));
    }

}
