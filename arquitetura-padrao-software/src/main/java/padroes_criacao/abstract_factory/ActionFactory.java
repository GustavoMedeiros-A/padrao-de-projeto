package padroes_criacao.abstract_factory;

public class ActionFactory implements AbstractFactory {

    @Override
    public Movie createMovie() {
        return new ActionMovie();
    }

    @Override
    public Category createCategory() {
        return new ActionCategory();
    }

}
