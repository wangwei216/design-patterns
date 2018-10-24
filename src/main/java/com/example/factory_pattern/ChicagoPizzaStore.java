package com.example.factory_pattern;

public class ChicagoPizzaStore extends PizzaStore {
	Pizza createPizza(String item){
		if(item.equals("cheese")){
			return new ChicagoStyleCheesePizza();
	     } else if(item.equals("veggie")){
			return new ChicagostyleVeggiePizza();
			}
	     else if(item.equals("clam")){
				return new ChicagoStyleCheesePizza();
				}
	     else if(item.equals("pepperoni")){
				return new ChicagostyleVeggiePizza();
				}
	     else return null;
		

	}
	

}
