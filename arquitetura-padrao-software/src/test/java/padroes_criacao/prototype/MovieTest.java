package padroes_criacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

        @Test
        void testMovie() throws CloneNotSupportedException {
                Movie movie = new Movie(
                                "Movie", 10,
                                new Category("Category1", "This is a category"));

                Movie movieClone = movie.clone();
                movieClone.setName("Movie2");
                movieClone.setDuration(20);
                movieClone.getCategory().setName("New category");
                movieClone.getCategory().setDescription("New description");

                assertEquals(
                                "Movie {" +
                                                "name=Movie, " +
                                                "duration=10, " +
                                                "category=Category{" +
                                                "name='Category1', " +
                                                "description='This is a category'}}",
                                movie.toString());

                assertEquals(
                                "Movie {" +
                                                "name=Movie2, " +
                                                "duration=20, " +
                                                "category=Category{" +
                                                "name='New category', " +
                                                "description='New description'}}",
                                movieClone.toString());
        };

        @Test
        void testMovieAgain() throws CloneNotSupportedException {
                // Create an original Movie object
                Movie movie = new Movie("Movie", 10, new Category("Category1", "This is a category"));

                // Clone the Movie object
                Movie movieClone = movie.clone();

                // Modify the cloned Movie and its Category
                movieClone.setName("Movie2");
                movieClone.setDuration(20);
                movieClone.getCategory().setName("New category");
                movieClone.getCategory().setDescription("New description");

                // Assert that the original Movie object remains unchanged
                assertEquals(
                                "Movie {name=Movie, duration=10, category=Category{name='Category1', description='This is a category'}}",
                                movie.toString());

                // Assert that the cloned Movie object reflects the changes
                assertEquals(
                                "Movie {name=Movie2, duration=20, category=Category{name='New category', description='New description'}}",
                                movieClone.toString());
        }
}