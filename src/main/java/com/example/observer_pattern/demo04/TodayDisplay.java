package com.example.observer_pattern.demo04;

public class TodayDisplay implements Observer,DisplayElement{


    private float humitdity;

    private float temp;
    private float pressure;

    @Override
    public void update(float temp, float humitdity, float pressure) {
        System.out.println("气象站又有新数据更新了！！！");
        this.humitdity = humitdity;
        this.temp = temp;
        this.pressure =pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("当前气候条件温度："+temp+"当前气候湿度为："+humitdity+"当前气候条件的压强为："+pressure);
    }
}
