package padroes_criacao.abstract_factory;

public class ComedyFactory implements AbstractFactory {

    @Override
    public Movie createMovie() {
        return new ComedyMovie();
    }

    @Override
    public Category createCategory() {
        return new ComedyCategory();
    }

}
