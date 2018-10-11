package com.example.observerpattern.demo04;

import java.util.ArrayList;

public class WeatherData  implements Subject {

    private ArrayList observers;

    private float tempearture;

    private float presure;

    private float humidity;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {

        observers.add(observer);
        System.out.println("说明添加了一个新的观察者对象"+observer.getClass().toString());
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observers);
        if(i>=0){
            observers.remove(i);
        }
    }

    //这个是通知每一个观察者对象，使用notify对象
    @Override
    public void notifyObserver() {
        for (int i=0 ;i<observers.size();i++){
            //分别拿到每一个对象
            Observer o = (Observer) observers.get(i);
            o.update(tempearture,humidity,presure);
        }
    }


    //如果气象站更新观察值时，就更新
    public void measureChanged(){
        System.out.println("说明气象站有变化！！！");
        notifyObserver();
    }

    public void setMeasureMents(float temp, float humitdity, float pressure){
        this.humidity = humitdity;
        this.presure = pressure;
        this.tempearture =temp;
        measureChanged();
    }


}
