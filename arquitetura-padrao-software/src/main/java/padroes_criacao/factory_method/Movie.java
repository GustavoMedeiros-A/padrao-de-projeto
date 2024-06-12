package padroes_criacao.factory_method;

public class Movie implements IMovieContent {

    public String start() {
        return "Start movie";
    }

    public String pause() {
        return "Pause movie";
    }
}
