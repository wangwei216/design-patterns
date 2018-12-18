package com.example.factory_pattern.example;

public class PizzaTestDrive {

    public static void main(String[] args) {
        System.out.println("16180600211-王伟");

        ChicagoPizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza chicagostyleVeggiePizza =
                (ChicagostyleVeggiePizza) chicagoStore.createPizza(ChicagostyleVeggiePizza.class);
        chicagostyleVeggiePizza.cut();
        chicagostyleVeggiePizza.prepare();
        chicagostyleVeggiePizza.bake();
        System.out.println();

        Pizza chicagoStyleCheesePizza =
                (ChicagoStyleCheesePizza) chicagoStore.createPizza(ChicagoStyleCheesePizza.class);
        chicagoStyleCheesePizza.cut();
        chicagoStyleCheesePizza.prepare();
        chicagoStyleCheesePizza.bake();
        System.out.println("我是------->" + chicagoStyleCheesePizza.getName() + "Pizza");

        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        NYstyleCheesePizza nystyleCheesePizza = (NYstyleCheesePizza) nyPizzaStore.createPizza(NYstyleCheesePizza.class);
        nystyleCheesePizza.prepare();
        nystyleCheesePizza.bake();
//		Pizza pizza = nyStore.orderPizza("cheese");
//		System.out.println("Ethan ordered a "+pizza.getName() + "\n");
//		pizza = chicagoStore.orderPizza("cheese");
//		System.out.println("Joel ordered a " + pizza.getName() + "\n");

    }

}
