package com.example.decoration_patterns.book_example;

public abstract class Beverage {
	String description ="Unkonwn Beverage";
	public String getDescription(){
		return description;
	}
	public abstract double cost();

//	public abstract Beverage creatCoffee(String type);

}
