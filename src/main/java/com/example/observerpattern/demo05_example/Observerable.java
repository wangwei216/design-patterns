package com.example.observerpattern.demo05_example;

public interface Observerable {

        public void registerObserver(Observer o);
        public void removeObserver(Observer o);
        public void notifyObserver();


}
