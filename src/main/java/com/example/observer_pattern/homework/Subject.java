package com.example.observer_pattern.homework;


public interface Subject {

    public  void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();

}
