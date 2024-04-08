package padroes_criacao.builder;

public class MovieBuilder {

    private Movie movie;

    public MovieBuilder() {
        movie = new Movie();
    }

    public Movie build() {
        if (movie.getStars() > 5 || movie.getStars() < 0) {
            throw new IllegalArgumentException("Stars must be between 0 and 5");
        }
        if (movie.getName().equals("")) {
            throw new IllegalArgumentException("Invalid name");
        }

        return movie;
    }

    public MovieBuilder setName(String name) {
        movie.setName(name);
        return this;
    }

    public MovieBuilder setCategory(String category) {
        movie.setCategory(category);
        return this;
    }

    public MovieBuilder setStars(int stars) {
        movie.setStars(stars);
        return this;
    }

}
