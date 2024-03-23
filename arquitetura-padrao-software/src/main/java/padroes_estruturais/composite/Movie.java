package padroes_estruturais.composite;

public class Movie extends Category {

    private int stars;

    public Movie(String name, int stars) {
        super(name);
        this.stars = stars;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getCategory() {
        return "Movie: " + this.getName() + " - stars: " + this.stars + "\n";
    }

}
