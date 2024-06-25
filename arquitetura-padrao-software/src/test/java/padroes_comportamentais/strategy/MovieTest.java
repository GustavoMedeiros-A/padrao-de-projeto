package padroes_comportamentais.strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MovieTest {

    @Test
    void shouldApplyKidsDiscount() {
        Movie movie = new Movie("Duna", 100.0);

        movie.setDiscountStrategy(new KidsDiscount());
        assertEquals(90.00, movie.calculationPriceWithDiscount(movie.getPrice()));
    }

    @Test
    void shouldApplySeniorDiscount() {
        Movie movie = new Movie("Duna", 100.0);

        movie.setDiscountStrategy(new SeniorDiscount());
        assertEquals(70.00, movie.calculationPriceWithDiscount(movie.getPrice()));
    }

    @Test
    void shouldApplyStudentDiscount() {
        Movie movie = new Movie("Duna", 100.0);

        movie.setDiscountStrategy(new StudentDiscount());
        assertEquals(80.00, movie.calculationPriceWithDiscount(movie.getPrice()));
    }

    @Test
    void shouldReturnOriginalPriceWhenNoDiscountStrategy() {
        Movie movie = new Movie("Duna", 100.0);

        assertEquals(100.00, movie.calculationPriceWithDiscount(movie.getPrice()));
    }

}
