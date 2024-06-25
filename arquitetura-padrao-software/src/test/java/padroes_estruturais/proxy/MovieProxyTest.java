package padroes_estruturais.proxy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MovieProxyTest {

    @BeforeEach
    void setUp() {
        var test = new Database();
        Database.addMovie(new Movie(1, "Duna", "Description", "link"));
        Database.addMovie(new Movie(2, "Duna2", "Description2", "link2"));
        Database.addMovie(new Movie(3, "Duna2", "Description2", "link2"));
        Database.addMovie(new Movie(4, "Duna2", "Description2", "link2"));
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

    @Test
    void shouldNotAllowNonAdultUserToWatchMovieUsingProxy() {
        User nonAdultUser = new User("Jane Doe", false);
        MovieProxy movieProxy = new MovieProxy(3);
        assertNull(movieProxy.getMovie());

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            movieProxy.watchMovie(nonAdultUser);
        });

        assertNull(movieProxy.getMovie()); // Movie should not be instantiated due to exception
        assertEquals("User não autorizado", exception.getMessage());
    }

    @Test
    void shouldReturnMovieInformationUsingProxy() {
        MovieProxy movieProxy = new MovieProxy(1);
        assertNull(movieProxy.getMovie());

        List<String> info = movieProxy.getInformation();
        assertNotNull(movieProxy.getMovie());
        assertEquals(2, info.size());
    }

    @Test
    void shouldAllowAdultUserToWatchMovieUsingProxy() {
        User adultUser = new User("John Doe", true);
        MovieProxy movieProxy = new MovieProxy(2);
        assertNull(movieProxy.getMovie());

        List<String> watchInfo = movieProxy.watchMovie(adultUser);
        assertNotNull(movieProxy.getMovie());
        assertEquals(1, watchInfo.size());
        assertEquals("link2", watchInfo.get(0));
    }

    @Test
    void shouldLazyLoadMovieUsingProxyInGetInformation() {
        MovieProxy movieProxy = new MovieProxy(4);
        assertNull(movieProxy.getMovie());

        movieProxy.getInformation();
        assertNotNull(movieProxy.getMovie());
    }

    @Test
    void shouldLazyLoadMovieUsingProxyInWatchMovie() {
        User adultUser = new User("John Doe", true);
        MovieProxy movieProxy = new MovieProxy(4);
        assertNull(movieProxy.getMovie());

        movieProxy.watchMovie(adultUser);
        assertNotNull(movieProxy.getMovie());
    }

}
