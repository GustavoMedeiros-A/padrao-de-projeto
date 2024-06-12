package padroes_comportamentais.observer;

import java.util.ArrayList;
import java.util.List;

public class Catalog implements Subject {

    private final List<Observer> observers;
    private String name;

    public Catalog() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(name);
        }
    }

}
