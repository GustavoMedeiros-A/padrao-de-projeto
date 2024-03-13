
package padrao_criacao.singleton;

public class Movie {

    public Movie() {
        getInstance().name = "Carros";
        getInstance().duration = 116;
    }

    private static Movie instance = new Movie(

    );

    public static Movie getInstance() {
        return instance;
    }

    private String name;
    private Integer duration;

    public String getNameMovie() {
        return name;
    }

    public void setNameMovie(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}