package com.example.observerpattern.homework;


public interface Subject {

    public  void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();

}
