package com.example.decoration_patterns.demo;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {

        return beverage.getDescription() + "--->加入了Soy";
    }


    public double cost() {
        return 10 + beverage.cost();
    }

}
