package com.example.decoration_patterns.demo;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        // TODO Auto-generated method stub
        return beverage.getDescription() + "--->加入了Whip";
    }


    public double cost() {
        // TODO Auto-generated method stub
        return .10 + beverage.cost();
    }

}
