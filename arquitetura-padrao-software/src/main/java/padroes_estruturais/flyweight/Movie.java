package padroes_estruturais.flyweight;

public class Movie {

    private String name;
    private Category movieCategory;

    public Movie(String name, Category movieCategory) {
        this.name = name;
        this.movieCategory = movieCategory;
    }

    public String getMovie() {
        return "Movie{" +
                "name='" + this.name + '\'' +
                ", category='" + movieCategory.getName() + '\'' +
                ", description='" + movieCategory.getDescription() + '\'' +
                '}';
    }

}
