package padroes_comportamentais.visitor;

public interface Streaming {
    String accept(Visitor visitor);
}