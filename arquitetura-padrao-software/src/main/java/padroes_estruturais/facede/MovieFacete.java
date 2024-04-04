package padroes_estruturais.facede;

public class MovieFacete {

    public static boolean verifyMovieWithPendecies(Movie movie) {
        return Video.getInstance().verifyMovieWithPendecies(movie)
                || Sound.getInstance().verifyMovieWithPendecies(movie);
    }

}
