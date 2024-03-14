package Org.CCristian.Patrones.Observer;

import java.util.ArrayList;
import java.util.List;

abstract public class Subject_Observable {
/*--------------ATRIBUTOS--------------*/
    protected List<Observer> observers = new ArrayList<>();
/*--------------MÉTODOS--------------*/
    public void addObservers(Observer observer){
        observers.add(observer);
    }

    public void removeObservers(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer: this.observers){
            observer.update(this);
        }
    }
}
