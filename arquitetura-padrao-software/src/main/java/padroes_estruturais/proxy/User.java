package padroes_estruturais.proxy;

public class User {

    private String name;
    private boolean adult;

    public User(String name, boolean adult) {
        this.name = name;
        this.adult = adult;
    }

    public boolean isAdult() {
        return adult;
    }

}
