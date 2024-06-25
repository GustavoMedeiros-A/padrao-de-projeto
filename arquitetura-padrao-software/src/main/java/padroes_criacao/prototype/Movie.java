package padroes_criacao.prototype;

public class Movie implements Cloneable {
    private String name;
    private Integer duration;
    private Category category;

    public Movie(String name, Integer duration, Category category) {
        this.name = name;
        this.duration = duration;
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public Movie clone() throws CloneNotSupportedException {
        Movie movieClone = (Movie) super.clone();
        movieClone.category = (Category) movieClone.category.clone();
        return movieClone;
    }

    @Override
    public String toString() {
        return "Movie {" +
                "name=" + name +
                ", duration=" + duration +
                ", category=" + category +
                '}';
    }

}
