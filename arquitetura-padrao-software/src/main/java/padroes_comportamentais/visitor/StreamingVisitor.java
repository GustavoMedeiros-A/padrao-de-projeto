package padroes_comportamentais.visitor;

public class StreamingVisitor implements Visitor {

    @Override
    public String showMovie(Movie movie) {
        return "Movie: " + movie.getName() + " Description: " + movie.getDescription();
    }

    @Override
    public String showDocumentary(Documentary documentary) {
        return "Documentary: " + documentary.getName() + " Duration: " + documentary.getDuration();
    }

}
