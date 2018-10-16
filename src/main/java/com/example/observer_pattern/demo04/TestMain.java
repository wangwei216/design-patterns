package com.example.observer_pattern.demo04;

public class TestMain {

    public static void main(String[] args){
        //首先实例出来气象站对象
        WeatherData weatherData = new WeatherData();
        //然后定义气象站发布模板
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        //一个新的测试对象
        TodayDisplay todayDisplay = new TodayDisplay();
        //为模板注入值
        weatherData.setMeasureMents(80,65,80);


        weatherData.registerObserver(todayDisplay);
        weatherData.setMeasureMents(100,100,100);
    }

}
