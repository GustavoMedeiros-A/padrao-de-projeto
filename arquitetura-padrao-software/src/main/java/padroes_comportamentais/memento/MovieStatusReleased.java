package padroes_comportamentais.memento;

public class MovieStatusReleased implements MovieStatus {

    public MovieStatusReleased() {
    }

    private static MovieStatusReleased instance = new MovieStatusReleased();

    public static MovieStatusReleased getInstance() {
        return instance;
    }

    public String getStatusName() {
        return "Released";
    }
}