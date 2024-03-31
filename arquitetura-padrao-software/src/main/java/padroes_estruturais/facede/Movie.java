package padroes_estruturais.facede;

public class Movie {

    public boolean release() {
        return MovieFacete.verifyMovieWithPendecies(this);
    }
}