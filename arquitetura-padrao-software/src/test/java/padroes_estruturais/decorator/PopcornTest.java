package padroes_estruturais.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PopcornTest {

    @Test
    void shouldReturnPopcornPrice() {
        Popcorn popcorn = new SmallPopcorn(1000.0f);

        assertEquals(1000.f, popcorn.getPopcornPrice());
    }

    @Test
    void shouldReturnPopcornPriceWithSweet() {
        Popcorn popcorn = new SweetPopcorn(new SmallPopcorn(1000.0f));

        assertEquals(1100.f, popcorn.getPopcornPrice());
    }

    @Test
    void shouldReturnPopcornPriceWithSoda() {
        Popcorn popcorn = new SodaPopcorn(new SmallPopcorn(1000.0f));

        assertEquals(1200.f, popcorn.getPopcornPrice());
    }

    @Test
    void shouldReturnPopcornPriceWithSodaAndSweet() {
        Popcorn popcorn = new SodaPopcorn(new SweetPopcorn(new SmallPopcorn(1000.0f)));

        assertEquals(1320.f, popcorn.getPopcornPrice());
    }

    @Test
    void shouldReturnPopcornStructure() {
        Popcorn popcorn = new SmallPopcorn();

        assertEquals("SmallPopcorn", popcorn.getStructure());
    }

    @Test
    void shouldReturnPopcornStructureWithSweet() {
        Popcorn popcorn = new SweetPopcorn(new SmallPopcorn());
        assertEquals("SmallPopcorn/SweetPopcorn", popcorn.getStructure());
    }

    @Test
    void shouldReturnPopcornStructureWithSoda() {
        Popcorn popcorn = new SweetPopcorn(new SmallPopcorn());
        assertEquals("SmallPopcorn/SweetPopcorn", popcorn.getStructure());
    }

    @Test
    void shouldReturnPopcornStructureWithSweetAndSoda() {
        Popcorn popcorn = new SweetPopcorn(new SodaPopcorn(new SmallPopcorn()));
        assertEquals("SmallPopcorn/SodaPopcorn/SweetPopcorn", popcorn.getStructure());
    }
}
