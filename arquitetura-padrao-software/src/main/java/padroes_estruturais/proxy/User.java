package padroes_estruturais.proxy;

public class User {

    private String name;
    private boolean adult;

    public User(String name, boolean adult) {
        this.name = name;
        this.adult = adult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }
}
