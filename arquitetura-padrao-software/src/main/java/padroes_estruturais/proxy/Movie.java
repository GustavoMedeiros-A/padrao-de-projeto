package padroes_estruturais.proxy;

import java.util.Arrays;
import java.util.List;

public class Movie implements IMovie {

    private Integer id;
    private String name;
    private String description;
    private String link;

    public Movie(int id) {
        this.id = id;
        Movie object = Database.getMovie(id);
        this.name = object.name;
        this.description = object.description;
        this.link = object.link;
    }

    public Movie(Integer id, String name, String description, String link) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.link = link;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public List<String> getInformation() {
        return Arrays.asList(this.name, this.description);
    }

    @Override
    public List<String> watchMovie(User user) {
        return Arrays.asList(this.link);
    }

}
