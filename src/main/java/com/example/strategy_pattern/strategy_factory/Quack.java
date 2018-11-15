package com.example.strategy_pattern.strategy_factory;

public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("Quack");
	}
}
