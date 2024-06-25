package padroes_comportamentais.state;

import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals("Available", book.getState());
    }

    @Test
    public void shouldChangeBookStatusToReserved() {
        assertTrue(book.reserve());
        assertEquals("Reserved", book.getState());
    }

    @Test
    public void shouldReservedBookAndThenLost() {
        assertTrue(book.reserve());
        assertEquals("Reserved", book.getState());
        assertTrue(book.lostBook());
        assertEquals("Book lost", book.getState());
    }

    @Test
    public void shouldChangeBookStatusToLostFromAvailable() {
        assertTrue(book.lostBook());
        assertEquals("Book lost", book.getState());
    }

    @Test
    public void shouldReturnBookToAvailableState() {
        assertTrue(book.reserve());
        assertEquals("Reserved", book.getState());
        assertTrue(book.returnBook());
        assertEquals("Available", book.getState());
    }

    @Test
    public void shouldNotReserveLostBook() {
        book.lostBook();
        assertEquals("Book lost", book.getState());
        assertFalse(book.reserve());
    }

    @Test
    public void shouldNotReturnAvailableBook() {
        assertFalse(book.returnBook());
    }

    @Test
    public void shouldNotReturnLostBook() {
        book.lostBook();
        assertEquals("Book lost", book.getState());
        assertFalse(book.returnBook());
    }

    @Test
    public void shouldNotMarkLostBookAsLostAgain() {
        book.lostBook();
        assertEquals("Book lost", book.getState());
        assertFalse(book.lostBook());
    }
}
