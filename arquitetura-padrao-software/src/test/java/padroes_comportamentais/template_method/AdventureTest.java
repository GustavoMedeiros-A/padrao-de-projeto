package padroes_comportamentais.template_method;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AdventureTest {

    @Test
    void shouldInitGame() {
        Adventure adventure = new Adventure();
        assertEquals("Game init", adventure.initializeGame());
    }

    @Test
    void shouldStartGame() {
        Adventure adventure = new Adventure();
        assertEquals("Game start", adventure.start());
    }

    @Test
    void shouldPauseGame() {
        Adventure adventure = new Adventure();
        assertEquals("Game pause", adventure.pause());
    }

    @Test
    void shouldLoadingAdventureGame() {
        var adventure = new Adventure();
        assertEquals("Loading adventure storyline and characters...", adventure.loadingGame());
    }
}
