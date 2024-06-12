package padroes_comportamentais.memento;

public class MovieStatusOscar implements MovieStatus {

    public MovieStatusOscar() {
    }

    private static MovieStatusOscar instance = new MovieStatusOscar();

    public static MovieStatusOscar getInstance() {
        return instance;
    }

    public String getStatusName() {
        return "Oscar";
    }
}
