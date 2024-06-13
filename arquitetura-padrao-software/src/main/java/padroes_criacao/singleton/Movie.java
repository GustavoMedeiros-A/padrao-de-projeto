
package padroes_criacao.singleton;

public class Movie {

    private Movie() {
    }

    private static Movie instance;

    public static Movie getInstance() {
        if (instance == null) {
            instance = new Movie();
            instance.name = "Carros";
            instance.duration = 116;
        }
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