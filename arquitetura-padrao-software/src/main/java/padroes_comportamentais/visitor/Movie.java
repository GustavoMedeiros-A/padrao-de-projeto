package padroes_comportamentais.visitor;

public class Movie implements Streaming {

    private String name;
    private String description;

    public Movie(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String accept(Visitor visitor) {
        return visitor.showMovie(this);
    }

}
