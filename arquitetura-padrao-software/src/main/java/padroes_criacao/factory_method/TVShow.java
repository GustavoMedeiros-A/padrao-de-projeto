package padroes_criacao.factory_method;

public class TVShow implements IMovieContent {

    public String start() {
        return "Start TVShow";
    }

    public String pause() {
        return "Pause TVShow";
    }

}
