package com.example.observerpattern.demo04;

public interface Subject {

    public  void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();

}
