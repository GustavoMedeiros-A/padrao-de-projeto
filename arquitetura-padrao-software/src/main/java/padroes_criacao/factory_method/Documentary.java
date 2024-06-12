package padroes_criacao.factory_method;

public class Documentary implements IMovieContent {

    public String start() {
        return "Start documentary";
    }

    public String pause() {
        return "Pause documentary";
    }
}
