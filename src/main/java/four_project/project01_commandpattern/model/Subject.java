package four_project.project01_commandpattern.model;

import four_project.project01_commandpattern.view.Observer;

import java.util.ArrayList;

public abstract class Subject {

    protected ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public abstract void notifyAllObservers();

}
