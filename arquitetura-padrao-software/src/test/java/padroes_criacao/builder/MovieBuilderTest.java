package padroes_criacao.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class MovieBuilderTest {

    private MovieBuilder movieBuilder;

    @BeforeEach
    void setUp() {
        movieBuilder = new MovieBuilder();
    }

    @Test
    void shouldBuildMovieWithValidAttributes() {
        Movie movie = movieBuilder
                .setName("Inception")
                .setCategory("Sci-Fi")
                .setStars(5)
                .build();

        assertEquals("Inception", movie.getName());
        assertEquals("Sci-Fi", movie.getCategory());
        assertEquals(5, movie.getStars());
    }

    @Test
    void shouldThrowExceptionForInvalidStarsGreaterThanFive() {
        assertThrows(IllegalArgumentException.class, () -> {
            movieBuilder
                    .setName("Inception")
                    .setCategory("Sci-Fi")
                    .setStars(6)
                    .build();
        });
    }

    @Test
    void shouldThrowExceptionForInvalidStarsLessThanZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            movieBuilder
                    .setName("Inception")
                    .setCategory("Sci-Fi")
                    .setStars(-1)
                    .build();
        });
    }

    @Test
    void shouldThrowExceptionForEmptyName() {
        assertThrows(IllegalArgumentException.class, () -> {
            movieBuilder
                    .setCategory("Sci-Fi")
                    .setStars(5)
                    .build();
        });
    }

    @Test
    void shouldSetName() {
        Movie movie = movieBuilder.setName("Inception").build();
        assertEquals("Inception", movie.getName());
    }

    @Test
    void shouldSetCategory() {
        Movie movie = movieBuilder
                .setName("Inception")
                .setCategory("Sci-Fi")
                .build();
        assertEquals("Sci-Fi", movie.getCategory());
    }

    @Test
    void shouldSetStars() {
        Movie movie = movieBuilder
                .setName("Inception")
                .setStars(4)
                .build();
        assertEquals(4, movie.getStars());
    }
}