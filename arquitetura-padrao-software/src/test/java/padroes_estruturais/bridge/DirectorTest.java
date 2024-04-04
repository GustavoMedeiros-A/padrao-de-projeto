package padroes_estruturais.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectorTest {

    @Test
    void shouldReturnDirectorOfKidsMovies() {
        ICategory ICategory = new Kids();
        Director director = new Director(1000);
        director.setCategory(ICategory);
        assertEquals(1200, director.calcSalary(), 0.01f);
    }

    @Test
    void shouldReturnDirectorOfActionMovie() {
        ICategory ICategory = new Action();
        Director director = new Director(1000);
        director.setCategory(ICategory);
        assertEquals(1700, director.calcSalary(), 0.01f);
    }

    @Test
    void shouldReturnDirectorOfHorrorMovie() {
        ICategory ICategory = new Horror();
        Director director = new Director(1000);
        director.setCategory(ICategory);
        assertEquals(2500, director.calcSalary(), 0.01f);
    }
}