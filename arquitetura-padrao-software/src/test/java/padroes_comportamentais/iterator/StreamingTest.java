package padroes_comportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamingTest {

    @Test
    void shouldCountAllHorrorCategory() {
        Movie movie = new Movie(
                new Category("KarateKid", false),
                new Category("Duna", false),
                new Category("Star Wars", false),
                new Category("Invocação do mal", true));

        assertEquals(1, Streaming.countHorrorCategoryMovie(movie));
    }

    @Test
    void shouldCountAllCategories() {
        Movie movie = new Movie(
                new Category("KarateKid", false),
                new Category("Duna", false),
                new Category("Star Wars", false),
                new Category("Invocação do mal", false));

        assertEquals(4, Streaming.countCategoryMovie(movie));
    }

}
