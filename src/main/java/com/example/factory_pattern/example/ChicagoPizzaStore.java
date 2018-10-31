package com.example.factory_pattern.example;

public class ChicagoPizzaStore {

	public static Object createPizza(Class<? extends Pizza> clazz){

		Object obj = null;
		try {
			obj = Class.forName(clazz.getName()).newInstance();
			System.out.println("我是"+obj.getClass().getName()+"店铺----->已经被创建成功了");

		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return obj;


//	Pizza createPizza(String item){
//		if(item.equals("cheese")){
//			return new ChicagoStyleCheesePizza();
//	     } else if(item.equals("veggie")){
//			return new ChicagostyleVeggiePizza();
//			}
//	     else if(item.equals("clam")){
//				return new ChicagoStyleCheesePizza();
//				}
//	     else if(item.equals("pepperoni")){
//				return new ChicagostyleVeggiePizza();
//				}
//	     else return null;

	}


}
