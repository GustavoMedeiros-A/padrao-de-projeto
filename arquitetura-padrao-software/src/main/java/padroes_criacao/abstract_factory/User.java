package padroes_criacao.abstract_factory;

public class User {

    private Movie lastWatched;
    private Category interested;

    public User(AbstractFactory factory) {
        this.lastWatched = factory.createMovie();
        this.interested = factory.createCategory();
    }

    public String showMovie() {
        return this.lastWatched.show();
    }

    public String showCategory() {
        return this.interested.show();
    }

}
