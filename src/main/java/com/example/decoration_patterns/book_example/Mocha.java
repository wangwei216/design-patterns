package com.example.decoration_patterns.book_example;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        // TODO Auto-generated method stub
        return beverage.getDescription() + ",Mocha";
    }


    public double cost() {
        // TODO Auto-generated method stub
        return .20 + beverage.cost();
    }


}
