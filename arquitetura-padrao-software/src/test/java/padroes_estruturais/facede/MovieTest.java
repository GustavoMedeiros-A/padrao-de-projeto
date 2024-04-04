package padroes_estruturais.facede;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieTest {

    @Test
    void shoudReturnSoundPendeciesRelease() {
        Movie movie = new Movie();
        Sound sound = Sound.getInstance();

        sound.addMovieWithPendecies(movie);

        assertEquals(true, movie.release());
    }

    @Test
    void shoudReturnVideoPendeciesRelease() {
        Movie movie = new Movie();
        Video video = Video.getInstance();

        video.addMovieWithPendecies(movie);

        assertEquals(true, movie.release());
    }

    @Test
    void shouldReturnRealeaseMovie() {
        Movie movie = new Movie();

        assertEquals(false, movie.release());
    }

}