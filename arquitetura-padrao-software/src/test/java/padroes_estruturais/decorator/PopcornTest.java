package padroes_estruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PopcornTest {

    @Test
    void shouldReturnSmallPopcornPrice() {
        SmallPopcorn smallPopcorn = new SmallPopcorn(5.0f);
        assertEquals(5.0f, smallPopcorn.getPopcornPrice());
    }

    @Test
    void shouldReturnSmallPopcornStructure() {
        SmallPopcorn smallPopcorn = new SmallPopcorn(5.0f);
        assertEquals("SmallPopcorn", smallPopcorn.getStructure());
    }

    @Test
    void shouldReturnSweetPopcornPrice() {
        SmallPopcorn smallPopcorn = new SmallPopcorn(5.0f);
        SweetPopcorn sweetPopcorn = new SweetPopcorn(smallPopcorn);

        float expectedPrice = 5.0f * 1.10f; // base price * (1 + 10% increase)
        assertEquals(expectedPrice, sweetPopcorn.getPopcornPrice());
    }

    @Test
    void shouldReturnSweetPopcornStructure() {
        SmallPopcorn smallPopcorn = new SmallPopcorn(5.0f);
        SweetPopcorn sweetPopcorn = new SweetPopcorn(smallPopcorn);

        assertEquals("SmallPopcorn/SweetPopcorn", sweetPopcorn.getStructure());
    }

    @Test
    void shouldReturnSodaPopcornPrice() {
        SmallPopcorn smallPopcorn = new SmallPopcorn(5.0f);
        SodaPopcorn sodaPopcorn = new SodaPopcorn(smallPopcorn);

        float expectedPrice = 5.0f * 1.20f; // base price * (1 + 20% increase)
        assertEquals(expectedPrice, sodaPopcorn.getPopcornPrice());
    }

    @Test
    void shouldReturnSodaPopcornStructure() {
        SmallPopcorn smallPopcorn = new SmallPopcorn(5.0f);
        SodaPopcorn sodaPopcorn = new SodaPopcorn(smallPopcorn);

        assertEquals("SmallPopcorn/SodaPopcorn", sodaPopcorn.getStructure());
    }

    @Test
    void shouldReturnSweetAndSodaPopcornPrice() {
        SmallPopcorn smallPopcorn = new SmallPopcorn(5.0f);
        SweetPopcorn sweetPopcorn = new SweetPopcorn(smallPopcorn);
        SodaPopcorn sodaPopcorn = new SodaPopcorn(sweetPopcorn);

        float expectedPrice = 5.0f * 1.10f * 1.20f; // base price * (1 + 10% increase) * (1 + 20% increase)
        assertEquals(expectedPrice, sodaPopcorn.getPopcornPrice());
    }

    @Test
    void shouldReturnSweetAndSodaPopcornStructure() {
        SmallPopcorn smallPopcorn = new SmallPopcorn(5.0f);
        SweetPopcorn sweetPopcorn = new SweetPopcorn(smallPopcorn);
        SodaPopcorn sodaPopcorn = new SodaPopcorn(sweetPopcorn);

        assertEquals("SmallPopcorn/SweetPopcorn/SodaPopcorn", sodaPopcorn.getStructure());
    }
}
