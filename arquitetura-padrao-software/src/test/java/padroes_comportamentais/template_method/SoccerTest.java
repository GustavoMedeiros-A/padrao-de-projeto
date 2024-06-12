package padroes_comportamentais.template_method;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SoccerTest {
    @Test
    void shouldInitGame() {
        Soccer soccer = new Soccer();
        assertEquals("Game init", soccer.initializeGame());
    }

    @Test
    void shouldStartGame() {
        Soccer soccer = new Soccer();
        assertEquals("Game start", soccer.start());
    }

    @Test
    void shouldPauseGame() {
        Soccer soccer = new Soccer();
        assertEquals("Game pause", soccer.pause());
    }

    @Test
    void shouldLoadingSoccerGame() {
        Soccer soccer = new Soccer();
        assertEquals("Setting up soccer field and teams...", soccer.loadingGame());
    }
}
