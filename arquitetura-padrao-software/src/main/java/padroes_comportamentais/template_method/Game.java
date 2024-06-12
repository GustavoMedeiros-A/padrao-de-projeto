package padroes_comportamentais.template_method;

public abstract class Game {

    public final void play() {
        initializeGame();
        start();
        pause();
    }

    public String initializeGame() {
        return "Game init";
    }

    public String start() {
        return "Game start";
    }

    public String pause() {
        return "Game pause";
    }

    abstract String loadingGame();

}
