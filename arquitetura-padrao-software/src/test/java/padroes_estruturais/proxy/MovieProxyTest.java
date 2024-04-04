package padroes_estruturais.proxy;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MovieProxyTest {

    @BeforeEach
    void setUp() {
        Database.addMovie(new Movie(1, "Duna", "Description", "link"));
        Database.addMovie(new Movie(2, "Duna2", "Description2", "link2"));
    }

    @Test
    void shouldReturnInformationMovie() {
        MovieProxy proxy = new MovieProxy(1);

        assertEquals(Arrays.asList("Duna", "Description"), proxy.getInformation());
    }

    @Test
    void shouldReturnLink() {
        var user = new User("Daris", true);
        MovieProxy proxy = new MovieProxy(1);

        assertEquals(Arrays.asList("link"), proxy.watchMovie(user));
    }

    @Test
    void shouldNotReturnLink() {
        try {
            var user = new User("Bruno", false);
            MovieProxy proxy = new MovieProxy(1);
            proxy.watchMovie(user);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("User não autorizado", e.getMessage());
        }

    }

}
