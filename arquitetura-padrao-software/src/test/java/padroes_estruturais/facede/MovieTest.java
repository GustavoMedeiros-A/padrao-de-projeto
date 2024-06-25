package padroes_estruturais.facede;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

class MovieTest {

    private Movie movie;
    private Sound sound;
    private Video video;

    @BeforeEach
    void setUp() {
        var test = new MovieFacete();
        movie = new Movie();
        sound = Sound.getInstance();
        video = Video.getInstance();

        sound.addMovieWithPendecies(new Movie());
        video.addMovieWithPendecies(new Movie());
    }

    @Test
    void shouldReleaseMovieWhenNoPendingIssues() {
        assertFalse(movie.release());
    }

    @Test
    void shouldNotReleaseMovieWhenPendingIssuesInSound() {
        sound.addMovieWithPendecies(movie);

        assertTrue(movie.release());
    }

    @Test
    void shouldNotReleaseMovieWhenPendingIssuesInVideo() {
        video.addMovieWithPendecies(movie);

        assertTrue(movie.release());
    }

    @Test
    void shouldNotReleaseMovieWhenPendingIssuesInBothSoundAndVideo() {
        sound.addMovieWithPendecies(movie);
        video.addMovieWithPendecies(movie);

        assertTrue(movie.release());
    }

}