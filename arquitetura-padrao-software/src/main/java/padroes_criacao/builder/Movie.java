package padroes_criacao.builder;

public class Movie {

    private int stars;
    private String name;
    private String category;

    public Movie() {
        this.stars = 0;
        this.name = "";
        this.category = "";
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}