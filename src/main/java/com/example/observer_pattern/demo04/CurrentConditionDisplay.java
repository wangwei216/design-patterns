package com.example.observer_pattern.demo04;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    //把接口主题对象当做属性注入进来
    private Subject weatherData;

    private float humitdity;

    private float temp;
    private float pressure;


    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前气候条件温度：" + temp + "当前气候湿度为：" + humitdity + "当前气候条件的压强为：" + pressure);
    }

    @Override
    public void update(float temp, float humitdity, float pressure) {
        this.humitdity = humitdity;
        this.temp = temp;
        this.pressure = pressure;
        display();
    }
}
