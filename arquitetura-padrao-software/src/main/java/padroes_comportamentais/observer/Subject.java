package padroes_comportamentais.observer;

public interface Subject {
    void addObserver(Observer obs);

    void notifyObserver();
}