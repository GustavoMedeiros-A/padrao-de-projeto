package padroes_comportamentais.visitor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StreamingVisitorTest {

    @Test
    void shouldShowMovie() {
        Movie movie = new Movie("Duna", "Is a movie");
        StreamingVisitor streamingVisitor = new StreamingVisitor();

        assertEquals("Movie: Duna Description: Is a movie", streamingVisitor.showMovie(movie));
    }

    @Test
    void shouldShowDocumentary() {
        Documentary documentary = new Documentary("AnimalsPlanet", 40.0);
        StreamingVisitor streamingVisitor = new StreamingVisitor();

        assertEquals("Documentary: AnimalsPlanet Duration: 40.0", streamingVisitor.showDocumentary(documentary));
    }

    @Test
    void shouldAcceptVisitorForMovie() {
        Movie movie = new Movie("Duna", "Is a movie");
        StreamingVisitor streamingVisitor = new StreamingVisitor();

        assertEquals("Movie: Duna Description: Is a movie", movie.accept(streamingVisitor));
    }

    @Test
    void shouldAcceptVisitorForDocumentary() {
        Documentary documentary = new Documentary("AnimalsPlanet", 40.0);
        StreamingVisitor streamingVisitor = new StreamingVisitor();

        assertEquals("Documentary: AnimalsPlanet Duration: 40.0", documentary.accept(streamingVisitor));
    }
}
