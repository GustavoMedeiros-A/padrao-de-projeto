package padroes_estruturais.proxy;

import java.util.List;

public class MovieProxy implements IMovie {

    private Movie movie;
    private Integer id;

    public MovieProxy(int id) {
        this.id = id;
    }

    @Override
    public List<String> getInformation() {
        if (this.movie == null) {
            this.movie = new Movie(this.id);
        }
        return this.movie.getInformation();
    }

    @Override
    public List<String> watchMovie(User user) {
        if (!user.isAdult()) {
            throw new IllegalArgumentException("User não autorizado");
        }
        if (this.movie == null) {
            this.movie = new Movie(this.id);
        }
        return this.movie.watchMovie(user);
    }
}
