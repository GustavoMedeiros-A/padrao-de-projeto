package padroes_criacao.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovieBuilderTest {

    @Test
    void shouldReturnExceptionToInvalidStars() {
        try {
            MovieBuilder movieBuilder = new MovieBuilder();
            Movie movie = movieBuilder
                    .setName("Duna")
                    .setStars(10)
                    .setCategory("Action")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Stars must be between 0 and 5", e.getMessage());
        }
    }

    @Test
    void shouldReturnExceptionToInvalidName() {
        try {
            MovieBuilder movieBuilder = new MovieBuilder();
            Movie movie = movieBuilder
                    .setName("")
                    .setStars(4)
                    .setCategory("Action")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid name", e.getMessage());
        }
    }

    @Test
    void shouldReturnValidName() {
        MovieBuilder movieBuilder = new MovieBuilder();
        Movie movie = movieBuilder
                .setName("Duna")
                .setStars(4)
                .setCategory("Action")
                .build();

        assertNotNull(movie);

    }

}
