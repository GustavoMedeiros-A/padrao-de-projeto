package padroes_estruturais.composite;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StreamingTest {

    @Test
    void shouldReturnAStreamingWithCatalog() {
        Award award1 = new Award("Best Action Movie");

        Award award2 = new Award("Best Fiction Movie");
        Movie duna = new Movie("Duna Parte 1", 4);
        Movie duna2 = new Movie("Duna Parte 2", 5);

        award2.addCategory(duna);
        award2.addCategory(duna2);

        Award catalog = new Award("Best Movie All Categories");

        catalog.addCategory(award1);
        catalog.addCategory(award2);

        System.err.println(catalog);

        Streaming streaming = new Streaming();
        streaming.setCatalog(catalog);

        assertEquals("Award: Best Movie All Categories\n" +
                "Award: Best Action Movie\n" +
                "Award: Best Fiction Movie\n" +
                "Movie: Duna Parte 1 - stars: 4\n" +
                "Movie: Duna Parte 2 - stars: 5\n", streaming.getCatalog());
    }

    @Test
    void shouldReturnAStreamingWithouCatalog() {
        try {
            Streaming streaming = new Streaming();
            streaming.getCatalog();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Streaming without catalog", e.getMessage());
        }
    }

}
