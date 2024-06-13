package padroes_comportamentais.state;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookTest {
    Book book;

    @BeforeEach
    void setUp() {
        book = new Book("Duna");
    }

    @Test
    public void shouldCreateBookWithDefaultState() {
        assertEquals(book.getState(), "Available");
    }

    @Test
    public void shouldChangeBookStatusToReserved() {
        book.reserve();
        assertEquals(book.getState(), "Reserved");
    }

    @Test
    public void shouldReservedBookAndThenLost() {
        book.reserve();
        book.lostBook();
        assertEquals(book.getState(), "Book lost");
    }
}
