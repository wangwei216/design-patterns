package com.example.factory_pattern.example;

public class NYPizzaStore extends PizzaStore {
	Pizza createPizza(String item){
		if(item.equals("cheese")){
			return new NYstyleCheesePizza();
	     } else if(item.equals("veggie")){
			return new NYstyleCheesePizza();
			}
	     else if(item.equals("clam")){
				return new NYstyleClamPizza();
				}
	     else if(item.equals("pepperoni")){
				return new NYstyleCheesePizza();
				}
	     else return null;
		

	}
}
