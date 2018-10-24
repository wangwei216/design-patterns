package com.example.factory_pattern;

public class ChicagoStyleCheesePizza extends Pizza{
	public  ChicagoStyleCheesePizza(){
		name ="Chicago Style Deep Dish Cheese Pizza";
		dough="Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("shredded Mozzarella cheese");
	}
	void cut(){
		System.out.println("Cutting the piza into square slices");
	}

}
