package com.example.decoration_patterns.book_example;

public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage beverage){
    	this.beverage=beverage;
    }
    
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ",Soy";
	}


	public double cost() {
		// TODO Auto-generated method stub
		return .15 + beverage.cost();
	}



}
