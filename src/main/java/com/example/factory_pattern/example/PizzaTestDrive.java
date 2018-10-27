package com.example.factory_pattern.example;

public class PizzaTestDrive {

	public static void main(String[] args) {
		System.out.println("16180600211-王伟");
		PizzaStore nyStore =new NYPizzaStore();
		PizzaStore chicagoStore =new ChicagoPizzaStore();
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a "+pizza.getName() + "\n");
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

	}

}
