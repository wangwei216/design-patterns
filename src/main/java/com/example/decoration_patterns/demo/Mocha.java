package com.example.decoration_patterns.demo;

public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage beverage){
    	this.beverage=beverage;
    }

	public String getDescription() {

		return beverage.getDescription()+"---->加入了Mocha";
	}

	
	public double cost() {
		return 1.5 + beverage.cost();
	}

}
